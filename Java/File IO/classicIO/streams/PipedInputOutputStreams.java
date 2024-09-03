package streams;

import java.io.*;

/**
 * Piped Stream allow to join input and output stream together
 */
public class PipedInputOutputStreams {
    private static final File inputFile = new File(
        "D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\stream\\inputFile.txt");
    private static final File outputFile = new File(
        "D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\stream\\outputFile.txt");

    public static void main(String[] args) throws IOException {
        createFiles();
        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        //Data is read from a PipedInputStream
        PipedInputStream pIn = new PipedInputStream(5);
        //Data is written to a PipedOutputStream object
        PipedOutputStream pOut = new PipedOutputStream(pIn);


        Thread thread1 = new Thread(() -> {
            int byteRead = 0;
            int count = 0;
            try {
                while ((byteRead = inputStream.read()) != -1) {
                    pOut.write(byteRead);
                    System.out.println("Published: " + byteRead);
                    if(count == 5){
                        System.out.println("Published 5 bytes");
                    }
                    count++;
                }
                System.out.println("Published all bytes");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });


        Thread thread2 = new Thread(() -> {
            int byteRead = 0;
            try{
                while((byteRead = pIn.read()) != -1){
                    outputStream.write(byteRead);
                    System.out.println("Consumed: " + byteRead);

                    Thread.sleep(1000);
                }
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        });
        thread1.start();
        thread2.start();
    }

    private static void createFiles() throws IOException {
        if(outputFile.exists()){
            outputFile.delete();
        }

        outputFile.createNewFile();
    }
}
