public class Triangle extends Shape{
    // This triangle will be equilateral (meaning all it's sides are equal
    // This way it'll be much easier to calculate perimeter, square
    // and volume of the cone built by rotating it around its height
    // The triangle's height in this case will be h = (a * Math.sqrt(3)) / 2
    @Override
    public String getName() {
        return "triangle";
    }
}
