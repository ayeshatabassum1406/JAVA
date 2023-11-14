public class attributes {
    int x=14;
    public static void main(String[] args) {
        //modyfing the attributes
        attributes obj=new attributes();
        System.out.println(obj.x);
        System.out.println("after mdyfying");
        obj.x=16;
        System.out.println(obj.x);
    }
}
