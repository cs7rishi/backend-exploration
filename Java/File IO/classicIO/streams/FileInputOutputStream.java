package streams;

import java.io.*;
/**
 * 1. Reading And Writing Byte By Byte
 * 2. Reading And Writing Through Byte Array (Buffer)
 * 3. Asking For Available Bytes
 * 4. Selecting The Read/Write Region Of Buffer
 *
 * Usually used with files
 */
public class FileInputOutputStream {
    private static final File streamDir =
        new File("D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\stream");
    private static final File inputFile = new File(streamDir, "inputFile.txt");
    private static final File outputFile = new File(streamDir, "output.txt");

    public static void main(String[] args) throws IOException {
        deleteOutputFile();
        createFile();
//        copyByteByByte();
        copyUsingByteArray();
    }



    private static void copyUsingByteArray() throws IOException {
        FileInputStream inputStream = new FileInputStream(inputFile);
        OutputStream outputStream = new FileOutputStream(outputFile);
        byte[] array = new byte[10];

        while(inputStream.read(array) != -1){
            System.out.println("Remaining bytes: " + inputStream.available());
            outputStream.write(array,4,6);
        }
    }

    static void copyByteByByte() {
        try {
            FileInputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
            int byteRead = 0;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Exception occured while performing copy");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createFile() {
        try {
            if (!streamDir.exists())
                streamDir.mkdir();

            inputFile.createNewFile();
            outputFile.createNewFile();
            System.out.println("Required file created!");
        } catch (IOException ex) {
            System.out.println("Exception occured while createing file: " + ex.getMessage());
        }
    }

    private static void deleteOutputFile() {
        if(outputFile.exists()){
            outputFile.delete();
            System.out.println(outputFile.getName() + " deleted!");
        }
    }
}
