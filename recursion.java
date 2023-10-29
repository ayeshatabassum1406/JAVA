import javax.swing.plaf.synth.SynthStyleFactory;

public class recursion {
    public static void main(String[] args) {
        //recursion
        int result=sum(10);
        System.out.println(result);
        //recursion with halting condition
        //halting means stopping condition, every recursion should have stopping condition
        System.out.println("halting recursion");
        int result1=sum(5,10);
        System.out.println(result1);
    } 
    //recursion
    static int sum(int a){
        if(a>0){
            return a+sum(a-1);
        }
        else{
            return 0;
        }
    }
    //halting resursion function
    static int sum(int a,int b){
        if(b>a){
            return b+sum(a,b-1);
        }
        else{
            return a;
        }
    }
}
