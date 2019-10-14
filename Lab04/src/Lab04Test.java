public class Lab04Test {


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

    public static void testemployee(){
        SalariedEmployee se = new SalariedEmployee("F anme", "L name" , "2345", 234000);
        System.out.println(se);
        se.setWeeklySalary(500.00);
        System.out.println(se);
    }
    public static void main(String[] args){
        testLine();
        testCircle();
        testemployee();
    }
}
