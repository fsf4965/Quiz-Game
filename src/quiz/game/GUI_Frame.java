package quiz.game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import javax.swing.*;

public class GUI_Frame extends JFrame implements ActionListener
{
    private javax.swing.JTextField inputTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mainTextArea;
    private javax.swing.JButton playButton;
    private javax.swing.JButton questionButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton ruleButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField titleTextField;
    
    
    public GUI_Frame() 
    {
        jPanel1 = new javax.swing.JPanel();
        titleTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTextArea = new javax.swing.JTextArea();
        inputTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        ruleButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        questionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleTextField.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        titleTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titleTextField.setText("General Quiz Game");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleTextField)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainTextArea.setColumns(20);
        mainTextArea.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        mainTextArea.setRows(5);
        jScrollPane1.setViewportView(mainTextArea);

        inputTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        inputTextField.setText("Type here");
        inputTextField.addActionListener(this);

        submitButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1461, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(inputTextField)
                .addGap(18, 18, 18)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputTextField)
                    .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
        );

        playButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        playButton.setText("Play");
        playButton.addActionListener(this);

        ruleButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ruleButton.setText("Rules");
        ruleButton.addActionListener(this);

        quitButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        quitButton.setText("Quit");
        quitButton.addActionListener(this);

        questionButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        questionButton.setText("Generate Question");
        questionButton.addActionListener(this);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(ruleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(questionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        titleTextField.setEditable(false);
        mainTextArea.setEditable(false);
        
        submitButton.setEnabled(false);
        questionButton.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        ArrayList<Integer> score = new ArrayList<Integer>();
        score.add(0);
        
        Object source = e.getSource();
        if (source == ruleButton) 
        {
            mainTextArea.setText("Welcome to the General Quiz Game!\n" + 
                                    "-----------------------------------------------\n" + 
                                    "Basic rules:\n" + 
                                    "1. Correct answer will award you 100 points\n" +
                                    "2. Wrong answer or Not answering the question will deduct 50 points from your current score\n" + 
                                    "3. That's all! Compete with players on the score boardand have fun!\n" + 
                                    "-----------------------------------------------\n");
        }
        
        if (source == quitButton)
        {
            System.exit(0);
        }
        
        if (source == playButton)
        {
            mainTextArea.setText("Please enter your name: ");
            submitButton.setEnabled(true);
            submitButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    mainTextArea.append(inputTextField.getText() + "\n");
                    String name = inputTextField.getText();
                    inputTextField.setText("");
                    mainTextArea.append("\nPlease enter the category number (Press Enter to select):\n" +
                                        "\nQuiz Categories:\n" +
                                        "1. Movies\n" +
                                        "2. Pop Music\n" +
                                        "3. Mythology\n" +
                                        "4. Computer\n" +
                                        "5. Geography\n" +
                                        "\nOther functions:\n" +
                                        "6. Scoreboard\n");
                    
                    JFrame categoryWindow = new JFrame();
                    String categoryMessage = "Enter your chosen chategory here (number only): \n" +
                                                "NOTE: If you enter an invalid value, simply press Submit to start the game again";
                    String category = JOptionPane.showInputDialog(categoryWindow, categoryMessage);
                    if (category == null) 
                    {
                    // User clicked cancel
                    }
                    
                    else
                    {
                        if(Objects.equals(category, "1"))
                        {
                            mainTextArea.setText("Starting the Movie Quiz!\n");
                            Question_DB database = new Question_DB();
                            ArrayList<Question> questions = new ArrayList<Question>();
                            questions = database.movies();
                            Collections.shuffle(questions);
                            
                            for (int questionNumber = 0; questionNumber <= 4; questionNumber++)
                            {
                                mainTextArea.append("Question ");
                                mainTextArea.append(questionNumber+1 + ": " + questions.get(questionNumber).getQuestion() + "\n");
                                mainTextArea.append("A) " + questions.get(questionNumber).getOptions()[0] + "\n");
                                mainTextArea.append("B) " + questions.get(questionNumber).getOptions()[1] + "\n");
                                mainTextArea.append("C) " + questions.get(questionNumber).getOptions()[2] + "\n");
                                mainTextArea.append("D) " + questions.get(questionNumber).getOptions()[3] + "\n");
                                
                                String correctAnswer = questions.get(questionNumber).getCorrectAnswer();
                                
                                JFrame answerWindow = new JFrame();
                                String answerMessage = "Enter your FULL answer here (Case insensitive): ";
                                String answer = JOptionPane.showInputDialog(answerWindow, answerMessage);
                                if (answer == null) 
                                {
                                    mainTextArea.append("\nYou did not answer!\n\n");
                                    score.set(0, score.get(0) - 50);
                                }
                            
                                else
                                {
                                    if (answer.equalsIgnoreCase(correctAnswer))
                                        {
                                            mainTextArea.append("\nYou got the correct answer!\n\n");
                                            score.set(0, score.get(0) + 100);
                                        }
                                        
                                        else
                                        {
                                            mainTextArea.append("\nYou got the wrong answer!\n\n");
                                            score.set(0, score.get(0) - 50);
                                        }
                                }
                            }
                            
                            mainTextArea.append("\nCongratulations! You've completed the quiz! Here is your record:\n");
                            mainTextArea.append(name + " has earned " + score.get(0));
                            mainTextArea.append("\n\nPress Play to return to Menu and Play again,\nOr press Quit to end the game.");
                            
                            try
                            {
                                Writer writer;
                                writer = new BufferedWriter(new FileWriter("scoreboard.txt", true));
                                writer.append("\n" + name + ": " + score.get(0) + " points");
                                writer.close();
                            } 
                            catch (IOException io) 
                            {
                                System.out.println("An error has occurred.");
                            }
                        }
                        
                        if(Objects.equals(category, "2"))
                        {
                            mainTextArea.setText("Starting the Pop Music Quiz!\n\n");
                            Question_DB database = new Question_DB();
                            ArrayList<Question> questions = new ArrayList<Question>();
                            questions = database.popmusic();
                            Collections.shuffle(questions);
                            
                            for (int questionNumber = 0; questionNumber <= 4; questionNumber++)
                            {
                                mainTextArea.append("Question ");
                                mainTextArea.append(questionNumber+1 + ": " + questions.get(questionNumber).getQuestion() + "\n");
                                mainTextArea.append("A) " + questions.get(questionNumber).getOptions()[0] + "\n");
                                mainTextArea.append("B) " + questions.get(questionNumber).getOptions()[1] + "\n");
                                mainTextArea.append("C) " + questions.get(questionNumber).getOptions()[2] + "\n");
                                mainTextArea.append("D) " + questions.get(questionNumber).getOptions()[3] + "\n");
                                
                                String correctAnswer = questions.get(questionNumber).getCorrectAnswer();
                                
                                JFrame answerWindow = new JFrame();
                                String answerMessage = "Enter your FULL answer here (Case insensitive): ";
                                String answer = JOptionPane.showInputDialog(answerWindow, answerMessage);
                                if (answer == null) 
                                {
                                    mainTextArea.append("\nYou did not answer!\n\n");
                                    score.set(0, score.get(0) - 50);
                                }
                            
                                else
                                {
                                    if (answer.equalsIgnoreCase(correctAnswer))
                                        {
                                            mainTextArea.append("\nYou got the correct answer!\n\n");
                                            score.set(0, score.get(0) + 100);
                                        }
                                        
                                        else
                                        {
                                            mainTextArea.append("\nYou got the wrong answer!\n\n");
                                            score.set(0, score.get(0) - 50);
                                        }
                                }
                            }
                            
                            mainTextArea.append("\nCongratulations! You've completed the quiz! Here is your record:\n");
                            mainTextArea.append(name + " has earned " + score.get(0));
                            mainTextArea.append("\n\nPress Play to return to Menu and Play again,\nOr press Quit to end the game.");
                            
                            try
                            {
                                Writer writer;
                                writer = new BufferedWriter(new FileWriter("scoreboard.txt", true));
                                writer.append("\n" + name + ": " + score.get(0) + " points");
                                writer.close();
                            } 
                            catch (IOException io) 
                            {
                                System.out.println("An error has occurred.");
                            }
                        }
                        
                        if(Objects.equals(category, "3"))
                        {
                            mainTextArea.setText("Starting the Mythology Quiz!\n\n");
                            Question_DB database = new Question_DB();
                            ArrayList<Question> questions = new ArrayList<Question>();
                            questions = database.mythology();
                            Collections.shuffle(questions);
                            
                            for (int questionNumber = 0; questionNumber <= 4; questionNumber++)
                            {
                                mainTextArea.append("Question ");
                                mainTextArea.append(questionNumber+1 + ": " + questions.get(questionNumber).getQuestion() + "\n");
                                mainTextArea.append("A) " + questions.get(questionNumber).getOptions()[0] + "\n");
                                mainTextArea.append("B) " + questions.get(questionNumber).getOptions()[1] + "\n");
                                mainTextArea.append("C) " + questions.get(questionNumber).getOptions()[2] + "\n");
                                mainTextArea.append("D) " + questions.get(questionNumber).getOptions()[3] + "\n");
                                
                                String correctAnswer = questions.get(questionNumber).getCorrectAnswer();
                                
                                JFrame answerWindow = new JFrame();
                                String answerMessage = "Enter your FULL answer here (Case insensitive): ";
                                String answer = JOptionPane.showInputDialog(answerWindow, answerMessage);
                                if (answer == null) 
                                {
                                    mainTextArea.append("\nYou did not answer!\n\n");
                                    score.set(0, score.get(0) - 50);
                                }
                            
                                else
                                {
                                    if (answer.equalsIgnoreCase(correctAnswer))
                                        {
                                            mainTextArea.append("\nYou got the correct answer!\n\n");
                                            score.set(0, score.get(0) + 100);
                                        }
                                        
                                        else
                                        {
                                            mainTextArea.append("\nYou got the wrong answer!\n\n");
                                            score.set(0, score.get(0) - 50);
                                        }
                                }
                            }
                            
                            mainTextArea.append("\nCongratulations! You've completed the quiz! Here is your record:\n");
                            mainTextArea.append(name + " has earned " + score.get(0));
                            mainTextArea.append("\n\nPress Play to return to Menu and Play again,\nOr press Quit to end the game.");
                            
                            try
                            {
                                Writer writer;
                                writer = new BufferedWriter(new FileWriter("scoreboard.txt", true));
                                writer.append("\n" + name + ": " + score.get(0) + " points");
                                writer.close();
                            } 
                            catch (IOException io) 
                            {
                                System.out.println("An error has occurred.");
                            }
                        }
                        
                        if(Objects.equals(category, "4"))
                        {
                            mainTextArea.setText("Starting the Computer Quiz!\n\n");
                            Question_DB database = new Question_DB();
                            ArrayList<Question> questions = new ArrayList<Question>();
                            questions = database.computer();
                            Collections.shuffle(questions);
                            
                            for (int questionNumber = 0; questionNumber <= 4; questionNumber++)
                            {
                                mainTextArea.append("Question ");
                                mainTextArea.append(questionNumber+1 + ": " + questions.get(questionNumber).getQuestion() + "\n");
                                mainTextArea.append("A) " + questions.get(questionNumber).getOptions()[0] + "\n");
                                mainTextArea.append("B) " + questions.get(questionNumber).getOptions()[1] + "\n");
                                mainTextArea.append("C) " + questions.get(questionNumber).getOptions()[2] + "\n");
                                mainTextArea.append("D) " + questions.get(questionNumber).getOptions()[3] + "\n");
                                
                                String correctAnswer = questions.get(questionNumber).getCorrectAnswer();
                                
                                JFrame answerWindow = new JFrame();
                                String answerMessage = "Enter your FULL answer here (Case insensitive): ";
                                String answer = JOptionPane.showInputDialog(answerWindow, answerMessage);
                                if (answer == null) 
                                {
                                    mainTextArea.append("\nYou did not answer!\n\n");
                                    score.set(0, score.get(0) - 50);
                                }
                            
                                else
                                {
                                    if (answer.equalsIgnoreCase(correctAnswer))
                                        {
                                            mainTextArea.append("\nYou got the correct answer!\n\n");
                                            score.set(0, score.get(0) + 100);
                                        }
                                        
                                        else
                                        {
                                            mainTextArea.append("\nYou got the wrong answer!\n\n");
                                            score.set(0, score.get(0) - 50);
                                        }
                                }
                            }
                            
                            mainTextArea.append("\nCongratulations! You've completed the quiz! Here is your record:\n");
                            mainTextArea.append(name + " has earned " + score.get(0));
                            mainTextArea.append("\n\nPress Play to return to Menu and Play again,\nOr press Quit to end the game.");
                            
                            try
                            {
                                Writer writer;
                                writer = new BufferedWriter(new FileWriter("scoreboard.txt", true));
                                writer.append("\n" + name + ": " + score.get(0) + " points");
                                writer.close();
                            } 
                            catch (IOException io) 
                            {
                                System.out.println("An error has occurred.");
                            }
                        }
                        
                        if(Objects.equals(category, "5"))
                        {
                            mainTextArea.setText("Starting the Geography Quiz!\n\n");
                            Question_DB database = new Question_DB();
                            ArrayList<Question> questions = new ArrayList<Question>();
                            questions = database.geography();
                            Collections.shuffle(questions);
                            
                            for (int questionNumber = 0; questionNumber <= 4; questionNumber++)
                            {
                                mainTextArea.append("Question ");
                                mainTextArea.append(questionNumber+1 + ": " + questions.get(questionNumber).getQuestion() + "\n");
                                mainTextArea.append("A) " + questions.get(questionNumber).getOptions()[0] + "\n");
                                mainTextArea.append("B) " + questions.get(questionNumber).getOptions()[1] + "\n");
                                mainTextArea.append("C) " + questions.get(questionNumber).getOptions()[2] + "\n");
                                mainTextArea.append("D) " + questions.get(questionNumber).getOptions()[3] + "\n");
                                
                                String correctAnswer = questions.get(questionNumber).getCorrectAnswer();
                                
                                JFrame answerWindow = new JFrame();
                                String answerMessage = "Enter your FULL answer here (Case insensitive): ";
                                String answer = JOptionPane.showInputDialog(answerWindow, answerMessage);
                                if (answer == null) 
                                {
                                    mainTextArea.append("\nYou did not answer!\n\n");
                                    score.set(0, score.get(0) - 50);
                                }
                            
                                else
                                {
                                    if (answer.equalsIgnoreCase(correctAnswer))
                                        {
                                            mainTextArea.append("\nYou got the correct answer!\n\n");
                                            score.set(0, score.get(0) + 100);
                                        }
                                        
                                        else
                                        {
                                            mainTextArea.append("\nYou got the wrong answer!\n\n");
                                            score.set(0, score.get(0) - 50);
                                        }
                                }
                            }
                            
                            mainTextArea.append("\nCongratulations! You've completed the quiz! Here is your record:\n");
                            mainTextArea.append(name + " has earned " + score.get(0));
                            mainTextArea.append("\n\nPress Play to return to Menu and Play again,\nOr press Quit to end the game.");
                            
                            try
                            {
                                Writer writer;
                                writer = new BufferedWriter(new FileWriter("scoreboard.txt", true));
                                writer.append("\n" + name + ": " + score.get(0) + " points");
                                writer.close();
                            } 
                            catch (IOException io) 
                            {
                                System.out.println("An error has occurred.");
                            }
                        }
                        
                        if(Objects.equals(category, "6"))
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
                    
                                mainTextArea.setText("SCORE BOARD\n");
                                mainTextArea.append("-----------------------------------------------\n");
                                for(int counter = 0; counter < lines.size(); ++counter)
                                {
                                    mainTextArea.append(lines.get(counter) + "\n");
                                }
                                mainTextArea.append("-----------------------------------------------\n");
                            }
                            catch (IOException io)
                            {
                                mainTextArea.setText("An error has occurred.");
                            }
                        }
                    }
                }
            });
        }
    }
}
