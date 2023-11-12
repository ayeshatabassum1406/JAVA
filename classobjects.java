// created class
public class classobjects {
    int x=5;
//creating objects of class
    public static void main(String[] args) {
        classobjects myobj=new classobjects();
        // to access attribute of class
        System.out.println("object1:"+myobj.x);
        //one class can have multiple objects
        classobjects myobj2 = new classobjects();
        classobjects myobj3 = new classobjects();
        classobjects myobj4 = new classobjects();
        System.out.println("object1:" + myobj.x);
        System.out.println("object2:" + myobj.x);
        System.out.println("object3:" + myobj.x);
        //no two objects are same
        System.out.println("obj2==obj3: "+(myobj2==myobj3));
        System.out.println("obj4==obj1: " + (myobj4 == myobj));
    }
}
