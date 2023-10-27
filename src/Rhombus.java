public class Rhombus extends Shape implements CalculatePerimeter{
    // This rhombus will consist of two equilateral triangles (meaning one of its
    // diagonals equals all its sides. And the other diagonal will be
    // double the triangles height d2 = 2 * h = a * Math.sqrt(3) (see Triangle class)
    // This way it'll be much easier to calculate perimeter and square

    @Override
    public String getName() {
        return "The shape is rhombus";
    }

    @Override
    public double perimeter() {
        int a = (int) ((Math.random() * 7) + 4); // + 4 is used to avoid "= 0";
        System.out.println("Each of its sides equals " + a);
        return a * 4;
    }

    @Override
    public void perimeterValue() {
        System.out.println("And its perimeter is " + perimeter());
    }
}
