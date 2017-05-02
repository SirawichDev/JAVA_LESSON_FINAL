import java.util.Scanner;

/**
 * Created by TimeStoper on 2/5/2560.
 */
public class ThreadClassDemo {
    public static void main(String args[]){
        double[] num = new double[5];
Scanner in =new Scanner(System.in);
        for(int i =0;i<num.length;i++){
            num[i] = in.nextDouble();
        }
        AverageNumber aver = new AverageNumber(num,num.length);
        MaximumNumber max = new MaximumNumber(num,num.length);
    Thread t1 = new Thread(aver);
        Thread t2=new Thread(max);
        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }catch(Exception e){}
        System.out.println("Average number is :"+aver.getAverage());
        System.out.println("Maximum number is :"+max.GetMax());
    }
}
class MaximumNumber implements Runnable{
    double num[],length;
    double max;
    public MaximumNumber(double num[],double length){
        this.num = num;
        this.length = length;
    }
    public void run(){

        for(int i=0;i<length;i++){

            if(num[i] > max){
                max =num[i];
            }
        }
    }
    public double GetMax(){
        return max;
    }
}
class AverageNumber implements Runnable{
    double num[],length;
    double Average;
    public AverageNumber(double num[],double length ){
        this.num =num;
        this.length=length;
    }
    public void run(){
        double sum=0;
        for(int i=0;i<length;i++){
            sum+=num[i];
        }
        Average = sum/length;
    }
    public double getAverage(){
        return Average;
    }
}