import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testfindAbsolute() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);

    }

    @Test
    void testfindAbsolute1(){
        int number = 1 ;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    void testfindAbsoluteNegative1(){
        int number = -1;
        int expected =1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    void testfindAbsoluteNegative2(){
        int number = -2;
        int expected =2;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

}