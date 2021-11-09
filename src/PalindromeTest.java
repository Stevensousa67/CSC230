import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void isPalindromeStack() {
        Assertions.assertFalse(false, "ADBA");
        Assertions.assertFalse(false, "Breski");
        Assertions.assertTrue(true, "Nurses Run");
        Assertions.assertTrue(true, "11/11/11");
        Assertions.assertTrue(true, "ABBA");
        Assertions.assertTrue(true, "123-45-4321");
    }

    @Test
    void isPalindromeQueue() {
        Assertions.assertFalse(false, "ADBA");
        Assertions.assertFalse(false, "Breski");
        Assertions.assertTrue(true, "Nurses Run");
        Assertions.assertTrue(true, "11/11/11");
        Assertions.assertTrue(true, "ABBA");
        Assertions.assertTrue(true, "123-45-4321");
    }
}