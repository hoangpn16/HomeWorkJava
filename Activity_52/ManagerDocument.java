package Activity_52;

import java.util.ArrayList;
import java.util.List;

public class ManagerDocument {
    List<Document>documents=new ArrayList<>();

    public void addDocument(Document document){

        this.documents.add(document);
    }
    public void showInfor(){

        System.out.println(documents.toString());
    }

    public void deleteDocument(String idm){
        for (int i = 0; i <documents.size() ; i++) {
            if(documents.get(i).getId().equals(idm)){
               documents.remove(i);
            }
        }
    }
    public void searchDocument(String idn){
        for(int i=0;i<documents.size();i++){
            if(documents.get(i).getId().equals(idn)){
                System.out.println(documents.get(i).toString());
            }
        }
    }
}
