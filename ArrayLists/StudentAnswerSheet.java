import java.util.ArrayList;
public class StudentAnswerSheet
{
    private ArrayList<String> answers;
    private String name;
    
    public double getScore(ArrayList<String> key)
    {
        double score = 0.0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i) == key.get(i))
                score += 1;
            else if (answers.get(i) != "?")
                score -= 0.25;
        }
        return score;
    }
    
    public String getName()
    {
        return name;
    }
}