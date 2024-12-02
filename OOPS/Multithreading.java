class A extends Thread {
     A(String name){
        super(name);
     }
    @Override
    public void run() {
//        System.out.println("starting thread");
        System.out.println("hello "+this.getName());
    }
}

public class Multithreading {
    public static void main(String[] args) {
        A a = new A("bhawna");
        A b = new A("cbhawna");
        A c = new A("wbhawna");
         c.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
        c.start();

    }
}
