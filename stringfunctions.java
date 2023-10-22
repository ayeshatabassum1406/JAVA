public class stringfunctions {
    public static void main(String[] args) {//main()
        String st="This is String Functions";
        
        System.out.println("length="+st.length());
        System.out.println("uppercase="+st.toUpperCase());
        System.out.println("lowercase="+st.toLowerCase());
        System.out.println(st.indexOf('S'));//finding the character in string
        System.out.println(st.indexOf("is"));
        String s="in Java";
        System.out.println(st+" "+s);
        System.out.println(st.concat(s));
    }
}
