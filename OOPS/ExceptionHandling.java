public class ExceptionHandling {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int ar[]=new int[4];
        try{
            int c =a/b;
            //System.out.println(ar[7]);
        }
        catch(ArithmeticException  |ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

}
