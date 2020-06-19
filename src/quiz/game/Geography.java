/*
COMP603 ASSIGNMENT PART 2

Group ID: 20
Members: Duc Dao (18020007), Deni Sarito (17988272)
Project Title: General Quiz Game
*/
package quiz.game;

/*Geography subclass of Question that has a String for questions, a String array for 
  4 possible answers, and a String for the correct answer.*/
public class Geography extends Question
{
    public Geography(String question, String[] options, String correct_answer)
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
