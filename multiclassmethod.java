public class multiclassmethod {
    public void add(int a, int b)// with void method
    {
        System.out.println(a + b);
    }

    public int  sub(int a, int b) {// with return type
       return a-b;
    }

   static void multi(int a,int b){// it  needs obj to call outside class
        System.out.println(a*b);
    }

    static  int div(int a,int b){// its need obj to call outside class
        int c;
        c=(b!=0)?a/b:b;
        return c;
    }
}
