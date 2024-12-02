package inheritance;

class lemon {
    public void lemon() {
        System.out.println("i am sour");
    }
}

class orange extends lemon {

    public void orange() {
//        super.lemon();

        System.out.println("i am sweet");
    }
}

class anyFruit extends orange {

    void anyFruit() {
        super.lemon();
        super.orange();
        System.out.println("sometimes sour sometimes sweet");
    }
}

public class Multilevel {
    public static void main(String[] args) {
//        anyFruit obj = new anyFruit();
//        obj.anyFruit();
        orange ob =new anyFruit();

    }
}
