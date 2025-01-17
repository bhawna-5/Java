public interface A2 {
    public  void method();
}
class one implements A2{
    @Override
    public void method() {
        System.out.println("class one");
    }
}
class  two extends one{
    @Override
    public void method() {
        System.out.println("class two method");
        meth();
    }
    private void meth(){
        System.out.println("hello");
    }

}
   class test extends  two{
    public static void main(String[] args) {
        A2 a=new one();
        a.method();
        test ob = new test();
        ob.method();
    }
}
