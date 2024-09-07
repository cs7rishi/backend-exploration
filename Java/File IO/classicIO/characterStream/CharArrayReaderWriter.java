package characterStream;

import java.io.*;

public class CharArrayReaderWriter {
    private static final String message =
        "Hey, guys, welcome back.\n" + "In this lecture, we are going to talk about in memory bytestreams, basically about bite in Catrine and bite output's glasses.\n";

    public static void main(String[] args) {
        charArrayReaderWriter();
    }

    private static void charArrayReaderWriter() {
        char[] charArray = message.toCharArray();
        CharArrayReader reader = new CharArrayReader(charArray);
        CharArrayWriter writer = new CharArrayWriter();
        char[] buffer = new char[3];
        try {

            while (reader.read(buffer) != -1) {
                writer.write(buffer);
            }

            char[] output = writer.toCharArray();
            System.out.println(new String(output));
        } catch (IOException ex) {
            System.out.println("Exception Occured");
        }
    }

}
