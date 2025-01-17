package generics;

public class GenericMethod {
    static  <t> void meth(t data){
        System.out.println(data);
    }
    public static void main(String[] args) {
        meth(1);
    }
}
