package module_session4.ex1;

public class Circle {

    public double radius;


    public void perimeterAndArea() {
        System.out.println("chu vi hình tròn là :" + (2 * 3.14  * radius));
        System.out.println("diện  hình tròn là :" + ( 3.14  * radius * radius));
    }

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();


        circle1.radius = 10.5;
        circle2.radius = 122;
        circle1.perimeterAndArea();
        circle2.perimeterAndArea();
    }
}
