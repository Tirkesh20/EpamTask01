package by.epam.task1.task04;



public class Task4 {

    public static boolean result(double[] arr,int n){
        int counter = 0;
        for (int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                counter++;
            }
        }
        return counter > 1;
    }

}
