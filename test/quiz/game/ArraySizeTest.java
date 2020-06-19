package quiz.game;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySizeTest 
{
    //Unit Test 1: Testing to make sure that the question arrays are at 10 questions maximum
    @Test
    public void testArray()
    {
        Question_DB test = new Question_DB();
        ArrayList<Question> sizeTest = test.movies();
        assertNotNull(sizeTest);
        assertEquals(sizeTest.size(), 10);
    }
}
