public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();
        printer.printShapeName(new Circle());
        printer.printShapeName(new Rectangle());
        printer.printShapeName(new Triangle());
        printer.printShapeName(new Quad());
        printer.printShapeName(new Trapezoid());
    }
}
