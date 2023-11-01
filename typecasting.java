public class typecasting {
    public static void main(String[] args) {
        //widening :automatic, byte->short->char->int->long->float->double
        int myint=9;
        double mydouble=myint;// Automatic casting: int to double
        //narrowing :manualdouble->float->long->int->char->short->byte
        double mydoub=9.7d;
        int myintt=(int)mydoub;
        System.out.println("widening="+mydouble);
        System.out.println("narrowing="+myintt);
    }
}
