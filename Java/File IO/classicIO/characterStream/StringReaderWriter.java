package characterStream;

import java.io.*;

public class StringReaderWriter {
    private static final String message =
        "Hey, guys, welcome back.\n" + "In this lecture, we are going to talk about in memory bytestreams, basically about bite in Catrine and bite output's glasses.\n";

    public static void main(String[] args) {
        stringReaderWriter();
    }

    private static void stringReaderWriter() {
        StringReader reader = new StringReader(message);
        StringWriter writer = new StringWriter();
        int charRead = 0;
        try {
            while ((charRead = reader.read()) != -1) {
                writer.write(charRead);
            }

            System.out.println(writer.toString());
        } catch (IOException ex) {
            System.out.println("Exception Occured");
        }
    }
}
