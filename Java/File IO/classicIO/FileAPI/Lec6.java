package FileAPI;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

//Creating File Object
public class Lec6 {
    public static void main(String[] args) throws URISyntaxException {
        File file = new File(
            "D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\sampleText.txt");
        File file1 =
            new File("D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\",
                "sampleText.txt");
        URI uri = new URI("");
        File file3 = new File(uri);

    }
}
