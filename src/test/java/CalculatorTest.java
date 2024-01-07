import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {

    private static Calculator calculator;
    @BeforeAll
    public static void beforeAllMethod(){
        calculator = new Calculator();
        System.out.println("Before all");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before each");
    }

    @Test
    public void addTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.add(3,6);
        Assertions.assertEquals(result,9);
    }
    @Test
    public void diffTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.dif(6,3);
        Assertions.assertEquals(result,3);
    }
    @Test
    public void multiplyTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.multiply(6,3);
        Assertions.assertEquals(result,18);
    }

    @Test
    public void divideTest(){
        //Calculator calculator = new Calculator();
        double result = calculator.divide(6,3);
        Assertions.assertEquals(result,2);
    }
    @AfterEach
    public void afterEach(){
        System.out.println("After each");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("After all");
    }

}
