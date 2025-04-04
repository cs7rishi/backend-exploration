package Nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CharBufferExample {
    public static void main(String[] args) {
        String string = "संस्कृत के कुछ श्लोक और उनके अर्थ ये रहे:";
        CharBuffer charBuffer = CharBuffer.allocate(1024);
        charBuffer.put(string);
        charBuffer.flip();

        Charset utf8 = StandardCharsets.UTF_8;
        ByteBuffer byteBuffer = utf8.encode(charBuffer);

        try{

        }
    }
}
