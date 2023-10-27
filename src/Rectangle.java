public class Rectangle extends Shape implements CalculatePerimeter{
    @Override
    public String getName() {
        return "The shape is rectangle";
    }

    @Override
    public double perimeter() {
        int a = (int) ((Math.random() * 7) + 4); // + 4 is used to avoid "= 0";
        int b = (int) (a + a * Math.random() + 1); // I want this side to be bigger than side a
        System.out.println("Its sides are " + a + " and " + b + ", respectively");
        return 2 * (a + b);
    }

    @Override
    public void perimeterValue() {
        System.out.println("And its perimeter is " + perimeter());
    }
}
