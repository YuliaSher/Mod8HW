public class ChooseShape {

    public void getShape() {
        int i = (int) ((Math.random() * 10) + 1);

        System.out.println("Let's choose one of the shapes with numbers from 1 to 10");
        System.out.println("The number is " + i);

        switch (i) {
            case 1:
                Circle circle1 = new Circle();
                System.out.println(circle1.getName());
                circle1.perimeterValue();
                break;
            case 2:
                Cone cone1 = new Cone();
                System.out.println(cone1.getName());
                break;
            case 3:
                Cube cube1 = new Cube();
                System.out.println(cube1.getName());
                break;
            case 4:
                Cylinder cylinder1 = new Cylinder();
                System.out.println(cylinder1.getName());
                break;
            case 5:
                Quad quad1 = new Quad();
                System.out.println(quad1.getName());
                quad1.perimeterValue();
                break;
            case 6:
                Rectangle rectangle1 = new Rectangle();
                System.out.println(rectangle1.getName());
                rectangle1.perimeterValue();
                break;
            case 7:
                Rhombus rhombus1 = new Rhombus();
                System.out.println(rhombus1.getName());
                rhombus1.perimeterValue();
                break;
            case 8:
                Sphere sphere1 = new Sphere();
                System.out.println(sphere1.getName());
                break;
            case 9:
                Trapezoid trapezoid1 = new Trapezoid();
                System.out.println(trapezoid1.getName());
                trapezoid1.perimeterValue();
                break;
            case 10:
                Triangle triangle1 = new Triangle();
                System.out.println(triangle1.getName());
                triangle1.perimeterValue();
        }
    }
}
