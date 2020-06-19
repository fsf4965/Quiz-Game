/*
COMP603 ASSIGNMENT PART 2

Group ID: 20
Members: Duc Dao (18020007), Deni Sarito (17988272)
Project Title: General Quiz Game
*/
package quiz.game;
import java.awt.*;
import javax.swing.*;

/*Main file that runs the GUI_Frame class,
  which is the app and the GUI*/
public class QuizGame_GUI extends JPanel
{
    DB_Connection db = new DB_Connection();
    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
               GUI_Frame frame = new GUI_Frame();
               frame.pack();
               frame.setVisible(true);
          }
    });
    }
}
