package Examples12;

public class Outer {
    private int x = 100;
    private String x2 = "Outer";
    private static String x3 = "Outer";

    public static class InnerStatic{
        public String toString(){
            return "innerstaticclass";
        }

        public void go(){
            System.out.println("Inner Static Class Go");
        }
    }

    public class InnerNonStatic{
        public String toString() {
            return "Inner Static class";
        }

        public void seeOuter(){
            System.out.println("Outer x i " + x);
            System.out.println("Inner Class Reference" + this.toString());
        }
    }
    // nested class
    public static class inner3{}
}

// 이건 일반 클래스
class outer2{}
class outer3{}
class outer4{}