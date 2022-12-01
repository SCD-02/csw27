import java.util.Scanner;

public class MultiplyMat {

	public static int[][] multiplyMatrix(int a[][],int b[][]){
		if(a[0].length!= b.length) {
			return null;
		}
		int c[][]=new int [a.length][b[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				int res=0;
				for(int k=0;k<a[0].length;k++) {
					res+=a[i][k]*b[k][j];
				}
				c[i][j]=res;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter row and column of 1st matrix: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.print("Enter row and column of 1st matrix: ");
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		int arr1[][]=new int [m][n];
		int arr2[][]=new int [m1][n1];
		System.out.println("Enter 1st Matrix: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2nd Matrix: ");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		int output[][]=multiplyMatrix(arr1,arr2);
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
