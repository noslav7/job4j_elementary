package array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.Initials;

import static org.junit.Assert.assertEquals;

public class InitialsTest {

    @Test
    public void test() {
        Assert.assertEquals("Иванов И.И.", Initials.convert(new String[] {"Иванов", "Иван", "Иваныч"}));
        assertEquals("Григорьев И.Н.", Initials.convert(new String[] {"Григорьев", "Игорь", "Николаевич"}));
    }

}