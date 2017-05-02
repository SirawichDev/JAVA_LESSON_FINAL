import java.util.Scanner;

/**
 * Created by TimeStoper on 2/5/2560.
 */
public class FindUseThread {

    public static void main(String args[]){
        int[] x=new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<x.length;i++){
            x[i]=in.nextInt();
        }


            AVER s1 = new AVER(x, x.length);
            MAX s2 = new MAX(x,x.length);
            Thread t1 = new Thread(s1);
        Thread t2 =new Thread(s2);
            try {
                t1.start();
                t2.start();
                t1.join();
                t2.join();
            }catch(Exception e) {
            }
        System.out.println("Max of array is : "+s2.getMax()+" and Average is :" +s1.getAverage());
            }
        }
class AVER implements Runnable{
    int from[],where;
    double average;
    public AVER(int from[],int where){
        this.from=from;
        this.where=where;
    }
public void run(){
    int sum=0;
    for(int i =0;i<where;i++){
        sum+=from[i];;
        average=sum/where;
    }
}
    public double getAverage(){
        return average;
    }
}
class MAX implements Runnable{
    int from[],where;
    int MAX;
    double average;
    public  MAX(int from[],int where){
    this.where =where;
        this.from = from;
    }
    public void run(){
        int sum=0;
        for(int i=0;i<where;i++){
            if(from[i]>MAX){
                MAX = from[i];
            }

        }
    }
    public int getMax(){
        return MAX;
    }
}


