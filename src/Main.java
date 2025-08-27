import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the numbers for the array: ");
        for(int i = 0; i<n; i++){
            array[i] = scan.nextInt();
        }

        int l = 0;
        for(int r=1; r<n; r++){
            if(array[l] != array[r]){
                l++;
                array[l] = array[r];
            }
        }

        for(int i = 0; i<=l; i++){
            System.out.print(array[i]+" ");
        }
    }
}