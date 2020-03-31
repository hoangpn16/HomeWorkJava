package ReadFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Activity_92 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
        File[] files =new File("C:\\Users\\Phan Nho Hoang\\Desktop\\Image").listFiles();
        for(File file: files){
            if(file.getPath().endsWith(".jpg")||file.getPath().endsWith(".pnj")){
                System.out.println(file.getName());
            }
        }
    }
}
