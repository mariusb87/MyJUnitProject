import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConvertorUnitatiMasuraTest {
    private static ConvertorUnitatiMasura convertor;

@BeforeEach
    public void beforeMethod(){
        convertor = new ConvertorUnitatiMasura();
        System.out.println("executing BeforeEach method");
    }
@Test
    public void fahrenheitToCelsiusTest(){
        double result = convertor.fahrenheitToCelsius(20);
        Assertions.assertEquals(-7,Math.round(result));
    }
    @Test
    public void milesToKilometersTest(){
        double result = convertor.milesToKilometers(2);
        Assertions.assertEquals(3.218688, result);
    }
    @Test
    public void poundsToKilograms(){
        double result = convertor.poundsToKilograms(7);
        Assertions.assertEquals(3.17514659, result);
    }
    @Test
    public void gallonsToLiters(){
        double result = convertor.gallonsToLiters(5);
        Assertions.assertEquals(18.92705892, result);
    }
@AfterEach
    public void afterEach(){
        System.out.println("executing AfterEach method");
    }

}
