import static java.lang.Math.pow;

public class MyPoint {

    int x = 0;
    int y = 0;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x){
        this.x = x;
        this.y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint p){
        this.x  = p.x;
        this.y = p.y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public Integer[] getXY(){
        Integer[] xy = {x,y};
        return xy;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return " (" + this.x + " , " + this.y + " ) ";
    }

    public double distance(int x, int y){
        return (Math.sqrt(pow((double)(x - this.x), 2) + pow((double)(y - this.y), 2)));
    }

    public double distance(MyPoint another){
        return (Math.sqrt(pow((double)(another.x - this.x), 2) + pow((double)(another.y - this.y), 2)));
    }

    public double distance(){
        return (Math.sqrt(pow((double)x , 2) + pow((double)y , 2)));
    }





}
