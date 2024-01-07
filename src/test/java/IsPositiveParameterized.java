import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveParameterized {
    @ParameterizedTest
    @ValueSource(ints = {1,3,5,86,100, Integer.MAX_VALUE})
    public void checkIsPositiveParameterized(int number){
        IsPositive checkIsPositive = new IsPositive();
        boolean result = checkIsPositive.checkIsPositive(number);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,-3,-5,-86,-100, Integer.MIN_VALUE})
    public void checkIsNegativeParameterized(int number){
        IsPositive checkIsNegative = new IsPositive();
        boolean result = checkIsNegative.checkIsPositive(number);
        Assertions.assertFalse(result);
    }

}
