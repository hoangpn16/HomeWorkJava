package JavaHomeWork.ExceptionHandling;

public class Exception {
    public static void main(String[] args) {
       try {
           int arr[] = new int[5];
           arr[5] = 4;
           System.out.println("arr[5] = " + arr[5]);

           int zero = 0;
           int average = 10 / zero;
           System.out.println("Average = " + average);

           String obj = null;
           System.out.println(obj.length());
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }catch (NullPointerException e){
           System.out.println(e);
       }catch (ArithmeticException e){
           System.out.println(e);
       }
        System.out.println("Finished!!!");
    }
}
