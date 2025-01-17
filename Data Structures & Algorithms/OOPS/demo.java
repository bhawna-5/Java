public class demo {
    String car;
    String colour;

    public void car() {
        System.out.println(this.car);
    }

    public void colour() {
        System.out.println(this.colour);
    }

    public static void main(String[] args) {
        demo car1 = new demo();
        car1.car = "mercedes";
        car1.colour = "black";
        car1.car();
        demo car2 = new demo();
        car2.car = "BMW";
        car2.colour = "white";
        car2.colour();
    }
}
