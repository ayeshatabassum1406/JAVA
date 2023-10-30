public class loops {
    public static void main(String args[])
    {
        //loop 1
        int i;
        for(i=0;i<=10;i++)
        {
            System.out.println("loop1:i= "+i);
        }
        //loop2
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        //for(datatype variablename:arrayname)
        for(int j:arr)
        {
            System.out.println("loop2: j= "+j);
        }
        //while
        int k=0;
        while(k<10){
            System.out.println("while:"+k);
            k++;
        }
        //do while
        int p = 0;
        do {
            System.out.println(" do while:" + p);
            p++;
        }while (p < 10);

    }
}
