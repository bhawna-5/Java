package abstraction;

abstract public class Animal {
     int x=10;
     Animal(int x){
          this.x=x;
     }
     abstract void speak();
     void eat (){
          System.out.println("i can be herbivores and carnivores"+x);
     }
}
