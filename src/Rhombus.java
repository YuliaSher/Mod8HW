public class Rhombus extends Shape{
    // This rhombus will consist of two equilateral triangles (meaning one of its
    // diagonals equals all its sides. And the other diagonal will be
    // double the triangles height d2 = 2 * h = a * Math.sqrt(3) (see Triangle class)
    // This way it'll be much easier to calculate perimeter and square

    @Override
    public String getName() {
        return "rhombus";
    }
}
