/*public class Rectangle{
    private int length;
    private int breadth;
    private int area;

   Rectangle(int length,int breadth){
    this.length = l;
    breadth = b;
  }
  static void get(){
    System.out.println("length :" + length);
    System.out.println("breadth :" + breadth);
  }
  static void calculate(){
     area=length * breadth;
  }
}
public static void main(String args[]){
    Rectangle.set(5,6);
    Rectangle.get();
    Rectangle.calculate();

}*/
public class Rectangle{
    private double length;
    private double breadth;
    private double area;
    private double perimeter;



    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void areaOfRectangle(){
        double area=length*breadth;
        System.out.println("Area of Rectangle is " + area);
    }
    void perimeterOfRectangle(){
        double perimeter=2*(length*breadth);
        System.out.println("Perimeter of rectangle" + perimeter);
    }
}