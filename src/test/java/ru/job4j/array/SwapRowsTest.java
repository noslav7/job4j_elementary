package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.SwapRows;

import static org.junit.Assert.*;

public class SwapRowsTest {

    @Test
    public void test() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6}
        };
        SwapRows.swap(data, 0, 1);
        assertArrayEquals(
                new int[][] {
                        {4, 5, 6},
                        {1, 2, 3}
                },
                data
        );
    }

}