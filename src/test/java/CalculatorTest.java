import org.junit.Ignore;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;
    @BeforeEach
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterEach
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeAll
    public static void initTest(){
        calculator = new Calculator();
    }
    @AfterAll
    public static void afterTest(){
        calculator = null;
    }
    @Test
    public void getSum()throws Exception {
        assertEquals(15, calculator.getSum(8,7));
    }

    @Test
    public void getDivide() throws Exception{
        assertEquals(20, calculator.getDivide(100,5));
    }

    @Test
    public void getMultiply() throws Exception{
        assertEquals(200, calculator.getMultiply(40,5));
    }
}