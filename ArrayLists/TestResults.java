import java.util.ArrayList;
public class TestResults
{
    private ArrayList<StudentAnswerSheet> sheets;
    
    public String highestScoringStudent(ArrayList<String> key)
    {
        StudentAnswerSheet highest = new StudentAnswerSheet();
        double highestScore = 0.0;
        for (StudentAnswerSheet a : sheets)
            if (a.getScore(key) > highestScore) {
                highest = a;
                highestScore = a.getScore(key);
            }
        return highest.getName();
    }
}