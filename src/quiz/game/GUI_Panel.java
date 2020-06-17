package quiz.game;
import java.awt.*;
import javax.swing.*;

public class GUI_Panel extends JPanel
{
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
