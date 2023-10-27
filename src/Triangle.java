public class Triangle extends Shape implements CalculatePerimeter{
    // This triangle will be equilateral (meaning all it's sides are equal
    // This way it'll be much easier to calculate perimeter, square
    // and volume of the cone built by rotating it around its height
    // The triangle's height in this case will be h = (a * Math.sqrt(3)) / 2
    @Override
    public String getName() {
        return "The shape is triangle";
    }

    @Override
    public double perimeter() {
        int a = (int) ((Math.random() * 7) + 4); // + 4 is used to avoid "= 0";
        System.out.println("Each of its sides equals " + a);
        return a * 3;
    }

    @Override
    public void perimeterValue() {
        System.out.println("And its perimeter is " + perimeter());
    }
}
