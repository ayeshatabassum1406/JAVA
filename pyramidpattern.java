public class pyramidpattern {
    public static void main(String[] args) {
        // reverse pattern
        int rows=8;
        //below nested loops will create spaces on LHS of pyramid
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=i;j++){
               System.out.print(" ");
            }
            //below lines will disply reverse pyramid
            for(int k=0;k<=rows-1-i;k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
