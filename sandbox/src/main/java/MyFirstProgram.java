public class MyFirstProgram {

  public static void main(String[] args) {
    Point point1 = new Point(2, 2);
    Point point2 = new Point(4, 4);
    
    double distance2 = point1.distanceMethod(point2);

    System.out.println("Paccтояние от точки p1 до точки p2 = " + distance2 );
  }
}