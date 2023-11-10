import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClimateAnalys {
    public static void main(String[] args) {
        // File
        String filePath = "D:\\Java_projects\\HomeTask06\\src\\measures.txt";

        updateFile(filePath);
    }

    public static void updateFile(String filename) {


        File file = new File(filename);

        if (file.exists() && file.isFile()) {
            try {
                Scanner scan = new Scanner(file);

                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    String[] tokens = line.split(" ");

                    if (tokens.length < 1) {
                        continue;
                    }


                    StringBuilder locationBuilder = new StringBuilder();
                    boolean isLocation = true;

                    for (String token : tokens) {
                        if (isLocation) {
                            locationBuilder.append(token).append(" ");
                        }
                        isLocation = false;

                        if(!token.matches(".*\\d+.")){
                            isLocation = true;
                        }
                    }

                    String location = locationBuilder.toString().replaceAll("\\d", "").trim();

                    int sum = 0;
                    int count = 0;
                    int min = Integer.MAX_VALUE;
                    int max = Integer.MIN_VALUE;

                    for (int i = 1; i < tokens.length; i++) {
                        int temperature;
                        try {
                            temperature = Integer.parseInt(tokens[i]);
                        } catch (NumberFormatException e) {
                            continue;
                        }
                        sum += temperature;
                        count++;
                        if (temperature < min) {
                            min = temperature;
                        }
                        if (temperature > max) {
                            max = temperature;
                        }
                    }


                    if (count > 0) {
                        double average = (double) sum / count;

                        System.out.println("Location: " + location);
                        System.out.println("Average temperature: " + average);
                        System.out.println("Warmest temperature: " + max);
                        System.out.println("Coldest temperature: " + min);


                        int averageExcludingExtremes = (sum - min - max) / (count - 2);
                        System.out.println("Average temperature excluding extremes: " + averageExcludingExtremes);
                        System.out.println();
                    }
                }

            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        } else {
            System.out.println("File wasn't found!");
        }
    }
}