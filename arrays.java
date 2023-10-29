public class arrays {
    public static void main(String[] args) {//main
        //datatype[] arrayname; declaration int[] arr;
        //array creation arr = new int[10];
        // datatype[] arrayname={value1,value2.......valuen}; or datatype[] arrayname = new int[array_size];//declartion and initialization
        int[] array=new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=2*i;
        }
        for (int i = 0; i < array.length; i++){
        System.out.println("2x"+i+"="+array[i]);
        }
        String[] arr={"hello","hi","good"};
        //to access array: arrayname[indexnumber]
        System.out.println(arr[1]);
        //to change arr element: arr[indexnumber]=newvalue
        arr[1]="ih";
        System.out.println(arr[1]);

        //t get length of array:arrname.length
        System.out.println(arr.length);
        //multi dimensional array
        System.out.println("multidimension array");
        //datatype[][] arrayname={{valuea1....valuean},{valueb1.....valuebn}};
        int[][] arr2={{1,2,3},{4,5,6}};
        //to acess array:arrayname[row][col]
        System.out.println(arr2[0][2]);

        
    }

}
