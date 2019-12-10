package Lab04;

public class Lab04Test {


    public static void testPoint(){
        Point p1 = new Point(1,2);
        System.out.println(p1);
        Point p2 = new Point(3,10);
        System.out.println(p1.distance(p2));
    }

    public static void testCircle(){
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(3,5,4.5);
        System.out.println(c2);
        System.out.println(c2.getCenter().distance(c1.getCenter()));
    }

    public static void testLine(){
        Line l1 = new Line(1, 2, 3, 4);
        System.out.println(l1);  // Line's toString()
        Line l2 = new Line(new Point(5,6), new Point(7,8));  // anonymous Point's instances
        System.out.println(l2);  // Line's toString()
    }

    public static void testTriangle(){
        Triangle t1 = new Triangle(1,2,3,4,5,6);
        System.out.println(t1);
        System.out.println(t1.getCenter());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());
    }

    public static void testQuad(){
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,3);
        Point p3 = new Point(2,1);
        Point p4 = new Point(4,3);
        Quadrilateral t1 = new Quadrilateral(p1,p2,p3,p4);
        System.out.println(t1);
        System.out.println(t1.getArea());
        System.out.println(t1.getCenter());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());
    }

    public static void testSalariedemployee(){
        SalariedEmployee se = new SalariedEmployee("F anme", "L name" , "2345", 234000);
        System.out.println(se);
        se.setWeeklySalary(500.00);
        System.out.println(se);
    }
    public static void testHourlyEmployee(){
        HourlyEmployee he = new HourlyEmployee("name","asdf","1234",10000, 10);
        System.out.println(he);
        he.setHours(100);
        System.out.println(he);
    }

    public static void testCommisionEmployee(){
        CommissionEmployee ce = new CommissionEmployee("asdf","name","2222", 12344, 11);
        System.out.println(ce);
        ce.setCommissionRate(20);
        System.out.println(ce);
    }
    public static void main(String[] args){
        testPoint();
        System.out.println();
        testLine();
        System.out.println();
        testTriangle();
        System.out.println();
        testQuad();
        System.out.println();
        testCommisionEmployee();
        System.out.println();
        testHourlyEmployee();
        System.out.println();
        testSalariedemployee();
    }
}
