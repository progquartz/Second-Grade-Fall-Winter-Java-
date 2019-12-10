public class Lab05Test {
    public static void main(String[] args){
        testGI();
        //testEmployee();
    }

    public static void testGI(){
        GeometricObject[] gi = new GeometricObject[3];
        gi[0] = new Circle(3);
        gi[1] = new ResizableCircle(5);
        ResizableCircle c1 = new ResizableCircle(6);
        c1.resize(50);
        gi[2] = c1;
        for(GeometricObject c:gi){
            System.out.println(c.getPerimeter()/2/Math.PI);
            System.out.println(c.getPerimeter());
            System.out.println(c.getArea());
        }
    }

    public static void testEmployee(){
        Payable[] po = new Payable[5];
        po[0] = new Invoice("1111","tiers",7,200.0);
        //po[1] = new Employee()'' 다음과 같이 employ는 abstract여서 사용할수 없음.
        po[1] = new SalariedEmployee("Name1", "Name2","asdx",5000.0);
        po[2] = new Invoice("1232","seats",27,100.0);
        po[3] = new BasePlusCommissionEmployee("Name3", "Name4", "asdz",123.3,1,1232);
        po[4] = new HourlyEmployee("Name5", "Name6", "askdlzk", 123,132);

        for(Payable p:po){
            System.out.println(p.earnings());
        }
    }
}
