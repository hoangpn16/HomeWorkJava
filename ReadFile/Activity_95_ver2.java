package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Activity_95_ver2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr= new FileReader("C:\\Users\\Phan Nho Hoang\\Desktop\\Test\\Test1.txt");
            br=new BufferedReader(fr);
            String line="";
            String longestword="";
            String current;
            while ((line=br.readLine())!= null){
               String[] items=line.split(" ");
               for(String item: items){
                   if(item.length() >longestword.length()){
                       longestword=item;
                   }
               }
            }
            System.out.println(longestword);
        }catch (Exception e){
            System.out.println("Loi ngoai le "+e);
        }finally {
            fr.close();
            br.close();
        }
    }
}
