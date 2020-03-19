package Activity_52;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument=new ManagerDocument();
        while(true){
            System.out.println("-----------MENU------------------");
            System.out.println("Enter 1: To add document");
            System.out.println("Enter 2: To show information documents");
            System.out.println("Enter 3: To delete documents");
            System.out.println("Enter 4: To search documents");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch (line){
                case "1":
                    System.out.println("Enter a: to add Book");
                    System.out.println("Enter b: to add Newspaper");
                    System.out.println("Enter c: to add Journal");
                    String type = scanner.nextLine();
                    switch (type){
                        case "a":
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter NXB:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            String number = scanner.nextLine();
                            System.out.print("Enter author: ");
                            String author = scanner.nextLine();
                            System.out.print("Enter page number: ");
                            String pageNumber = scanner.nextLine();
                            Document book = new Book(id, nxb, number, author, pageNumber);
                          //  managerDocument.addDocument(book);
                            break;
                        case "b":
                            System.out.print("Enter ID: ");
                            String idb = scanner.nextLine();
                            System.out.print("Enter NXB:");
                            String nxbb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            String numberb = scanner.nextLine();
                            System.out.print("Enter date issue: ");
                            String dateRelease = scanner.nextLine();
                            Document newspaper = new Newspaper(idb, nxbb, numberb, dateRelease);
                            managerDocument.addDocument(newspaper);
                         //   System.out.println(newspaper.toString());
                            break;
                        case "c":
                            System.out.print("Enter ID: ");
                            String idc = scanner.nextLine();
                            System.out.print("Enter NXB:");
                            String nxbc = scanner.nextLine();
                            System.out.print("Enter number: ");
                            String numberc = scanner.nextLine();
                            System.out.print("Enter number issue : ");
                            String numberRelease = scanner.nextLine();
                            System.out.print("Enter month issue: ");
                            String monthRelease = scanner.nextLine();
                            Document journal = new Journal(idc, nxbc, numberc, numberRelease, monthRelease);
                            managerDocument.addDocument(journal);
                          //  System.out.println(journal.toString());
                            break;
                        default:
                            break;
                    }
                    break;
                case "2":
                    managerDocument.showInfor();
                    break;
                case "3":
                    System.out.println("Enter id to delete");
                    String idm = scanner.nextLine();
                    managerDocument.deleteDocument(idm);
                    break;
                case "4":
                    System.out.println("Enter id to search");
                    String idn=scanner.nextLine();
                    managerDocument.searchDocument(idn);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid!!!!!!!!");
                    continue;
            }
        }
    }
}
