package chapter12_collections;

import java.util.HashMap;
import java.util.Map;

public class TestScoreCalculator
{
    public static void main(String[] args)
    {
        var originalGrades = TestResults.getOriginalGrades();
        var makeUpGrades = TestResults.getMakeUpGrades();

        TestScoreCalculator calc = new TestScoreCalculator();
        var finalGrades = calc.getFinalScores(originalGrades, makeUpGrades);
        System.out.println(finalGrades);
    }

    public Map<String, Integer> getFinalScores(Map<String, Integer> originalGrades, Map<String, Integer> makeUpGrades)
    {
        Map <String, Integer> finalGrades = new HashMap<>();

        for (var gradesByStudents: makeUpGrades.entrySet())
        {
            Integer originalGrade = originalGrades.get(gradesByStudents.getKey());
            Integer newGrade = makeUpGrades.get(gradesByStudents.getKey());

            if (originalGrade >= newGrade)
            {
                finalGrades.put(gradesByStudents.getKey(), originalGrade);
            }
            else
            {
                finalGrades.put(gradesByStudents.getKey(), newGrade);
            }
        }

        return finalGrades;
    }
}
