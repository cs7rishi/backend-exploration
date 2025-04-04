package Nio;

import java.io.File;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannelAndBuffer {
    public static void main(String[] args) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.putInt(12);
        byteBuffer.putInt(13);

        System.out.println("pos: " + byteBuffer.position());
        System.out.println("limit: " + byteBuffer.limit());

        byteBuffer.flip();
        System.out.println("pos: " + byteBuffer.position());
        System.out.println("limit: " + byteBuffer.limit());

        Path path = Paths.get(
            "D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\NIO\\demo.txt");
        FileChannel writeChannel =
            FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        writeChannel.write(byteBuffer);
        writeChannel.close();

        FileChannel readChannel = FileChannel.open(path, StandardOpenOption.READ);
        byteBuffer.clear();
        readChannel.read(byteBuffer);
        readChannel.close();

        byteBuffer.flip();

        try {

            while (true) {
                System.out.println(byteBuffer.getInt());
            }
        } catch (BufferUnderflowException e) {

        }

    }
}
