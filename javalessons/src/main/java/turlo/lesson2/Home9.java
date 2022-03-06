package turlo.lesson2;

public class Home9 {
    public static void main(String[] args) {
        arr(5,5);
        printArrayInConsole(int[] inputArray;)
    }
    public static int[] arr(int len,int initialValue){
        int[] arr =new int[len];
        for(int i=0; i<arr.length;i++){
            arr[i]=initialValue;
        }
        return arr;
    }
    public static void printArrayInConsole(int[] inputArray){
        for(int i=0; i<inputArray.length;i++){

    System.out.print(inputArray[i] +" ");}
        System.out.println();
        printArrayInConsole(arr(5,5));
}}
