import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class J07002_TinhTong {
    public static void main(String[] args) {
        int sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("DATA.in"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");

                for (String part : parts) {
                    try {
                        int number = Integer.parseInt(part);
                        sum += number;
                    } catch (NumberFormatException e) {
                    }
                }
            }

            System.out.println(sum);

        } catch (IOException e) {
        }
    }
}
