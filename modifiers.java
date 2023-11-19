public class modifiers {
    // If you don't want the ability to override existing attribute values, declare
    // attributes as final
    final int x=10;
    //A static method means that it can be accessed without creating an object of the class, unlike public
    static void mystatic(){
        System.out.println("this is static");
    }
    public static void main(String[] args) {
        modifier    s finalobj= new modifiers();
        //finalobj.x=12;//generates error
        System.out.println(finalobj.x);
        modifiers staticobj = new modifiers();
        staticobj.mystatic();
    }

}
