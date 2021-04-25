package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String path, char c) {
        int sum = 0;
        if (c == '0' || c == '1' || c == 'x') {
            sum = getSum(path, c, sum);
        } else {
            throw new IllegalArgumentException("Wrong char");
        }
        return sum;
    }

    private int getSum(String path, char c, int sum) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            int letter;
            while ((letter = br.read()) != -1) {
                if (letter == c) {
                    sum++;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read", e);
        }
        return sum;
    }
}
