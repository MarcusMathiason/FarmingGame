package org.reek;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {

    private Utils() {

    }

    public static String readFile(String filePath) {
        try (InputStream in = Utils.class.getResourceAsStream(filePath)) {
            if (in == null) {
                throw new RuntimeException("Resource not found: " + filePath);
            }
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e); }
    }
}
