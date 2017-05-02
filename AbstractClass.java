/**
 * Created by TimeStoper on 3/5/2560.
 */
 class AbstractClass {
    public static void main(String args[]){
        Sample s = new Sample();
        s.xx();
        s.sayweb();
        s.test();
    }
}

abstract class foo{
    public void xx() {
        System.out.println("FUCK");
    }
    public void test(){
        System.out.println("FF");
    }

    abstract void sayweb();
    abstract void s();
}
class Sample extends foo {

    public void sayweb() {
        System.out.print("xx");
    }

    public void s() {
        System.out.println("sd");
    }
}

