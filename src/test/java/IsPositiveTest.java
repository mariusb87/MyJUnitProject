import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class IsPositiveTest {
    @Test
    public void testCheckIsPositive(){
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(6);

        Assertions.assertTrue(result);
    }

    @Test
    public void testCheckIsNegative(){
        IsPositive isNegative = new IsPositive();
        boolean result = isNegative.checkIsPositive(-2);

        Assertions.assertFalse(result);
    }




}
