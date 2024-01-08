import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyStringTest {
    private static MyString myString;
    @BeforeAll
    public static void BeforeAll(){
        myString = new MyString();
        System.out.println("Before All");
    }

    @Test
    public void TestReturnNumberOfCharacters(){
        int result = myString.returnNumberOfCharacters("revelion");
        Assertions.assertEquals(8,result);
    }
    @Test
    public void TestConcatenation(){
        String result = myString.concatenation("ana","are","mere");
        Assertions.assertEquals("anaaremere",result);
    }

    @Test
    public void TeststringVocala(){
        boolean result1 = myString.stringVocala("Cacofonie");
        boolean result2 = myString.stringVocala("America");
        Assertions.assertFalse(result1);
        Assertions.assertTrue(result2);
    }

    @Test
    public void TestInvers(){
        String invers = myString.inversCuvant("Craciun");
        Assertions.assertEquals("nuicarC",invers);
    }
}
