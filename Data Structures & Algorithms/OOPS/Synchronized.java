//class First2 extends  Thread{
//    public void display(String msg) {
//        System.out.print("[" + msg);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("]");
//    }
//}
//class second extends Thread {
//    String msg;
//    First2 fobj;
//
//    second(First2 fp, String str) {
//        fobj = fp;
//        msg = str;
//    }
//
//    public void run() {
//        synchronized (fobj) {
//            fobj.display(msg);
//        }
//    }
//}
//
//public class Synchronized {
//    public static void main(String[] args) {
//        First2 f = new First2();
//        second f1 = new second(f, "Java");
//        second f2 = new second(f, "c++");
//        second f3 = new second(f, "Android");
//        System.out.println(f.getPriority());
//        f1.start();
//        f2.start();
//        f3.start();
//
//    }
//
//}
//
//
//class caller
//{
//    synchronized public void display(String msg)
//    {
//        System.out.print ("["+msg);
//        try
//        {
//            Thread.sleep(1000);
//        }
//        catch(InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//        System.out.println ("]");
//    }
//}
//class call extends Thread{
//    String msg;
//    caller fobj;
//    call (caller fp,String str)
//    {
//        fobj = fp;
//        msg = str;
//    }
//    public void run() {
//        fobj.display(msg);
//    }
//}
//
//public class Synchronized_method {
//    public static void main(String[] args) {
//        caller c=new caller();
//        call f1=new call(c,"Java");
//        call f2=new call(c,"c++");
//        call f3=new call(c,"Anrdroid");
//        f1.start();
//        f2.start();
//        f3.start();
//
//    }
//}