/*
COMP603 ASSIGNMENT PART 2

Group ID: 20
Members: Duc Dao (18020007), Deni Sarito (17988272)
Project Title: General Quiz Game
*/
package quiz.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.EmbeddedDriver;

/*Setting up connection to the embedded database*/
public class DB_Connection 
{
    private static final String driver = "org.apache.derby.jdbc.ClientDriver";
    private static final String jdbc_url = "jdbc:derby:QuestionDB;create=true";
    private static final String username = "fsf4965";
    private static final String password = "welcome";
    
    Connection connect;
    
    public DB_Connection()
    {
        try
        {
            this.connect = DriverManager.getConnection(jdbc_url, username, password);
            if (this.connect != null)
            {
                System.out.println("Connected to Database");
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*Creating the tables that will contain questions using SQL commands.
      Should only be run once as tables will be created and saved.*/
    public void createTable()
    {
        try
        {
            connect.createStatement().execute("CREATE TABLE Q_MOVIES(QUESTION VARCHAR(255), OPTION1 VARCHAR(100), OPTION2 VARCHAR(100), OPTION3 VARCHAR(100), OPTION4 VARCHAR(100), CORRECT_ANSWER1 VARCHAR(100))");
            connect.createStatement().execute("CREATE TABLE Q_POPMUSIC(QUESTION VARCHAR(255), OPTION1 VARCHAR(100), OPTION2 VARCHAR(100), OPTION3 VARCHAR(100), OPTION4 VARCHAR(100), CORRECT_ANSWER1 VARCHAR(100))");
            connect.createStatement().execute("CREATE TABLE Q_MYTHOLOGY(QUESTION VARCHAR(255), OPTION1 VARCHAR(100), OPTION2 VARCHAR(100), OPTION3 VARCHAR(100), OPTION4 VARCHAR(100), CORRECT_ANSWER1 VARCHAR(100))");
            connect.createStatement().execute("CREATE TABLE Q_COMPUTER(QUESTION VARCHAR(255), OPTION1 VARCHAR(100), OPTION2 VARCHAR(100), OPTION3 VARCHAR(100), OPTION4 VARCHAR(100), CORRECT_ANSWER1 VARCHAR(100))");
            connect.createStatement().execute("CREATE TABLE Q_GEOGRAPHY(QUESTION VARCHAR(255), OPTION1 VARCHAR(100), OPTION2 VARCHAR(100), OPTION3 VARCHAR(100), OPTION4 VARCHAR(100), CORRECT_ANSWER1 VARCHAR(100))");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*Insert methods into each category using SQL commands.*/
    public void insertIntoMovies(String question, String option1, String option2, String option3, String option4, String answer)
    {
        try 
        {
            connect.createStatement().execute("INSERT INTO Q_MOVIES VALUES ('"+question+"', '"+option1+"', '"+option2+"', '"+option3+"', '"+option4+"', '"+answer+"')");
        } catch (SQLException ex) 
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertIntoPopMusic(String question, String option1, String option2, String option3, String option4, String answer)
    {
        try 
        {
            connect.createStatement().execute("INSERT INTO Q_POPMUSIC VALUES ('"+question+"', '"+option1+"', '"+option2+"', '"+option3+"', '"+option4+"', '"+answer+"')");
        } catch (SQLException ex) 
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertIntoMythology(String question, String option1, String option2, String option3, String option4, String answer)
    {
        try 
        {
            connect.createStatement().execute("INSERT INTO Q_MYTHOLOGY VALUES ('"+question+"', '"+option1+"', '"+option2+"', '"+option3+"', '"+option4+"', '"+answer+"')");
        } catch (SQLException ex) 
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertIntoComputer(String question, String option1, String option2, String option3, String option4, String answer)
    {
        try 
        {
            connect.createStatement().execute("INSERT INTO Q_COMPUTER VALUES ('"+question+"', '"+option1+"', '"+option2+"', '"+option3+"', '"+option4+"', '"+answer+"')");
        } catch (SQLException ex) 
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertIntoGeography(String question, String option1, String option2, String option3, String option4, String answer)
    {
        try 
        {
            connect.createStatement().execute("INSERT INTO Q_GEOGRAPHY VALUES ('"+question+"', '"+option1+"', '"+option2+"', '"+option3+"', '"+option4+"', '"+answer+"')");
        } catch (SQLException ex) 
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*Main method used to test connection and run createTable() once*/
    public static void main(String[] args)
    {
        DB_Connection db = new DB_Connection();
        //db.createTable();
    }
    
    /*Methods to insert data from tables into a String Array.
      Because the Question class contains a String for Questions,
      String array for 4 options, and a String for answer,
      each category will have 3 methods each: questions, options, and correct answer*/
    public ArrayList<String> moviesQuestions()
    {
        ArrayList<String> moviesQuestions = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT QUESTION FROM Q_MOVIES");
            
            while(resultSet.next())
            {
                moviesQuestions.add(resultSet.getString("QUESTION"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return moviesQuestions;
    }
    
    public ArrayList<String[]> moviesOptions()
    {
        ArrayList<String[]> moviesOptions = new ArrayList<String[]>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT OPTION1, OPTION2, OPTION3, OPTION4 FROM Q_MOVIES");
            
            while(resultSet.next())
            {
                moviesOptions.add(new String[]{resultSet.getString("OPTION1"), resultSet.getString("OPTION2"), resultSet.getString("OPTION3"), resultSet.getString("OPTION4")});
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return moviesOptions;
    }
    
    public ArrayList<String> moviesAnswer()
    {
        ArrayList<String> moviesAnswer = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CORRECT_ANSWER1 FROM Q_MOVIES");
            
            while(resultSet.next())
            {
                moviesAnswer.add(resultSet.getString("CORRECT_ANSWER1"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return moviesAnswer;
    }
    
    
    public ArrayList<String> popmusicQuestions()
    {
        ArrayList<String> popmusicQuestions = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT QUESTION FROM Q_POPMUSIC");
            
            while(resultSet.next())
            {
                popmusicQuestions.add(resultSet.getString("QUESTION"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return popmusicQuestions;
    }
    
    public ArrayList<String[]> popmusicOptions()
    {
        ArrayList<String[]> popmusicOptions = new ArrayList<String[]>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT OPTION1, OPTION2, OPTION3, OPTION4 FROM Q_POPMUSIC");
            
            while(resultSet.next())
            {
                popmusicOptions.add(new String[]{resultSet.getString("OPTION1"), resultSet.getString("OPTION2"), resultSet.getString("OPTION3"), resultSet.getString("OPTION4")});
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return popmusicOptions;
    }
    
    public ArrayList<String> popmusicAnswer()
    {
        ArrayList<String> popmusicAnswer = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CORRECT_ANSWER1 FROM Q_POPMUSIC");
            
            while(resultSet.next())
            {
                popmusicAnswer.add(resultSet.getString("CORRECT_ANSWER1"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return popmusicAnswer;
    }
    
    
    public ArrayList<String> mythologyQuestions()
    {
        ArrayList<String> mythologyQuestions = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT QUESTION FROM Q_MYTHOLOGY");
            
            while(resultSet.next())
            {
                mythologyQuestions.add(resultSet.getString("QUESTION"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mythologyQuestions;
    }
    
    public ArrayList<String[]> mythologyOptions()
    {
        ArrayList<String[]> mythologyOptions = new ArrayList<String[]>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT OPTION1, OPTION2, OPTION3, OPTION4 FROM Q_MYTHOLOGY");
            
            while(resultSet.next())
            {
                mythologyOptions.add(new String[]{resultSet.getString("OPTION1"), resultSet.getString("OPTION2"), resultSet.getString("OPTION3"), resultSet.getString("OPTION4")});
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mythologyOptions;
    }
    
    public ArrayList<String> mythologyAnswer()
    {
        ArrayList<String> mythologyAnswer = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CORRECT_ANSWER1 FROM Q_MYTHOLOGY");
            
            while(resultSet.next())
            {
                mythologyAnswer.add(resultSet.getString("CORRECT_ANSWER1"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mythologyAnswer;
    }
    
    
    public ArrayList<String> computerQuestions()
    {
        ArrayList<String> computerQuestions = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT QUESTION FROM Q_COMPUTER");
            
            while(resultSet.next())
            {
                computerQuestions.add(resultSet.getString("QUESTION"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return computerQuestions;
    }
    
    public ArrayList<String[]> computerOptions()
    {
        ArrayList<String[]> computerOptions = new ArrayList<String[]>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT OPTION1, OPTION2, OPTION3, OPTION4 FROM Q_COMPUTER");
            
            while(resultSet.next())
            {
                computerOptions.add(new String[]{resultSet.getString("OPTION1"), resultSet.getString("OPTION2"), resultSet.getString("OPTION3"), resultSet.getString("OPTION4")});
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return computerOptions;
    }
    
    public ArrayList<String> computerAnswer()
    {
        ArrayList<String> computerAnswer = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CORRECT_ANSWER1 FROM Q_COMPUTER");
            
            while(resultSet.next())
            {
                computerAnswer.add(resultSet.getString("CORRECT_ANSWER1"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return computerAnswer;
    }
    
    
    public ArrayList<String> geographyQuestions()
    {
        ArrayList<String> geographyQuestions = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT QUESTION FROM Q_GEOGRAPHY");
            
            while(resultSet.next())
            {
                geographyQuestions.add(resultSet.getString("QUESTION"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return geographyQuestions;
    }
    
    public ArrayList<String[]> geographyOptions()
    {
        ArrayList<String[]> geographyOptions = new ArrayList<String[]>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT OPTION1, OPTION2, OPTION3, OPTION4 FROM Q_GEOGRAPHY");
            
            while(resultSet.next())
            {
                geographyOptions.add(new String[]{resultSet.getString("OPTION1"), resultSet.getString("OPTION2"), resultSet.getString("OPTION3"), resultSet.getString("OPTION4")});
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return geographyOptions;
    }
    
    public ArrayList<String> geographyAnswer()
    {
        ArrayList<String> geographyAnswer = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CORRECT_ANSWER1 FROM Q_GEOGRAPHY");
            
            while(resultSet.next())
            {
                geographyAnswer.add(resultSet.getString("CORRECT_ANSWER1"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return geographyAnswer;
    }
}
