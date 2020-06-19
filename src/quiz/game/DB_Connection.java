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

public class DB_Connection 
{
    private static final String driver = "org.apache.derby.jdbc.ClientDriver";
    private static final String jdbc_url = "jdbc:derby://localhost:1527/QuestionDB";
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
    
    public ArrayList<String> moviesQuestions()
    {
        ArrayList<String> moviesQuestions = new ArrayList<String>();
        try
        {
            Statement statement = this.connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT QUESTION FROM MOVIES");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT OPTION1, OPTION2, OPTION3, OPTION4 FROM MOVIES");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT CORRECT_ANSWER1 FROM MOVIES");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT QUESTION FROM POPMUSIC");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT OPTION1, OPTION2, OPTION3, OPTION4 FROM POPMUSIC");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT CORRECT_ANSWER1 FROM POPMUSIC");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT QUESTION FROM MYTHOLOGY");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT OPTION1, OPTION2, OPTION3, OPTION4 FROM MYTHOLOGY");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT CORRECT_ANSWER1 FROM MYTHOLOGY");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT QUESTION FROM COMPUTER");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT OPTION1, OPTION2, OPTION3, OPTION4 FROM COMPUTER");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT CORRECT_ANSWER1 FROM COMPUTER");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT QUESTION FROM GEOGRAPHY");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT OPTION1, OPTION2, OPTION3, OPTION4 FROM GEOGRAPHY");
            
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
            ResultSet resultSet = statement.executeQuery("SELECT CORRECT_ANSWER1 FROM GEOGRAPHY");
            
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
