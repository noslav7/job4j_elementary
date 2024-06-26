package ru.job4j.array;
import org.junit.Test;
import ru.job4j.array.SumWithStopEl;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumWithStopElTest {

    @Test
    public void countNotEven() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rsl = SumWithStopEl.count(data, 7);
        assertThat(rsl, is(0));
    }

    @Test
    public void countEven() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rsl = SumWithStopEl.count(data, 5);
        assertThat(rsl, is(10));
    }

}