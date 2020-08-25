import java.lang.reflect.Array;

public class Problems {
    //visakh_R
    double dBfr;
    double dAfr ;
    int bfrdp,aftdp,part1,part2,part3,part4;
    boolean flag=false;

    boolean areEqualByThreeDecimalPlaces(double number1,double number2){

        bfrdp=(int)number1;
        dBfr=number1-bfrdp;
        dAfr=dBfr*1000;
        aftdp=(int)dAfr;
        //System.out.println(dBfr);
        part1=bfrdp;
        part2=aftdp;

        bfrdp=(int)number2;
        dBfr=number2-bfrdp;
        dAfr=dBfr*1000;
        aftdp=(int)dAfr;
        //System.out.println(" "+bfrdp+" "+aftdp);
        part3=bfrdp;
        part4=aftdp;

        if(part1 == part3 && part2 == part4){
            return true;
        }
        else{
            return false;
        }

    }
    public static  boolean hasEqualSum(int number1,int number2,int number3){
        if (number1+number2==number3)
            return true;
        else
            return false;
    }
    boolean isLeapYear(int year){
        if (year<=9999 && year>=1){
            if (year%4==0)
                if (year%100==0)
                    if(year%400==0)
                        flag= true;
//            System.out.println("1");
        }
        else{
            flag=false;
//            System.out.println("2");
        }

        return flag;
    }
    public  static void megabytesAndKilobytes(int input){
        int megaByte;
        int kiloByte;
        if(input<0){
            System.out.println("Error Input");
        }
        else {
            megaByte=input/1024;
            kiloByte=input%1024;
            System.out.println("\" "+input+" \""+" = "+megaByte+" MB and "+kiloByte+" KB");

        }
    }
    static  int toMilesPerHour(double kilometersPerHour){
        double milePerhour;
        long roundedValue;
        if (kilometersPerHour<0)
            return -1;
        else {
            milePerhour=kilometersPerHour/1.609;
            roundedValue=Math.round(milePerhour);
        }
        return (int)roundedValue;
    }
    static void printConvertion(double kilometersPerHour){
        System.out.println(kilometersPerHour+" Km/h is "+toMilesPerHour(kilometersPerHour)+" Mi/h");


    }
    static boolean hasTeen(int age1,int age2,int age3){
        int age[]=new int[3];
        boolean flag=false;
        age[0]=age1;
        age[1]=age2;
        age[2]=age3;
        for(int i=0;i<3;i++){
            if(age[i]>=13 && age[i]<=19)
                flag=true;
        }
      return flag;
    }
    static boolean isTeen(int age){
        boolean flag=false;
        flag=hasTeen(age,0,0);
        return flag;
    }
    static boolean shouldWakeup(boolean barking,int hourOfDay){
        if(barking==true){
            if(hourOfDay>-1 && hourOfDay<24 ){
                if (hourOfDay>7 && hourOfDay<22)
                    return true;
            }
        }
        return false;
    }
    
}

