public class VolumeOfSphere {
  public static void main(String[] args) {
    double radius = 15;

    //Volume of sphere = 4/3 * pi * r*r*r
    // double volume = (4 * Math.PI * (radius * radius * radius)/3);
     double volume = (4.0/3.0)* Math.PI * Math.pow(radius, 3);
    System.out.println(volume);
  }
}
