package characterStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReaderWriter {
    private static final String dir =
        "D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\characterStream";
    private static final File inputFile = new File(dir, "Input.txt");
    private static final File outputFile = new File(dir, "Output.txt");

    public static void main(String[] args) throws IOException {
        createResource();
//        readerWriterExample();
        readerWriterWithTryWithResources();
    }

    private static void readerWriterWithTryWithResources() {
        try (
            Reader reader = new FileReader(inputFile, StandardCharsets.UTF_8);
            Writer writer = new FileWriter(outputFile);) {
            int charRead = 0;
            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
                writer.write(charRead);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readerWriterExample() {
        //InputStreamReader reader = new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.UTF_8);
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(inputFile, StandardCharsets.UTF_8);
            writer = new FileWriter(outputFile);

            int charRead = 0;
            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
                writer.write(charRead);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void createResource() {
        try {
            outputFile.delete();
            outputFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
