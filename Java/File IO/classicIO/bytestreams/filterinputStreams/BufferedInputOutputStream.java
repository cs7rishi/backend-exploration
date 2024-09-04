package bytestreams.filterinputStreams;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Performance optimization for basic input/output stream, uses a buffer internally, to avoid call
 * for every single byte
 */
public class BufferedInputOutputStream {
    private static final String fileDir =
        "D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\stream";
    private static final File inputFile = new File(fileDir, "inputFile.txt");
    private static final File outputFile = new File(fileDir, "outputFile.txt");

    public static void main(String[] args) throws IOException {
        createFiles();
//        FileInputStream inputStream = new FileInputStream(inputFile);
        BufferedInputStream bufferedInputStream =  new BufferedInputStream(new FileInputStream(inputFile));
        int byteRead =0;
        while((byteRead = bufferedInputStream.read()) != -1){
            System.out.print((char)byteRead);
        }
    }

    private static void createFiles() throws IOException {
        outputFile.createNewFile();
    }
}
