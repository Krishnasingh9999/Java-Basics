public class TSAofCuboid {
  public static void main(String[] args) {
    double length = 15;
    double breadth = 10;
    double height = 12;

    //TSA of Cuboid = 2(l*b + b*h + l*h)
    double totalSurfaceArea = 2*((length*breadth) + (breadth*height) + (length*height));
    System.out.println(totalSurfaceArea);
  }
  
}