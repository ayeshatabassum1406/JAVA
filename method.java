public class method {
    // here static means its belongs to main class and its not object of main class 
    static void mymethod(){
        System.out.println("this is my method");
    }
    //parameters pass through methods
    static void mymethod2(String fname){ // fname is parameter
        System.out.println("first name="+fname);
    }
    
    //multiple  parameters pass through methods
    static void mymethod2(String fname, int age) { 
        System.out.println("first name=" + fname);
        System.out.println("age="+age);
    }
    // method returning value
    static int return_method(int x){
        return x++;
    }
    
    public static void main(String[] args) {
        //method call
        mymethod(); // can call methid many times
        // passing arguments through method call
        mymethod2("anaya");// passigng arguments
        // multiple arguments
        mymethod2("zara", 12);
        // method call 
        System.out.println(return_method(2));
    }
    
}
