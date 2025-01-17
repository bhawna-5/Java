package generics;
class dummy<t,e> {
    t id;
    e name ;
    public dummy(t id , e name ) {
        this.id = id;
        this.name=name;
    }
    public t getob(){
        return id;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        dummy<String,Integer> obj = new dummy<>("212",2);
        dummy<Integer,String> obj1 = new dummy<>(7,"7");

        System.out.println(obj);
    }
}
