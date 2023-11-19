class abstractclass2 {
    public static void main(String[] args) {
        //// create an object of the Student class (which inherits attributes and
        //// methods from Main)

       Student myobj =new Student();
        System.out.println("name="+myobj.fname);
        System.out.println("age=" + myobj.age);
        System.out.println("graduation year=" + myobj.graduationYear);
        myobj.study();
    }
}
// not working 