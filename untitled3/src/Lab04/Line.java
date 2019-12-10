package Lab04;

public class Line {
    // The private instance variables
   private Point v1, v2;   // Object members - instances of the Point class
 
   // Constructors
   public Line(int x1, int y1, int x2, int y2) {
      v1 = new Point(x1, y1);  // Construct the instances declared
      v2   = new Point(x2, y2);
   }
   public Line(Point v1, Point v2) {
      this.v1 = v1;  // The caller constructed the instances
      this.v2   = v2;
   }
 
   // The public getter and setter for the private instance variables
   public Point getv1() { return v1; }
   public Point getv2() { return v2; }
   public void setv1(Point v1) { this.v1 = v1; }
   public void setv2(Point v2) { this.v2 = v2; }
 
   public int getv1X() { return v1.getX(); }
   public void setv1X(int x) { v1.setX(x); }
   public int getv1Y() { return v1.getY(); }
   public void setv1Y(int y) { v1.setY(y); }
   public int[] getv1XY() { return v1.getXY(); }
   public void setv1XY(int x, int y) { v1.setXY(x, y); }
   public int getv2X() { return v2.getX(); }
   public void setv2X(int x) { v2.setX(x); }
   public int getv2Y() { return v2.getY(); }
   public void setv2Y(int y) { v2.setY(y); }
   public int[] getv2XY() { return v2.getXY(); }
   public void setv2XY(int x, int y) { v2.setXY(x, y); }
 
   // The toString() describe itself
   public String toString() {
      return "Line[v1=" + v1 + ",v2=" + v2 + "]";
            // Invoke v1.toString() and v2.toString()
   }

   public double getGradient(){
      return ((v2.getY()- v1.getY())/(v2.getX() - v1.getX()));
   }

   public Point getCenter(){
      return new Point((v1.getX() + v2.getX())/2 ,(v1.getY() + v2.getY())/2);
   }

   public double getLength() {
      return v1.distance(v2);  // Point's distance()
   }

   public Point intersect(Line l1){
      Point p = new Point();

      return p;
   }
}
