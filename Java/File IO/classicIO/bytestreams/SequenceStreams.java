package bytestreams;

import java.io.*;
import java.util.Vector;

/**
 * Used to combine multiple stream in sequential Order
 */
public class SequenceStreams {
    private static final String fileDir =
        "D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\stream";
    private static final File inputFile1 = new File(fileDir, "inputFile1.txt");
    private static final File inputFile2 = new File(fileDir, "inputFile2.txt");
    private static final File outputFile = new File(fileDir, "inputFile2.txt");
    private static final String str = "This is byte array\n";

    public static void main(String[] args) throws IOException {
        createFile();

        byte[] bytes = str.getBytes();
        FileInputStream inputStream1 = new FileInputStream(inputFile1);
        FileInputStream inputStream2 = new FileInputStream(inputFile2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

//        SequenceInputStream sequenceStream =
//            new SequenceInputStream(new SequenceInputStream(inputStream1, inputStream2),
//                byteArrayInputStream);
        Vector<InputStream> streams = new Vector();
        streams.add(byteArrayInputStream);
        streams.add(inputStream1);
        streams.add(inputStream2);

        SequenceInputStream sequenceInputStream = new SequenceInputStream(streams.elements());
        int readByte = 0;
        while ((readByte = sequenceInputStream.read()) != -1) {
            System.out.print((char) readByte);
        }
    }

    private static void createFile() throws IOException {
        outputFile.createNewFile();
    }
}
