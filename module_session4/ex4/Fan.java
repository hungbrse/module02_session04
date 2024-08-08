package module_session4.ex4;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3 ;

    private int speed ;
    private boolean on;
    private  int radius;
    private String color;


    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String  toString() {

        if (on) {
            return "tốc độ quạt " + speed +" màu của quạt " + color + " bán kính quạt " + radius + "fan is on";
        } else  {
            return "màu của quạt " + color + " bán kính quạt " + radius + "fan is of" ;
        }
    }
}
