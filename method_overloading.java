public class method_overloading {
    //method with same name but different datatype or number of parameters
    static int add(int a, int b) {
        return a+b;
    }
    
    static float add(float a, float b) {
        return a + b;
    }
    
    static float add(float a, float b,float c) {
        return a + b+c;
    }
   public static void main(String[] args) {
       System.out.println("method with int type");
       int a=add(2,3);
       System.out.println(a);
       System.out.println("method with flaot type");
       float b=add(7.8f, 76.9f);
       System.out.println(b);
       System.out.println("method with 3 parameters ");
       float c=add(4.8f,5.6f,6.9f);
       System.out.println(c);
   }
}
