public class Quad extends Shape implements CalculatePerimeter{
    @Override
    public String getName() {
        return "The shape is quad";
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
