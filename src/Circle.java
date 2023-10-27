public class Circle extends Shape implements CalculatePerimeter{
    @Override
    public String getName() {
        return "The shape is circle";
    }


    @Override
    public double perimeter() {
        int r = (int) ((Math.random() * 7) + 4); // + 4 is used to avoid "= 0";
        System.out.println("It has radius " + r);
        return r * 2 * Math.PI;
    }

    @Override
    public void perimeterValue() {
        System.out.println("And its circuit is " + this.perimeter());
    }

}
