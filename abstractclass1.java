abstract class abstractclass1 {
    // An abstract method belongs to an abstract class, and it does not have a body.
    // The body is provided by the subclass:
    public String fname="john";
    public int age =22;
    public abstract void study();// this is abstract method withempty body
    
    }
    
    // Subclass (inherit from Main)
    class Student extends abstractclass1 {
        public int graduationYear = 2018;

        public void study() { // the body of the abstract method is provided here
            System.out.println("Studying all day long");
        }
    }

