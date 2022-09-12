package array;

import org.junit.Test;
import ru.job4j.array.Defragment;

import static org.junit.Assert.*;

public class DefragmentTest {

    @Test
    public void singleFirstNull1() {
        String[] input = {null, "I"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", null};
        assertArrayEquals(expected, result);
    }

    @Test
    public void notFirstNull2() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertArrayEquals(expected, result);
    }

    @Test
    public void firstNull1() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertArrayEquals(expected, result);
    }

    @Test
    public void notAllNull0() {
        String[] input = {null, null, null};
        String[] result = Defragment.compress(input);
        String[] expected = {null, null, null};
        assertArrayEquals(expected, result);
    }

    @Test
    public void notAllAtFirstNull10() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertArrayEquals(expected, result);
    }
}