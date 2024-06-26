package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.SymmetricDiff;

import static org.junit.Assert.assertArrayEquals;

public class SymmetricDiffTest {

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[] {}, SymmetricDiff.diff(new int[] {}, new int[] {}));
        assertArrayEquals(new int[] {1}, SymmetricDiff.diff(new int[] {1}, new int[] {}));
        assertArrayEquals(new int[] {1}, SymmetricDiff.diff(new int[] {}, new int[] {1}));
        assertArrayEquals(new int[] {}, SymmetricDiff.diff(new int[] {1}, new int[] {1}));
        assertArrayEquals(new int[] {1, 3}, SymmetricDiff.diff(new int[] {1, 2}, new int[] {2, 3}));
        assertArrayEquals(new int[] {1, 2, 3, 4}, SymmetricDiff.diff(new int[] {1, 2}, new int[] {3, 4}));
    }
}