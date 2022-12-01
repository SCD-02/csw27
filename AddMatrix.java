import java.util.Scanner;

public class AddMatrix {

	public static int[][] addMatrix(int a[][], int b[][]) {
		if(a.length!=b.length||a[0].length!=b[0].length) {
			return null;
		}
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter row and column: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr1[][]=new int [m][n];
		int arr2[][]=new int [m][n];
		System.out.println("Enter 1st Matrix: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2nd Matrix: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		int output[][]=addMatrix(arr1,arr2);
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	
}
