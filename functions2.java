public class functions2 {
    //static void method_name(datatypes varriable1......dtn varn){}
    //call :methodname(varible or data)
    //parameters
    static void add(int a, int b){
        System.out.println(a+b);
    }
    //function with return type
    static int add1(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("called add fucntion");
        //passing arguments
        int a=14,b=16;
        add(a,b);
        //func call with return type
        int c=0;
        c=add1(a, b);
        System.out.println("function wit return type");
        System.out.println(c);

    }
}
