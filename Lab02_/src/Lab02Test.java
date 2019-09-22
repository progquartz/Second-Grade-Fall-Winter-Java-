public class Lab02Test {

    public static void main(String[] args){
        testTask1();
        System.out.println();
        testMyTime();
        System.out.println();
        testAccount();
        System.out.println();
        testMyPoint();
        System.out.println();
        testPattern();
        System.out.println();
    }

    public static void testTask1(){
        Task1 t1 = new Task1();
        for(int i = 0 ; i < 17 ; i++){
            System.out.println("Dec :" + i + " Bin :" + t1.convertToBin(i) + " Oct: " + t1.converToOct(i) + " Hex :" + t1.converToHex(i));
        }
    }

    public static void testPattern(){
        Task1 t1 = new Task1();
        int size = 5;
        t1.patternA(size);
        t1.patternB(size);
        t1.patternC(size);
        t1.patternD(size);

    }

    public static void testMyTime(){
        MyTime t1 = new MyTime();
        MyTime t2 = new MyTime(10);
        MyTime t3 = new MyTime(10,23);
        MyTime t4 = new MyTime(1,1,1);
        MyTime t5 = new MyTime(t4);
        t5 = t4.previousHour();
        System.out.println(t1.standardTime());
        System.out.println(t2.standardTime());
        System.out.println(t3.standardTime());
        System.out.println(t4.standardTime());
        System.out.println(t5.standardTime());


    }

    public static void testAccount(){
        Account a1 = new Account( "11", "aa", 2000);
        Account a2 = new Account( "22", "bb", 1000);
        System.out.println(a1.getID());
        System.out.println(a1.getName());
        System.out.println(a1.getBalance());
        System.out.println(a1.toString());
        a1.debit(1000);
        a1.transferTo(a2, 1000);
        System.out.println(a1.getBalance());
    }

    public static void testMyPoint(){
        MyPoint p1 = new MyPoint(1,3);
        MyPoint p2 = new MyPoint(10,10);
        System.out.println("x = " + p1.getX());
        System.out.println("y = " + p1.getY());
        System.out.println("x & y = " + p1.getXY());
        System.out.println("x & y is" + p1.toString());
        System.out.println("disatnce to 0,0 = "+ p1.distance());
        System.out.println("disatnce to p2= "+ p1.distance(p2));
        System.out.println("disatnce to 5,5 = "+ p1.distance(5,5));

    }
}
