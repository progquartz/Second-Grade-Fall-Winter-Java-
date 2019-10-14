public class Quadrilateral {
    public Point v1,v2,v3,v4;

    public Quadrilateral(Point v1, Point v2, Point v3, Point v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    public Point getV1() { return v1; }
    public void setV1(Point v1) { this.v1 = v1; }
    public Point getV2() { return v2; }
    public void setV2(Point v2) { this.v2 = v2; }
    public Point getV3() { return v3; }
    public void setV3(Point v3) { this.v3 = v3; }
    public Point getV4() { return v4; }
    public void setV4(Point v4) { this.v4 = v4; }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ", v4=" + v4 +
                '}';
    }

    public String getType(){
        double s1 = v1.distance(v2);
        double s2 = v2.distance(v3);
        double s3 = v3.distance(v4);
        double s4 = v4.distance(v1);
        double centerx = (v1.getX() + v2.getX() + v3.getX() + v4.getX())/4;
        double centery = (v1.getY() + v2.getY() + v3.getY() + v4.getY())/4;
        if ((s1 == s2) &&(s2==s3)&&(s3 == s4)){
            if(((Math.abs(v1.getX() - centerx) == (Math.abs(v2.getX() - centerx))) && ((Math.abs(v1.getY() - centery)) == (Math.abs(v2.getY() - centery)))))
                return "Square";
            else
                return "Rhombus";
        }
        else if((Math.pow((double)(v1.getX() - centerx),2) + (Math.pow((double)(v1.getY() - centery),2))) ==
                (Math.pow((double)(v2.getX() - centerx),2) + (Math.pow((double)(v2.getY() - centery),2))) &&
                (Math.pow((double)(v2.getX() - centerx),2) + (Math.pow((double)(v2.getY() - centery),2))) ==
                (Math.pow((double)(v3.getX() - centerx),2) + (Math.pow((double)(v3.getY() - centery),2))) &&
                (Math.pow((double)(v3.getX() - centerx),2) + (Math.pow((double)(v3.getY() - centery),2))) ==
                (Math.pow((double)(v4.getX() - centerx),2) + (Math.pow((double)(v4.getY() - centery),2)))){
            return "Rectangle";
        }
        return "Trapezoid";
    }

    public double getPerimeter(){
        return (v1.distance(v2) + v2.distance(v3) + v3.distance(v4) + v4.distance(v1));
    }

    public double getArea(){
        double s1 = v1.distance(v2);
        double s2 = v2.distance(v3);
        double s3 = v3.distance(v4);
        double s4 = v4.distance(v1);
        double s = (s1 + s2 + s3 + s4)/2;
        return Math.sqrt((s-s1) * (s-s2) * (s-s3) * (s-s4));
    }

    public Point getCenter(){
        Point p = new Point();
        p.setX((v1.getX() + v2.getX() + v3.getX() + v4.getX())/4);
        p.setY((v1.getY() + v2.getY() + v3.getY() + v4.getY())/4);
        return p;
    }
}
