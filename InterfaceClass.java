/**
 * Created by TimeStoper on 3/5/2560.
 */
public class InterfaceClass  {
    public static void main(String args[]){
        fuck u =new fuck();
        u.sayme();
        u.sayyou();
    }
}
interface Interface{
    void sayme();
    void sayyou();
}
class fuck implements Interface{
    public void sayme(){
        System.out.println("X");
    }
    public void sayyou(){
        System.out.println("F");
    }
}