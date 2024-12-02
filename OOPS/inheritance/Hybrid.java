package inheritance;

class GrandMother {
    public void showG() {
        System.out.println("She is grandmother.");
    }
}

class Mother extends GrandMother {
    public void showM() {
        System.out.println("She is mother.");
    }
}

class Daughter extends Mother {
    public void showD() {
        System.out.println("She is daughter.");
    }
}

class Son extends Mother {
    public void showS() {
        System.out.println("He is Son.");
    }
}

public class Hybrid {
    public static void main(String args[]) {
        Daughter obj = new Daughter();
        obj.showD();
        obj.showM();
        obj.showG();
        Son obj2 = new Son();
        obj2.showS();
        obj2.showM();
        obj2.showG();
    }
}      