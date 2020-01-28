public class TryCatch {
    public static void main(String[] args){
        int num1,num2;
        try{
            num1 = 0;
            num2 = 30 / num1;
            System.out.println(num2);
            System.out.println("I'm in try block");
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
        System.out.println("I'm outside the try-catch block");
    }
}
