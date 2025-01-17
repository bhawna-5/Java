class dem{
    int c;
    public void inc(){
        c++;
    }
}
public class Main{
     public static void main(String[] args) {
        dem obj = new dem();
        obj.inc();
        obj.inc();
         System.out.println(obj.c);
//         try{
//             int arr[]=new int[6];
//             arr[3]=20/0;
//             System.out.println(arr[9]);
//         }
//         catch (ArithmeticException ae){
//             System.out.println("error 1");
//         }
//         catch (ArrayIndexOutOfBoundsException e){
//             System.out.println("err2");
//         }
//         catch (NullPointerException b){
//             System.out.println("err3");
//         }

     }
 }