package nz.co.jessek.advent2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class IOUtils {

    public static BufferedReader getBufferedReader(String fileName) {
        InputStream cpResource = IOUtils.class.getClassLoader().getResourceAsStream(fileName);
        Objects.requireNonNull(cpResource, "Not Found: " + fileName);
        return new BufferedReader(new InputStreamReader(cpResource));
    }

}
