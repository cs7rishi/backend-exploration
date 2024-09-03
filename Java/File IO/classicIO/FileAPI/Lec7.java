package FileAPI;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Lec7 {
    public static void main(String[] args) throws URISyntaxException, IOException {

        File file = new File(
            "D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\sampleText.txt");
        File dir = new File("D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\newDir\\pokemon");

        //Check if the file path exists
        System.out.println(file.exists());
        //Check if the directory exists
        System.out.println(dir.exists());

        //creates the directory
        //if(!dir.exists()) dir.mkdirs();

        //creates the nested directory
        //if(!dir.exists()) dir.mkdirs();

        // deletes the directory
        //if(dir.exists()) dir.delete();

        // deletes the last nested directory
        //if(dir.exists()) dir.delete();

        File ssDir = new File("D:\\Learning\\GitHub\\backend-exploration\\Java\\File IO\\resources\\newDir\\pokemon");
        String[] fileNames = ssDir.list();

        for(String fileName : fileNames){
            System.out.println(fileName);
            File image = new File(ssDir,fileName);
            image.delete();
        }



    }
}
