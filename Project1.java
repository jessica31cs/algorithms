import java.util.*;
public class Project1
{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Insert the size of arrary : ");
        int n = s.nextInt();
        int a[] = new int[n];
        
        //int temp = n; //used for worst case
        for(int x = 0; x < n-1; x++){
            //a[x] = temp;  //used for worst case; reverse array
            //temp--;       //used for worst case
            
            //a[x] = x;       //used for best case; ordered array
            
            a[x] = (int)(Math.random() * 100);  //gives a random number from 0 to 100; used for average case
        }
        
        System.out.print("Random number to be inserted at the end: ");
        int b = (int)(Math.random() * 32);    //used for random input value
        System.out.println(b);
        //int b = s.nextInt();     //used for user input; for worst and best case
 
        System.out.print("Count : ");
        System.out.println(Insert(a, b));
        
        /*System.out.print("Sorted Array : ");
        for(int x = 0; x < a.length; x++){  //sorted array; not used for large n size array
                System.out.print(a[x]);
                System.out.print(" ");
        }*/
        System.out.println("\n");
    }
    
    static int Insert(int a[], int num){
        int count = 0;  //global counter
        a[a.length-1] = num;    //inserting the last element to the array
        for(int i = 1; i < a.length; i++){
            int j = i;
            while(j > 0 && a[j]<a[j-1]){    //comparing values and swaping
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
                count++;
            }
        }
        return count;
    }
}
