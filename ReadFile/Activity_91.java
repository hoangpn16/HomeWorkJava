package ReadFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Activity_91 {
    public static void main(String[] args) {
        List<String> listfile = new ArrayList<>();
        List<String> listdirectory = new ArrayList<>();
        File[] files = new File("C:\\Users\\Phan Nho Hoang\\Desktop\\Test").listFiles();
        for(File file:files){
            if(file.isFile()){
                listfile.add(file.getName());
                System.out.println(file.getName());
            }
            else if(file.isDirectory()){
                listdirectory.add(file.getName());
            }
        }
        System.out.println(listfile);
        System.out.println(listdirectory);
    }
}
