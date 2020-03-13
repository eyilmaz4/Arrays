package ArraysStudy;

public class halfArray {
    public static void half(int [] arr){
        int size=(int)(arr.length/2);
        int [] newArray1=new int [size];
        int [] newArray2=new int [arr.length-size];
        int index=0;
        for(int i=0; i<size; i++){
            newArray1[index]=arr[i];
            index++;
        }
        for(int num:newArray1){
            System.out.print(num);
        }
        System.out.println();
        System.out.println("-------");
        index=0;
        for(int i=size; i<(arr.length); i++){
            newArray2[index]=arr[i];
            index++;
        }
        for(int num:newArray2){
            System.out.print(num);
        }
    }
}
