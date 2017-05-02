/**
 * Created by TimeStoper on 2/5/2560.
 */
public class Threadss implements Runnable {
    int from,where,result;
    Threadss(int from,int where){
        this.from = from;
        this.where = where;
        result=0;
    }
    public void run(){
        for(int i = from;i<where;i++){
            result += i;
        }
    }
    public int getResult(){
        return result;
    }

    public static void main(String args[]){
        int sum=0;
        Threadss s1 =new Threadss(0,1000);
        Threadss s2 = new Threadss(1001,10000);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            sum = s1.getResult()+s2.getResult();
        }catch(Exception e) {
        }
        System.out.println("Result : "+sum);
        }
}
