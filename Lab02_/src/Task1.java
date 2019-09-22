
public class Task1 {

    public String convertToBin(int d){// used java's integar library
        return Integer.toBinaryString(d);
    }

    public String converToOct(int d){// used java's integar library
        return Integer.toOctalString(d);
    }

    public String converToHex(int d){ // used java's integar library
        return Integer.toHexString(d);
    }
    public void patternA(int a){ // used double - for loop to make this algorithm work.
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < a ; j++){
                if(i <= j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void patternB(int a){ // used double - for loop to make this algorithm work.
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < a ; j++){
                if(i + j < a){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void patternC(int a){ // used double - for loop to make this algorithm work.
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < a ; j++){
                if(i > j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void patternD(int a){ // used double - for loop to make this algorithm work.
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < a ; j++){
                if(i + j >= a-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




}
