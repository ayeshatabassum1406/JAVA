public class encapsulation {
    //Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

// declare class variables/attributes as private
// provide public get and set methods to access and update the value of a private variable
private String name; //private :restricted access
//getter 
public String getName(){
    return name;// The get method returns the value of the variable name.

}
public void setName(String newname){
    this.name=newname; // The set method takes a parameter (newName) and assigns it to the name
                         // variable. The this keyword is used to refer to the current object.

}
//this below code will work because in same class
//to access in different class see encapsulation2
// public static void main(String[] args) {
//     encapsulation obj=new encapsulation();
//     obj.name="john";
//     System.out.println(obj.name);
// }
}
