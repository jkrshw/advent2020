package nz.co.jessek.advent2020;

import java.io.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Day1 {

    public Long computeAnswer1(String fileName) throws IOException {
        BufferedReader reader = IOUtils.getBufferedReader(fileName);

        Set<Long> numbers = new HashSet<>();

        for(String line = reader.readLine(); line != null && !line.isEmpty(); line = reader.readLine()) {
            Long number = Long.valueOf(line);
            Long twin = 2020 - number;
            if (numbers.contains(twin)) {
                return number * twin;
            } else {
                numbers.add(number);
            }
        }

        return null;
    }

    public Long computeAnswer2(String fileName) throws IOException {
        BufferedReader reader = IOUtils.getBufferedReader(fileName);
        Set<Long> numbers = new HashSet<>();
        for(String line = reader.readLine();
            line != null && !line.isEmpty();
            line = reader.readLine()) {
            Long number = Long.valueOf(line);
            numbers.add(number);
        }

        return computeRecursive(3, 2020, numbers);
    }

    public Long computeRecursive(int items, long target, Set<Long> numbers) {
        if (items == 2) {
            for(Long number : numbers ) {
                Long twin = target - number;
                if (numbers.contains(twin)) {
                    return number * twin;
                }
            }
        } else {
            for (Long number : numbers) {
                Long answer = computeRecursive(items - 1, target - number, numbers);
                if (answer != null) {
                    return number * answer;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Answer 1:  " +  new Day1().computeAnswer1("nz/co/jessek/advent2020/day1_input.txt"));
        System.out.println("Answer 2:  " +  new Day1().computeAnswer2("nz/co/jessek/advent2020/day1_input.txt"));
    }


}
