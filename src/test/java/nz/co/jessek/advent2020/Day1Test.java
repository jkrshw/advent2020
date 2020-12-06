package nz.co.jessek.advent2020;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day1Test {
    Day1 day1Test = new Day1();

    @Test
    public void testExample() throws IOException {
        Long actual = day1Test.computeAnswer1("nz/co/jessek/advent2020/day1_example.txt");
        assertEquals(514579, actual);
    }

    @Test
    public void testExample2() throws IOException {
        Long actual = day1Test.computeAnswer2("nz/co/jessek/advent2020/day1_example.txt");
        assertEquals(241861950, actual);
    }
}