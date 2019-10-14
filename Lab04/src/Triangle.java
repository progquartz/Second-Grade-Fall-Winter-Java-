import java.math.MathContext;

public class Triangle {

    private Point v1,v2,v3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new Point(x1,y1);
        v2 = new Point(x2,y2);
        v3 = new Point(x3,y3);
    }
    public Triangle(Point p1, Point p2 , Point p3){
        v1 = p1;
        v2 = p2;
        v3 = p3;
    }

    public double getArea(){
        double s = (v1.distance(v2) + v2.distance(v3) + v3.distance(v1))/2;
        return Math.sqrt(s * (s - v1.distance(v2))*(s - v2.distance(v3))*(s - v3.distance(v1)));
    }

    public Point getCenter(){
        return new Point((v1.getX() + v2.getX() + v3.getX())/3, (v1.getY() + v2.getY() + v3.getY())/3 );
    }
    public double getPerimeter(){ return v1.distance(v2) + v2.distance(v3) + v3.distance(v1); }
    public String getType(){
        double s1 = v1.distance(v2);
        double s2 = v2.distance(v3);
        double s3 = v3.distance(v1);
        if(s1 == s2 | s1 == s3 | s2 == s3) {
            if(s1 == s2 & s2 == s3) {
             return new String("Equilateral");
            }
            else{
                return new String("isosceles");
            }
        }
        else {
            return new String("Scalene");
        }
    }

    @Override
    public String toString() { return "Triangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}'; }

    public void setV1(Point v1) { this.v1 = v1; }
    public void setV2(Point v2) { this.v2 = v2; }
    public void setV3(Point v3) { this.v3 = v3; }
    public Point getV1() { return v1; }
    public Point getV2() { return v2; }
    public Point getV3() { return v3; }
}
