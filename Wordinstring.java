import java.util.Scanner;

public class Wordinstring {
    public static void main(String[]args){
        get1();
    }
    
static void get1(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String:");
    String n=sc.nextLine();
    wordCount(n);
    sc.close();
}
static void wordCount(String a){
    String[] arr = a.toLowerCase().split("\\s+"); 
    boolean[] visited = new boolean[arr.length]; 

    System.out.println("Word Frequency:");
    for (int i = 0; i < arr.length; i++) {
        if (visited[i]) {
            continue;
        }

        int count = 1;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i].equals(arr[j])) {
                count++;
                visited[j] = true; 
            }
        }

        System.out.println(arr[i] + ": " + count);
    }
}
}