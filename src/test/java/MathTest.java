import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    public void testEquals(){
        Assertions.assertEquals(4, 2+2);
        Assertions.assertTrue(4==2+2);
    }

    @Test
    public void testNotEquals(){
        Assertions.assertFalse(5==2+2);
    }

}
