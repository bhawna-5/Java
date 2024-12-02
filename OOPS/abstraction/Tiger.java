package abstraction;

class Lion extends Animal {
    Lion(int x) {
        super(x);
    }

    @Override
    void speak() {
        System.out.println("i roar");
    }

    @Override
    void eat() {
        System.out.println("i am carnivores");
    }
}

public class Tiger extends Animal {
    Tiger(int x) {
        super(x);
    }

    @Override
    void speak() {
        System.out.println("i roar");
    }

    void eat() {
        System.out.println("i am both herbivores and carnivores"+x);
    }

    public static void main(String[] args) {
        Tiger obj = new Tiger(15);
        obj.eat();
    }

}
