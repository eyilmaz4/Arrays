package ArraysStudy;

public class lessThan4 {
    public static void findLess4(String [] arr){
       int index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].length()<4 ){
                index++;
            }
        }
        System.out.println(index);
    }
}
