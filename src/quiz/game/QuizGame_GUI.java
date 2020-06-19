package quiz.game;
import java.awt.*;
import javax.swing.*;

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
