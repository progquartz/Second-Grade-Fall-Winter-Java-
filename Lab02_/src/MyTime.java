public class MyTime {

    private int hour; // mytime's members
    private int minute;
    private int second;

    public MyTime(int hour ,int minute, int second){ // mytime's constructor
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime(int hour ,int minute){// mytime's constructor
        this.hour = hour;
        this.minute = minute;
    }

    public MyTime(int hour){
        this.hour = hour;
    }// mytime's constructor

    public MyTime(){// mytime's constructor
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(MyTime T){// mytime's constructor
        this.hour = T.hour;
        this.minute = T.minute;
        this.second = T.second;
    }


    public void setTime(int hour, int minute, int second){ // time setting method
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour){
        this.hour = hour;
    } // setting house

    public void setMinute(int minute){
        this.minute = minute;
    } // setting minute

    public void setSecond(int second){
        this.second = second;
    } // setting seconds

    public int getHour(){
        return hour;
    } // getters

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public String toString(){
        return String.format("%02d: %02d : %02d", this.hour, this.minute, this.second);
    }
    public String standardTime(){ // getting standardTime
        return String.format("%02d: %02d : %02d %s", (((getHour() == 0 || getHour() == 12) ? 12:getHour()%12)),
                                                      getMinute(), getSecond(), (getHour() < 12)? "AM":"PM");
    }
    public MyTime nextSecond(){ // calculating new nextsecond
        MyTime returnTime = new MyTime(   (this.hour + (this.minute/60))%24 ,
                                        (this.minute + (this.second/60))%60 ,
                                        (this.second + 1)%60);
        return returnTime;
    }

    public MyTime nextMinute(){// calculating new nextminute
        MyTime returnTime = new MyTime(   (this.hour + (this.minute/60))%24 ,
                                        (this.minute + 1 +(this.second/60))%60 ,
                                        (this.second)%60);
        return returnTime;
    }

    public MyTime nextHour(){// calculating new nexthour
        MyTime returnTime = new MyTime(   (this.hour +1 + (this.minute/60))%24 ,
                                        (this.minute + (this.second/60))%60 ,
                                        (this.second)%60);
        return returnTime;
    }

    public MyTime previousSecond(){
        MyTime returnTime = new MyTime(   (this.hour + (this.minute/60))%24 ,
                                        (this.minute + (this.second/60))%60 ,
                                        (this.second - 1)%60);
        return returnTime;
    }

    public MyTime previousMinute(){
        MyTime returnTime = new MyTime(   (this.hour + (this.minute/60))%24 ,
                                        (this.minute - 1+ (this.second/60))%60 ,
                                        (this.second)%60);
        return returnTime;
    }

    public MyTime previousHour(){
        MyTime returnTime = new MyTime(   (this.hour - 1 + (this.minute/60))%24 ,
                                        (this.minute + (this.second/60))%60 ,
                                        (this.second)%60);
        return returnTime;
    }
}
