package quiz.game;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DialogTest extends JDialog
{
    static int buttonValue = 1;
    int buttonUsed;
    JButton testButton;
    
    public DialogTest(Frame testFrame) 
    {
        testButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                buttonUsed = buttonValue;
            }
        });
    }
    
    @Test
    public void testDialogButton() 
    {
        DialogTest test = new DialogTest(null);
        test.testButton.doClick();
        assertEquals(DialogTest.buttonValue, test.buttonUsed);
    }
    
}
