package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testThatCalculatorCanAdd(){
        //given
        Calculator myCalculator = new Calculator();
        //when
        int result = myCalculator.add(2,6);
        //check /assert
        assertEquals(8, result);

    }

    @Test
    public void testThatCalculatorCanMultiply(){
        Calculator calculator = new Calculator();
        //when
        int result = calculator.multiply(3,4);
        //confirm
        assertEquals(12, result);

    }

    @Test
    public void testThatCalculatorCanSubtract(){
        Calculator calculator = new Calculator();
        //when
        int result = calculator.subtract(2,10);
        //confirm
        assertEquals(8, result);

    }

    @Test
    public void testTheCalculatorCanDivide(){
        Calculator calculator = new Calculator();
        //when
        double result = calculator.divide(35,6);
        //confirm
        assertEquals(5,result);



    }
}
