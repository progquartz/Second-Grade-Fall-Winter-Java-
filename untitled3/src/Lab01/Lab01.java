import java.awt.desktop.SystemEventListener;
import java.util.Scanner;


public class Lab01 {

    public void infoCircle(){
        Scanner input = new Scanner(System.in);
        int radius;
        System.out.println("Enter Radious: ");
        radius = input.nextInt();
        System.out.println("The diameter = " + 2 * radius);
        System.out.println("The Circumstance = " + 2 * Math.PI * radius);
        System.out.println("The radious = " + Math.PI * radius * radius);
    }

    public void bmiCalculator(){
        Scanner input = new Scanner(System.in);
        double weight;
        double height;
        System.out.println("Enter Weight and height");
        weight = input.nextDouble();
        height = input.nextDouble();
        System.out.println("The Bmi is : " + weight / (height * height));
    }

    public void wpCalculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Population");
        long population = input.nextLong();
        for(int i = 1 ; i < 6 ; i++){
            long afterpopulation = (long)(population * Math.pow(1.0114,i));
            System.out.println("The Population After " + i + "year will be " + afterpopulation);
        }


    }
}
