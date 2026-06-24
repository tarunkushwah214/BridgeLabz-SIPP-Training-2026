import java.io.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true)) // append mode
        ) {

            String line;

            bw.write("\n========== REPORT CARD ==========\n");

            while ((line = br.readLine()) != null) {

                // Input format:
                // Name Marks1 Marks2 Marks3
                String[] data = line.split(" ");

                String name = data[0];
                int mark1 = Integer.parseInt(data[1]);
                int mark2 = Integer.parseInt(data[2]);
                int mark3 = Integer.parseInt(data[3]);

                double average = (mark1 + mark2 + mark3) / 3.0;

                // Write formatted report
                bw.write("Student Name : " + name + "\n");
                bw.write("Marks        : " + mark1 + ", " + mark2 + ", " + mark3 + "\n");
                bw.write("Average      : " + String.format("%.2f", average) + "\n");
                bw.write("---------------------------------\n");
            }

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found!");
        } catch (IOException e) {
            System.out.println("Error while reading/writing file.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid marks format in input file.");
        }
    }
}