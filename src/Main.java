public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape rhombus = new Rhombus();
        Shape trapezoid = new Trapezoid();
        Shape triangle = new Triangle();

        System.out.println("circle.getName() = " + circle.getName());
        System.out.println("quad.getName() = " + quad.getName());
        System.out.println("rectangle.getName() = " + rectangle.getName());
        System.out.println("rhombus.getName() = " + rhombus.getName());
        System.out.println("trapezoid.getName() = " + trapezoid.getName());
        System.out.println("triangle.getName() = " + triangle.getName());
    }
}