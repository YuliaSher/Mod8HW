public class Trapezoid extends Shape implements CalculatePerimeter{
    // This trapezoid will be equilateral (meaning it's sides are equal
    // This way it'll be much easier to calculate square
    // Perimeter of trapezoid and volume of the cone (with upper part cut off)
    // built by rotating it around its middle height wouldn't be calculated
    @Override
    public String getName() {
        return "The shape is trapezoid";
    }

    @Override
    public double perimeter() {
        int a = (int) ((Math.random() * 7) + 4); // + 4 is used to avoid "= 0";
        int b = (int) (a + a * Math.random() + 3); // I want this side to be bigger than side a
        int h = (int) (a * Math.random() + 3); // This will be height and the first cat for finding sides (hypotenuse)

        // Finding the missing sides of our trapezoid
        double i = (double) (b - a) / 2; //Finding one cat of a triangle
        double c = Math.hypot(h, i);
        System.out.println("Its sides are " + c + " and horizontal sides are " + a + " and " + b + ", respectively");
        return 2 * c + a + b;
    }

    @Override
    public void perimeterValue() {
        System.out.println("And its perimeter is " + perimeter());
    }
}
