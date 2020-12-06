package nz.co.jessek.advent2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day2 {

    public Long computeAnswer1(String fileName) throws IOException {
        BufferedReader reader = IOUtils.getBufferedReader(fileName);
        long count = 0;
        Pattern p = Pattern.compile("(\\d+)-(\\d+) (\\w): (\\w+)");
        for(String line = reader.readLine(); line != null && !line.isEmpty(); line = reader.readLine()) {

            Matcher matcher = p.matcher(line);
            if (!matcher.find()) {
                throw new RuntimeException("line didn't match expected pattern");
            }
            Integer min = Integer.valueOf(matcher.group(1));
            Integer max = Integer.valueOf(matcher.group(2));
            String character = matcher.group(3);
            String password = matcher.group(4);

            long matches = Pattern.compile(character). matcher(password).results().count();
            if (min <= matches && matches <= max) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) throws IOException {
        System.out.println("Answer 1: " + new Day2().computeAnswer1("nz/co/jessek/advent2020/day2_input.txt"));
        System.out.println("Answer 2: " + new Day2().computeAnswer2("nz/co/jessek/advent2020/day2_input.txt"));
    }

    public Long computeAnswer2(String fileName) throws IOException {
        BufferedReader reader = IOUtils.getBufferedReader(fileName);
        long count = 0;
        Pattern p = Pattern.compile("(\\d+)-(\\d+) (\\w): (\\w+)");
        for(String line = reader.readLine(); line != null && !line.isEmpty(); line = reader.readLine()) {

            Matcher matcher = p.matcher(line);
            if (!matcher.find()) {
                throw new RuntimeException("line didn't match expected pattern");
            }
            Integer pos1 = Integer.valueOf(matcher.group(1));
            Integer pos2 = Integer.valueOf(matcher.group(2));
            String character = matcher.group(3);
            String password = matcher.group(4);

            if (password.length() >= pos2) {
                String char1 = "" + password.charAt(pos1 - 1);
                String char2 = "" + password.charAt(pos2 - 1);
                if (char1.equals(character) ^ char2.equals(character)) {
                    count++;
                }
            }
        }

        return count;
    }
}
