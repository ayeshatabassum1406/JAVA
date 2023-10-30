public class break_continue {
    public static void main(String[] args) {
        //break
        int i;
        for(i=0;i<20;i=i+2)
        {
            
            if(i==10){
                System.out.println("its 10");
                break;
            }
            System.out.println(i);
            
        }
        int j;
        for (j = 0; j < 20; j = j + 2) {

            if (j == 10) {
                System.out.println("it was 10");
                continue;
            }
            System.out.println(j);

        }
    }
}
