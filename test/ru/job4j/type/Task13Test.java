package ru.job4j.type;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task13Test {

    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task13.main(null);
        String expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()
        )
                .add("11.1")
                .add("10.9")
                .add("110")
                .add("1.1")
                .toString();
        assertThat(out.toString(), is(expected));
    }

}