package characterStream;

import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class BufferedReaderWriter {
    private static final String dir =
        "D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\characterStream";
    private static final File inputFile = new File(dir, "Input.txt");
    private static final File outputFile = new File(dir, "Output.txt");

    public static void main(String[] args) throws IOException {
        createResource();
        bufferedReadWrite();

    }

    private static void bufferedReadWrite() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));) {
            int charRead = 0;
            Instant start = Instant.now();

            reader.transferTo(writer); //Transfer the whole content
//            while ((charRead = reader.read()) != -1) {
//                writer.write(charRead);
//            }
            Instant end = Instant.now();
            System.out.println(Duration.between(start, end).getSeconds());
        } catch (IOException ex) {

        }
    }

    private static void createResource() throws IOException {
        outputFile.delete();
        outputFile.createNewFile();

    }

}
