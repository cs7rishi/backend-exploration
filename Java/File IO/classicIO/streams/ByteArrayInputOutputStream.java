package streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Generally, we will be having bites on which we will be opening byteArrayInputStream
 */
public class ByteArrayInputOutputStream {
    private static final String byteString = "Hi! I am learning";
    private static final byte[] byteArray = byteString.getBytes();



    public static void main(String[] args) throws IOException {
//        readBytebyByte();
        readBytebyBuffer();
    }

    private static void readBytebyByte() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray);
        int byteRead = 0;
        while((byteRead = inputStream.read()) != -1){
            System.out.println(byteRead);
        }
    }

    private static void readBytebyBuffer() throws IOException {
        for(byte t : byteArray){
            System.out.print(t + " ");
        }
        System.out.println();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[3];
        int byteRead = 0;
        int count = 0;
        while((byteRead = inputStream.read(buffer)) != -1){
            System.out.println("Bytes Read: " + byteRead);
            outputStream.write(buffer);
            count++;
            if(count == 4){
                inputStream.mark(4);
                System.out.println("Marked");
            }
//            if(count == 5){
//                inputStream.reset(); //reset the inputStream, and start reading from the start
//                System.out.println("Reseted");
//            }
        }

        byte[] output = outputStream.toByteArray();
        for(byte t : output){
            System.out.print(t + " ");
        }
    }

}
