package module_session4.ex2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }



    public double  getDiscriminant() {

        return  (b*b) - (4*a*c);
    }
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("nhập a : ");
        double a = input.nextDouble();

        System.out.print("nhập b: ");
        double b = input.nextDouble();

        System.out.print("nhập c: ");
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        System.out.println(delta);
        if (delta > 0) {
            System.out.println("The equation has two roots: " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("do 2 nghiệm bằng nhau: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
