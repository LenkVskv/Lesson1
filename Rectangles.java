import java.util.ArrayList;



public class Rectangles {
    private ArrayList<Rectangle> figure = new ArrayList<Rectangle>();

    public Rectangle addFigures(Rectangle rectangle) {
        figure.add(rectangle);
        return rectangle;


    }

    private double returnArea() {
        double sum = 0;
        for (Rectangle rectangle : figure) {
            sum += rectangle.getArea();

        }
        return sum;

    }


}
