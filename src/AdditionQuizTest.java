import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Assert;
public class AdditionQuizTest   {
    AdditionQuiz add = new AdditionQuiz();
    @org.junit.Test

    public void  addrand() throws Exception {
        int i = 0;
        while ( i <= 10) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
         //   System.out.println("the expected result is " + expected_result);
            Assert.assertEquals(3,add.addrand(number1, number2));
            i++;
        }
    }
}