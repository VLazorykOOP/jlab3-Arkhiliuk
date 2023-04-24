package Third;
import java.util.InputMismatchException;
import java.util.Scanner;

interface Body {
    double getSurfaceArea();
    double getVolume();
}

class Parallelepiped implements Body {
    private double length, width, height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Parallelepiped with length " + length + ", width " + width + ", and height " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Parallelepiped) {
            Parallelepiped other = (Parallelepiped) obj;
            return length == other.length && width == other.width && height == other.height;
        }
        return false;
    }
}

class Ball implements Body {
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Ball with radius " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ball) {
            Ball other = (Ball) obj;
            return radius == other.radius;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {


        Body[] bodies = new Body[2];

        System.out.println("Enter the dimensions of the first parallelepiped:");
        double length=0;
        double width=0;
        double height=0;
        do {
            Scanner input = new Scanner(System.in);
            try {
                length = input.nextDouble();
                width = input.nextDouble();
                height = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }while(length==0 || width==0 || height==0);
        bodies[0] = new Parallelepiped(length, width, height);

        System.out.println("Enter the radius of the ball:");
        double radius=0;
        do {
            Scanner input = new Scanner(System.in);
            try{
                radius = input.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a number.");
            }
        }while(radius==0);
        bodies[1] = new Ball(radius);



        for (Body body : bodies) {
            System.out.println(body);
            System.out.println("Surface area: " + body.getSurfaceArea());
            System.out.println("Volume: " + body.getVolume());
            System.out.println();
        }
    }
}
