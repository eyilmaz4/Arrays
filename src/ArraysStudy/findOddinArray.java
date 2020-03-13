package ArraysStudy;

public class findOddinArray {
    public static void findOdd(int [] arr){
       int number=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2!=0){
                number++;
            }

        }System.out.println(number);
    }
}
