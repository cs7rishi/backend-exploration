package characterStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Example of Read/Write from file
 * Used Buffer reading for performance optimization
 */
public class FileReaderWriter {
    private static final String dir =
        "D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\characterStream";
    private static final File inputFile = new File(dir, "Input.txt");
    private static final File outputFile = new File(dir, "Output.txt");

    public static void main(String[] args) throws IOException {
        createResource();
        //readerWriterExample();
        //readerWriterWithTryWithResources();
        //readerWriterUsingBuffer();
        readerWriterUsingSkip();
    }

    private static void readerWriterUsingSkip() {
        try (Reader reader = new FileReader(inputFile, StandardCharsets.UTF_8);
            Writer writer = new FileWriter(outputFile, StandardCharsets.UTF_8);) {

            char[] buffer = new char[1024];
            reader.skip(26);
            while (reader.read(buffer) != -1) {
                writer.write(buffer);
            }
        } catch (IOException ex) {
            System.out.println((ex.getMessage()));
            System.out.println("Exception occured while reading/writing");
        }
    }

    /**
     * This method utilized buffer array for reading/writing
     * The buffer is not fully utilized in each iteration
     */
    private static void readerWriterUsingBuffer() {
        try (Reader reader = new FileReader(inputFile, StandardCharsets.UTF_8);
            Writer writer = new FileWriter(outputFile, StandardCharsets.UTF_8);) {

            char[] buffer = new char[1024];

            while(reader.read(buffer) != -1){
                writer.write(buffer);
            }
        } catch (IOException ex) {
            System.out.println((ex.getMessage()));
            System.out.println("Exception occured while reading/writing");
        }
    }

    /**
     * This method using same read/write with try with resources, reducing verbosity.
     */
    private static void readerWriterWithTryWithResources() {
        try (Reader reader = new FileReader(inputFile, StandardCharsets.UTF_8);
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

    /**
     * This method uses Reader/Writer for reading byte by byte
     */
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
            Thread.sleep(2000);
            outputFile.createNewFile();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
