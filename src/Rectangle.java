public class Rectangle extends Shape{
    private Point topLeft;
    private int sideA , sideB;

    public static int counter = 0;
    public int counterForObject = 0;

    public Rectangle(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterForObject++;
    }

    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
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
        if (sideA < 0){
            throw new IllegalArgumentException("Side Cant be negative");
        }
        else {
            this.sideA = sideA;
        }
    }

    @Override
    public int area() {
        return this.sideA*this.sideB;
    }

    @Override
    public int perimeter(){
        return 2*sideA + 2*sideB;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            throw new IllegalArgumentException("Side Cant be negative");
        } else {
            this.sideB = sideB;
        }
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "location" + getlocation() +
                "side A=" + sideA +
                "side B=" + sideB +
                "}";
    }
}
