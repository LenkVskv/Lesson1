/**
 * Created by Olenkaa on 26.01.2017.
 */
public class Rectangle {
  private double height, width;
  private double perimetr, area;

  public Rectangle(){
      height = 10.5;
      width = 12;
  }
    public Rectangle(double height, double width){
      this.height = height;
      this.width = width;
        setArea(findArea());
        setPerimetr(findPerimetr());



    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    private double findPerimetr(){
    return ((height + width)*2);
    }
    private double  findArea(){
    return(height * width);
    }


}
