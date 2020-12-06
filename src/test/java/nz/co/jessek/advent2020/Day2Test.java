package nz.co.jessek.advent2020;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day2Test {
    Day2 day2Test = new Day2();

    @Test
    public void testExample() throws IOException {
        Long actual = day2Test.computeAnswer1("nz/co/jessek/advent2020/day2_example.txt");
        assertEquals(2, actual);
    }

    @Test
    public void testExample2() throws IOException {
        Long actual = day2Test.computeAnswer2("nz/co/jessek/advent2020/day2_example.txt");
        assertEquals(1, actual);
    }

}