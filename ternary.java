public class ternary {
    public static void main(String[] args) {
        int a=1,b=10,result=0;
        //ternary
        result=a>=b?a:b;
        System.out.println("result="+result);
System.out.println("if else");
        //ternary is equailavnet to if else below
        if (a>=b){
            System.out.println("result="+a);
        }
        else
        {
            System.out.println("result=" + b);
        }
    }
}
