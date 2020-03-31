package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Activity_95 {
    public static void main(String[] args) throws FileNotFoundException {
        String longestword = "";
        String item;
        Scanner sc = new Scanner(new File("C:\\Users\\Phan Nho Hoang\\Desktop\\Test\\Test1.txt"));
        // Sử dụng lớp Interator để duyệt phần tử
        while (sc.hasNext()) {
            item= sc.next();
            if (item.length() > longestword.length()) {
                longestword = item;
            }
        }
        System.out.println("Longest Word in text is "+longestword);
    }
}
