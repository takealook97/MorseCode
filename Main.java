import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Output output = new Output();
        output.printInitialOutput();

        while (true) {
            output.printInputOrder();
            String all = br.readLine();
            String[] input;
            if (all.charAt(0) == '·' || all.charAt(0) == '-') {
                input = all.split("  ");
            } else input = all.split("");

            switch (input[0].charAt(0)) {
                case '·', '-' -> output.printText(input);
                default -> output.printMorse(input);
            }
        }
    }
}
