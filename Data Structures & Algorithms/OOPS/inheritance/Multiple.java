package inheritance;

interface Parent1 {
    void mother();
}

interface Parent2 {
    void father();
}

class Family implements Parent1, Parent2 {
    public void mother() {
        System.out.println("Mothers Feature");
    }

    public void father() {
        System.out.println("Fathers Feature");
    }
}

public class Multiple {
    public static void main(String args[]) {
        Family a = new Family();
        a.mother();
        a.father();
    }
}
