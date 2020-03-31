package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;


public class Activity_94 {
    public static void main(String[] args) throws Exception{
        FileReader fr=null;
        BufferedReader br=null;
        try{
             fr= new FileReader("C:\\Users\\Phan Nho Hoang\\Desktop\\Test\\Test1.txt");
             br=new BufferedReader(fr);
             String line="";
             while ((line=br.readLine())!= null){
                 System.out.println(line);

             }
        }catch (Exception e){
            System.out.println("Loi ngoai le "+e);
        }finally {
            fr.close();
            br.close();
        }
    }
}
