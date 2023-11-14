public class oopsmethod {
    static void mystaticmethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    public void mypublicmethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    //method with parmeters
    public void parameters(int value){
        System.out.println("this is value:"+value);
    }
   
    public static void main(String[] args) {
        mystaticmethod();//call the static method
        //call the public method
        oopsmethod myobj=new oopsmethod();
        myobj.mypublicmethod();
         oopsmethod myobj2=new oopsmethod();
         myobj2.parameters(200);

    }
}
