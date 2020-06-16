/*
COMP603 ASSIGNMENT PART 1

Group ID: 20
Members: Duc Dao (18020007), Deni Sarito (17988272)
Project Title: General Quiz Game
*/
package quiz.game;

/*Question class that has a String for questions, a String array for 
  4 possible answers, and a String for the correct answer.*/
public abstract class Question 
{
    protected String question;
    protected String[] options;
    protected String correct_answer;
    
    public Question(String question, String[] options, String correct_answer)
    {
        this.question = question;
        this.options = options;
        this.correct_answer = correct_answer;
    }
    
    /*Included are get methods to call and retrieve these items in the app itself*/
    public abstract String getQuestion();
    public abstract String[] getOptions();
    public abstract String getCorrectAnswer();
}
