package array;

import org.junit.Test;
import ru.job4j.array.ArrayChar;

import static org.junit.Assert.*;

public class ArrayCharTest {

        @Test
        public void whenStartWithPrefixThenTrue() {
            char[] word = {'H', 'e', 'l', 'l', 'o'};
            char[] pref = {'H', 'e'};
            boolean result = ArrayChar.startsWith(word, pref);
            assertTrue(result);
        }

        @Test
        public void whenNotStartWithPrefixThenFalse() {
            char[] word = {'H', 'e', 'l', 'l', 'o'};
            char[] pref = {'H', 'i'};
            boolean result = ArrayChar.startsWith(word, pref);
            assertFalse(result);
        }
}