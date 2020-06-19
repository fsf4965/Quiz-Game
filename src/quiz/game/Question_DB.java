/*
COMP603 ASSIGNMENT PART 1

Group ID: 20
Members: Duc Dao (18020007), Deni Sarito (17988272)
Project Title: General Quiz Game
*/
package quiz.game;
import java.util.*;

/*This class contains 5 separate ArrayList for each question categories*/
public class Question_DB 
{
    /*Each ArrayList has an element based off the Question class, and contains
      10 questions(and multiple answers)*/
    public ArrayList<Question> movies()
    {
        DB_Connection db = new DB_Connection();
        ArrayList<String> moviesQuestions = db.moviesQuestions();
        ArrayList<String[]> moviesOptions = db.moviesOptions();
        ArrayList<String> moviesAnswer = db.moviesAnswer();
        
        ArrayList<Question> movies = new ArrayList<Question>();
        
        for (int cd = 0; cd <= 9; ++cd)
        {
            movies.add(new Movies(moviesQuestions.get(cd), moviesOptions.get(cd), moviesAnswer.get(cd)));
        }
        
        return movies;
    }
    
    public ArrayList<Question> popmusic()
    {
        DB_Connection db = new DB_Connection();
        ArrayList<String> popmusicQuestions = db.popmusicQuestions();
        ArrayList<String[]> popmusicOptions = db.popmusicOptions();
        ArrayList<String> popmusicAnswer = db.popmusicAnswer();
        
        ArrayList<Question> popmusic = new ArrayList<Question>();
        
        for (int cd = 0; cd <= 9; ++cd)
        {
            popmusic.add(new PopMusic(popmusicQuestions.get(cd), popmusicOptions.get(cd), popmusicAnswer.get(cd)));
        }
        
        return popmusic;
    }
    
    public ArrayList<Question> mythology()
    {
        DB_Connection db = new DB_Connection();
        ArrayList<String> mythologyQuestions = db.mythologyQuestions();
        ArrayList<String[]> mythologyOptions = db.mythologyOptions();
        ArrayList<String> mythologyAnswer = db.mythologyAnswer();
        
        ArrayList<Question> mythology = new ArrayList<Question>();
        
        for (int cd = 0; cd <= 9; ++cd)
        {
            mythology.add(new Mythology(mythologyQuestions.get(cd), mythologyOptions.get(cd), mythologyAnswer.get(cd)));
        }
        
        return mythology;
    }
    
    public ArrayList<Question> computer()
    {
        DB_Connection db = new DB_Connection();
        ArrayList<String> computerQuestions = db.computerQuestions();
        ArrayList<String[]> computerOptions = db.computerOptions();
        ArrayList<String> computerAnswer = db.computerAnswer();
        
        ArrayList<Question> computer = new ArrayList<Question>();
        
        for (int cd = 0; cd <= 9; ++cd)
        {
            computer.add(new Computer(computerQuestions.get(cd), computerOptions.get(cd), computerAnswer.get(cd)));
        }
        
        return computer;
    }
    
    public ArrayList<Question> geography()
    {
        DB_Connection db = new DB_Connection();
        ArrayList<String> geographyQuestions = db.geographyQuestions();
        ArrayList<String[]> geographyOptions = db.geographyOptions();
        ArrayList<String> geographyAnswer = db.geographyAnswer();
        
        ArrayList<Question> geography = new ArrayList<Question>();
        
        for (int cd = 0; cd <= 9; ++cd)
        {
            geography.add(new Geography(geographyQuestions.get(cd), geographyOptions.get(cd), geographyAnswer.get(cd)));
        }
        
        return geography;
    }
}
