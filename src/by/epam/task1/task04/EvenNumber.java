package by.epam.task1.task04;



 class EvenNumber {

    public  boolean result(int[] arr,int n){
        int counter = 0;
        for (int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                counter++;
            }
        }
        return counter > 1;
    }

}
