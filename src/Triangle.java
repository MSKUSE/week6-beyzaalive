public class Triangle extends Shape {
    private Point topLeft;
    private int sideA, sideB;
    public static int counter = 0;
    public int counterForObject = 0;

    public static String class_name = "Triangle";

    public Triangle(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterForObject++;
    }

    public Triangle(Point topLeft, int sideA) {
        this(topLeft, sideA, sideA);
        counter++;
        counterForObject++;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("side A cannot be zero or negative");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("side B cannot be zero or negative");
        }
        this.sideB = sideB;
    }
    @Override
    public int area() {
        return (this.sideA*this.sideB) / 2.0;
    }
    @Override
    public int perimeter(){
        return sideA + sideB + Math.hypotenuse;
    }

    public double perimeter() {
        double hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
        return sideA + sideB + hypotenuse;
    }

    public double area() {
        return (sideA * sideB) /2.0
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Location=" + topLeft +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", counter=" + counter +
                '}';
    }
}