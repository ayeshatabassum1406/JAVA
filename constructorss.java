public class constructorss {
    int x; // create a class attribute
    //create a class constructor for main class
    public constructorss(){
        x=5;
    }
    //parameters constructor
    public constructorss(int y){
        x=y;
    }
    public static void main(String[] args) {
        constructorss myobj=new constructorss();
        System.out.println(myobj.x);
        constructorss obj2=new constructorss(10);
        System.out.println(obj2.x);
    }
}
