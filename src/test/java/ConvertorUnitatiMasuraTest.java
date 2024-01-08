import org.junit.jupiter.api.*;

public class ConvertorUnitatiMasuraTest {
    private static ConvertorUnitatiMasura convertor;

@BeforeAll
    public static void beforeMethod(){
        convertor = new ConvertorUnitatiMasura();
        System.out.println("executing BeforeEach method");
    }
@Test
    public void fahrenheitToCelsiusTest(){
        double result = convertor.fahrenheitToCelsius(98.6);
        Assertions.assertEquals(37,Math.round(result),"valorile nu sunt egale");
    }
    @Test
    public void milesToKilometersTest(){
        double result = convertor.milesToKilometers(2);
        Assertions.assertEquals(3.218688, result,0.01);
    }
    @Disabled("Ignoring this test")
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
