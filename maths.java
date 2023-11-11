import java.util.Math
public class maths {
    public static void main(String[] args) {
        System.out.println("Max:"+ Math.max(5,10));
        System.out.println("Min:" + Math.min(5, 10));
        System.out.println("sqrt:" + Math.sqrt(10));
        System.out.println("abs(-7.7):" + Math.abs(-7.7));//return absolute value
        //random number generate btw 0.0(invlusive) and (1.0) excusive
        System.out.println("Random:"+Math.random());
        //get more control over random
        int randomnum=(int)(Math.random()*101);//0 10 100
        System.out.println(randomnum);

    }
}
