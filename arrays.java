public class arrays {
    public static void main(String[] args) {//main
        //datatype[] arrayname; declaration
        // datatype[] arrayname={value1,value2.......valuen};
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
