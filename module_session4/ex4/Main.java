package module_session4.ex4;

public class Main {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setColor("violet");
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setOn(true);


        Fan fan2 = new Fan();
        fan2.setColor("màu đen ");
        fan2.setSpeed(2);
        fan2.setRadius(11);
        fan2.setOn(false);

        System.out.println(fan1);
        System.out.println(fan2);

    }
}
