public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        shape.name();
        quad.name();
        System.out.println(shape.name2());
        System.out.println(triangle.name2());

    }

}
interface Shape{
    void name();
    String name2();
}
class Circle implements Shape{
    @Override
    public void name() {
        System.out.println("Circle");
    }

    @Override
    public String name2() {
        return "Circle";
    }
}
class Quad implements Shape{
    @Override
    public void name() {
        System.out.println("Quad");
    }

    @Override
    public String name2() {
        return "Quad";
    }
}
class Triangle implements Shape{
    @Override
    public void name() {
        System.out.println("Triangle");
    }

    @Override
    public String name2() {
        return "Triangle";
    }
}
class Rectangle implements Shape{
    @Override
    public void name() {
        System.out.println("Rectangle");
    }

    @Override
    public String name2() {
        return "Rectangle";
    }
}
class Trapezoid implements Shape{
    @Override
    public void name() {
        System.out.println("Trapezoid");
    }

    @Override
    public String name2() {
        return "Trapezoid";
    }
}