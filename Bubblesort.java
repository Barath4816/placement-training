import java.util.*;
class Bubblesort{
public static void main(String[]args){
    get1();
}
static void get1(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of Elements");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n ;i++){
        arr[i]=sc.nextInt();
    }
    bubble(arr);
    sc.close();
}
static void bubble(int[]arr){
    for(int i=0;i<arr.length-1;i++){
         for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
            int temp;
            temp =arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }}

    }
    for(int z=0;z<arr.length;z++)
    System.out.print(arr[z]);
}
}