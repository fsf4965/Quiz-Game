/*
COMP603 ASSIGNMENT PART 1

Group ID: 20
Members: Duc Dao (18020007), Deni Sarito (17988272)
Project Title: General Quiz Game
*/
package quiz.game;
import java.util.*;
import java.io.*;

/*Main class that runs the Quiz Game Program*/
public class QuizGameApp 
{
    public static void main(String[] args) 
    {
        /*Scanner to scan input*/
        Scanner scanner = new Scanner(System.in);
        
        /*Score Array to track user's scores*/
        ArrayList<Integer> score = new ArrayList<Integer>();
        score.add(0);
        
        System.out.println("Welcome to the General Quiz Game!");
        System.out.println("---------------------------------");
        System.out.println("Basic rules:");
        System.out.println("1. Correct answer will award you 100 points");
        System.out.println("2. Wrong answer will deduct 50 points from your current score");
        System.out.println("3. That's all! Compete with players on the score boardand have fun!");
        System.out.println("---------------------------------");
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("");
        System.out.println("Please pick a category:");
        System.out.println("1. Movies");
        System.out.println("2. Pop Music");
        System.out.println("3. Mythology");
        System.out.println("4. Computer");
        System.out.println("5. Geography");
        System.out.println("6. Quit");
        
        int category = 0;
        
        try
        {
            category = scanner.nextInt();
            scanner.nextLine(); 
        }
        catch (InputMismatchException e)
        {
            scanner.nextLine(); 
            category = 9;
        }
        
        /*A loop is created to cycle through each category. 
          Category 1-5 are each Quiz category, and 2 new 
          categories are added: 6. Quit Menu and 7. Try Again Menu
          
          6. Quit Menu: will display a score board of every quiz taken,
             then quit the program
          7. Try Again Menu: allows the user to view the score board, 
             and have the option to play another quiz, or quit the game*/
        while (category != 8)
        {
            /*Category 1-5 will have the same functionality, just different questions*/
            if (category == 1)
            {
                System.out.println("Starting the Movie Quiz!");
                Question_DB database = new Question_DB();
                ArrayList<Question> questions = new ArrayList<Question>();
                questions = database.movies();
                Collections.shuffle(questions); /*This will shuffle the ArrayList of questions*/
                
                /*For loop to cycle through each questions in the category 5 times*/
                for (int questionNumber = 0; questionNumber <= 4; questionNumber++)
                {
                    System.out.print("Question ");
                    System.out.println(questionNumber+1 + ": " + questions.get(questionNumber).getQuestion());
                    System.out.println("A) " + questions.get(questionNumber).getOptions()[0]);
                    System.out.println("B) " + questions.get(questionNumber).getOptions()[1]);
                    System.out.println("C) " + questions.get(questionNumber).getOptions()[2]);
                    System.out.println("D) " + questions.get(questionNumber).getOptions()[3]);
                    System.out.println("Your Answer (Please write the full answer): ");
                    String answer = scanner.nextLine();
                    
                    String correctAnswer = questions.get(questionNumber).getCorrectAnswer();
                    
                    if (Objects.equals(answer, correctAnswer))
                    {
                        System.out.println("You got the correct answer!");
                        score.set(0, score.get(0) + 100);
                    }
                
                    else 
                    {
                        System.out.println("You got the wrong answer!");
                        score.set(0, score.get(0) - 50);
                    }
                }
                
                System.out.println("Congratulations! You've completed the quiz! Here is your record:");
                System.out.println(name + " has earned " + score.get(0));
                
                /*File I/O used here to collect user's name and score for
                  the score board. Everytime a quiz is played, user's data
                  will be recorded onto the scoreboard*/
                try
                {
                    Writer writer;
                    writer = new BufferedWriter(new FileWriter("scoreboard.txt", true));
                    writer.append("\n" + name + ": " + score.get(0) + " points");
                    writer.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("An error has occurred.");
                }
                
                category = 7;
            }
            
            else if (category == 2)
            {
                System.out.println("Starting the Pop Music Quiz!");
                Question_DB database = new Question_DB();
                ArrayList<Question> questions = new ArrayList<Question>();
                questions = database.popmusic();
                Collections.shuffle(questions);
                
                for (int questionNumber = 0; questionNumber <= 4; questionNumber++)
                {
                    System.out.print("Question ");
                    System.out.println(questionNumber+1 + ": " + questions.get(questionNumber).getQuestion());
                    System.out.println("A) " + questions.get(questionNumber).getOptions()[0]);
                    System.out.println("B) " + questions.get(questionNumber).getOptions()[1]);
                    System.out.println("C) " + questions.get(questionNumber).getOptions()[2]);
                    System.out.println("D) " + questions.get(questionNumber).getOptions()[3]);
                    System.out.println("Your Answer (Please write the full answer): ");
                    String answer = scanner.nextLine();
                    
                    String correctAnswer = questions.get(questionNumber).getCorrectAnswer();
                    
                    if (Objects.equals(answer, correctAnswer))
                    {
                        System.out.println("You got the correct answer!");
                        score.set(0, score.get(0) + 100);
                    }
                
                    else 
                    {
                        System.out.println("You got the wrong answer!");
                        score.set(0, score.get(0) - 50);
                    }
                }
                
                System.out.println("Congratulations! You've completed the quiz! Here is your record:");
                System.out.println(name + " has earned " + score.get(0));
                
                try
                {
                    Writer writer;
                    writer = new BufferedWriter(new FileWriter("scoreboard.txt", true));
                    writer.append("\n" + name + ": " + score.get(0) + " points");
                    writer.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("An error has occurred.");
                }
                
                category = 7;
            }
            
            else if (category == 3)
            {
                System.out.println("Starting the Mythology Quiz!");
                Question_DB database = new Question_DB();
                ArrayList<Question> questions = new ArrayList<Question>();
                questions = database.mythology();
                Collections.shuffle(questions);
                
                for (int questionNumber = 0; questionNumber <= 4; questionNumber++)
                {
                    System.out.print("Question ");
                    System.out.println(questionNumber+1 + ": " + questions.get(questionNumber).getQuestion());
                    System.out.println("A) " + questions.get(questionNumber).getOptions()[0]);
                    System.out.println("B) " + questions.get(questionNumber).getOptions()[1]);
                    System.out.println("C) " + questions.get(questionNumber).getOptions()[2]);
                    System.out.println("D) " + questions.get(questionNumber).getOptions()[3]);
                    System.out.println("Your Answer (Please write the full answer): ");
                    String answer = scanner.nextLine();
                    
                    String correctAnswer = questions.get(questionNumber).getCorrectAnswer();
                    
                    if (Objects.equals(answer, correctAnswer))
                    {
                        System.out.println("You got the correct answer!");
                        score.set(0, score.get(0) + 100);
                    }
                
                    else 
                    {
                        System.out.println("You got the wrong answer!");
                        score.set(0, score.get(0) - 50);
                    }
                }
                
                System.out.println("Congratulations! You've completed the quiz! Here is your record:");
                System.out.println(name + " has earned " + score.get(0));
                
                try
                {
                    Writer writer;
                    writer = new BufferedWriter(new FileWriter("scoreboard.txt", true));
                    writer.append("\n" + name + ": " + score.get(0) + " points");
                    writer.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("An error has occurred.");
                }
                
                category = 7;
            }
            
            else if (category == 4)
            {
                System.out.println("Starting the Computer Quiz!");
                Question_DB database = new Question_DB();
                ArrayList<Question> questions = new ArrayList<Question>();
                questions = database.computer();
                Collections.shuffle(questions);
                
                for (int questionNumber = 0; questionNumber <= 4; questionNumber++)
                {
                    System.out.print("Question ");
                    System.out.println(questionNumber+1 + ": " + questions.get(questionNumber).getQuestion());
                    System.out.println("A) " + questions.get(questionNumber).getOptions()[0]);
                    System.out.println("B) " + questions.get(questionNumber).getOptions()[1]);
                    System.out.println("C) " + questions.get(questionNumber).getOptions()[2]);
                    System.out.println("D) " + questions.get(questionNumber).getOptions()[3]);
                    System.out.println("Your Answer (Please write the full answer): ");
                    String answer = scanner.nextLine();
                    
                    String correctAnswer = questions.get(questionNumber).getCorrectAnswer();
                    
                    if (Objects.equals(answer, correctAnswer))
                    {
                        System.out.println("You got the correct answer!");
                        score.set(0, score.get(0) + 100);
                    }
                
                    else 
                    {
                        System.out.println("You got the wrong answer!");
                        score.set(0, score.get(0) - 50);
                    }
                }
                
                System.out.println("Congratulations! You've completed the quiz! Here is your record:");
                System.out.println(name + " has earned " + score.get(0));
                
                try
                {
                    Writer writer;
                    writer = new BufferedWriter(new FileWriter("scoreboard.txt", true));
                    writer.append("\n" + name + ": " + score.get(0) + " points");
                    writer.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("An error has occurred.");
                }
                
                category = 7;
            }
            
            else if (category == 5)
            {
                System.out.println("Starting the Geography Quiz!");
                Question_DB database = new Question_DB();
                ArrayList<Question> questions = new ArrayList<Question>();
                questions = database.geography();
                Collections.shuffle(questions);
                
                for (int questionNumber = 0; questionNumber <= 4; questionNumber++)
                {
                    System.out.print("Question ");
                    System.out.println(questionNumber+1 + ": " + questions.get(questionNumber).getQuestion());
                    System.out.println("A) " + questions.get(questionNumber).getOptions()[0]);
                    System.out.println("B) " + questions.get(questionNumber).getOptions()[1]);
                    System.out.println("C) " + questions.get(questionNumber).getOptions()[2]);
                    System.out.println("D) " + questions.get(questionNumber).getOptions()[3]);
                    System.out.println("Your Answer (Please write the full answer): ");
                    String answer = scanner.nextLine();
                    
                    String correctAnswer = questions.get(questionNumber).getCorrectAnswer();
                    
                    if (Objects.equals(answer, correctAnswer))
                    {
                        System.out.println("You got the correct answer!");
                        score.set(0, score.get(0) + 100);
                    }
                
                    else 
                    {
                        System.out.println("You got the wrong answer!");
                        score.set(0, score.get(0) - 50);
                    }
                }
                
                System.out.println("Congratulations! You've completed the quiz! Here is your record:");
                System.out.println(name + " has earned " + score.get(0));
                
                try
                {
                    Writer writer;
                    writer = new BufferedWriter(new FileWriter("scoreboard.txt", true));
                    writer.append("\n" + name + ": " + score.get(0) + " points");
                    writer.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("An error has occurred.");
                }
                
                category = 7;
            }
            
            /*The Quit Menu displays the scoreboard by reading exisiting text file 
              "scoreboard.txt", and then saving each line of the file into a String 
              ArrayList. The text file can now be printed onto the console.
            
              As the main While Loop are only for Case 1-7, setting the category 
              to 8 will end the program*/
            else if (category == 6)
            {
                try
                {
                    FileReader reader = new FileReader("scoreboard.txt");
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    ArrayList<String> lines = new ArrayList<String>();
                    String line = null;
                    
                    while ((line = bufferedReader.readLine()) != null)
                    {
                        lines.add(line);
                    }
                    bufferedReader.close();
                    
                    Collections.sort(lines);
                    
                    System.out.println("");
                    System.out.println("SCORE BOARD");
                    System.out.println("---------------------------------");
                    for(int counter = 0; counter < lines.size(); ++counter)
                    {
                        System.out.println(lines.get(counter));
                    }
                    System.out.println("---------------------------------");
                    
                    category = 8;
                }
                catch (IOException e)
                {
                    System.out.println("An error has occurred.");
                    category = 8;
                }
                
            }
            
            /*The Try Again Menu offers the user to try another quiz, or end the game.
              If the user choses to try again. they will be asked to pick a category.
            
              If the user choses to quit, a scoreboard (same functionality as Category 6)
              will be displayed and the game will end*/
            else if (category == 7)
            {
                System.out.println("Would you like to try another quiz? (Enter Y to continue, or N to quit)");
                char yesORno = scanner.next().charAt(0);
                
                if (yesORno == 'N')
                {
                    try
                    {
                        FileReader reader = new FileReader("scoreboard.txt");
                        BufferedReader bufferedReader = new BufferedReader(reader);
                        ArrayList<String> lines = new ArrayList<String>();
                        String line = null;
                    
                        while ((line = bufferedReader.readLine()) != null)
                        {
                            lines.add(line);
                        }
                        bufferedReader.close();
                    
                        Collections.sort(lines);
                    
                        System.out.println("");
                        System.out.println("SCORE BOARD");
                        System.out.println("---------------------------------");
                        for(int counter = 0; counter < lines.size(); ++counter)
                        {
                            System.out.println(lines.get(counter));
                        }
                        System.out.println("---------------------------------");
                        
                        category = 8;
                    }
                    catch (IOException e)
                    {
                        System.out.println("An error has occurred.");
                        category = 8;
                    }
                }
                
                else if (yesORno == 'Y')
                {
                    System.out.println("");
                    System.out.println("Please pick a category:");
                    System.out.println("1. Movies");
                    System.out.println("2. Pop Music");
                    System.out.println("3. Mythology");
                    System.out.println("4. Computer");
                    System.out.println("5. Geography");
                    System.out.println("6. Quit");
                    
                    try
                    {
                        category = scanner.nextInt();
                        scanner.nextLine(); 
                    }
                    catch (InputMismatchException e)
                    {
                        scanner.nextLine(); 
                        category = 9;
                    }
                }
            }
            
            else if (category == 9)
            {
                System.out.println("");
                System.out.println("Invalid input, please try again");
                System.out.println("");
                System.out.println("Please pick a category:");
                System.out.println("1. Movies");
                System.out.println("2. Pop Music");
                System.out.println("3. Mythology");
                System.out.println("4. Computer");
                System.out.println("5. Geography");
                System.out.println("6. Quit");
                
                try
                    {
                        category = scanner.nextInt();
                        scanner.nextLine(); 
                    }
                    catch (InputMismatchException e)
                    {
                        scanner.nextLine(); 
                        category = 9;
                    }
            }
        }
    }
}
