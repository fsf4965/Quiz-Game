package quiz.game;

public class Mythology extends Question
{
    public Mythology(String question, String[] options, String correct_answer)
    {
        super(question, options, correct_answer);
    }
    
    @Override
    public String getQuestion()
    {
        return question;
    }
    
    @Override
    public String[] getOptions()
    {
        return options;
    }
    
    @Override
    public String getCorrectAnswer()
    {
        return correct_answer;
    }
}
