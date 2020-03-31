package ReadFile;

import java.io.File;

public class Activity_93 {
    public static void main(String[] args) {
        File file= new File("C:\\Users\\Phan Nho Hoang\\Desktop\\Test\\Test1.txt");
        boolean a=file.exists();
        System.out.println(a);
        //Nếu không tồn tại file thì tạo file
//        File b=file.getAbsolutePath();
//        if(a==false){
//            if(boolean c=b.exists()){
//                file.mkdir();
//            }
//        }
    }
}
