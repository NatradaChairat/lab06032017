package utility;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GradeCalculatorTest {
    @Test
    public void testCalculate(){
        GradeCalculator gradeCalculator=new GradeCalculator();
        assertThat(gradeCalculator.calculate(25,28,32),is('B'));
        assertThat(gradeCalculator.calculate(25,25,15),is('C'));
        assertThat(gradeCalculator.calculate(25,10,05),is('F'));
        assertThat(gradeCalculator.calculate(30,40,30),is('A'));
        assertThat(gradeCalculator.calculate(30,40,-30),is('U'));
        assertThat(gradeCalculator.calculate(-20,40,30),is('U'));

    }
}