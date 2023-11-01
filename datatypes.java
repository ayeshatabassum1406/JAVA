public class datatypes{
    public static void main(String args[]) {
        byte b= 127; //-128 to 127 i.e 2^7-1 to -2^7
        short s=32767; //2^15-1 to 2615
        int i=122222;
        long l=34566L;// end with L
        float f= 34.67f; //end with f, has precision of 6 to 7 digits
        double d=234.56d;//ends with d, has precision of 15 digits
        boolean bo=true;
        char c1='a';//a
        char c2=65;//A
        String st="I love java";
        //FINAL KEYWORD
        final int fin=75; //unchanged variable and is read only
        //scientific numbers
        // e or E indicats power of 10
        float sc=35e3f;// with power of 10 raise to 3 and precision 3
        System.out.println("byte="+b);//syso
        System.out.println("short=" + s);
        System.out.println("int=" + i);
        System.out.println("long=" + l);
        System.out.println("float=" + f);
        System.out.println("doudle=" + d);
        System.out.println("boolean=" + bo);
        System.out.println("char=" + c1);
        System.out.println("char=" + c2);
        System.out.println("string=" + st);
        System.out.println("final ="+fin);
        System.out.println(sc);
    }
}