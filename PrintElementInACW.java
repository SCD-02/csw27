import java.util.Scanner;

public class PrintElementInACW {

	public static void printInCW00(int a[][]) {
		int m=a.length-1, n=a[0].length-1;
		int r=0,c=0;
		int t=0;
		
		while(t<a.length*a[0].length) {
			
			for(int j=r;j<=m;j++) {
				System.out.print(a[j][c]+ " ");t++;
			}
			c++;
			for(int i=c;i<=n;i++) {
				System.out.print(a[m][i]+" ");t++;
			}
			m--;
			
			for(int j=m;j>=r;j--) {
				System.out.print(a[j][n]+ " ");t++;
			}
			n--;
			for(int i=n;i>=c;i--) {
				System.out.print(a[r][i]+" ");t++;
			}
			r++;
		}
	}
	
	public static void printInCW0n(int a[][]) {
		int m=a.length-1, n=a[0].length-1;
		int r=0,c=0;
		int t=0;
		
		while(t<a.length*a[0].length) {
			
			for(int i=n;i>=c;i--) {
				System.out.print(a[r][i]+" ");t++;
			}
			r++;
			for(int j=r;j<=m;j++) {
				System.out.print(a[j][c]+ " ");t++;
			}
			c++;
			for(int i=c;i<=n;i++) {
				System.out.print(a[m][i]+" ");t++;
			}
			m--;
			
			for(int j=m;j>=r;j--) {
				System.out.print(a[j][n]+ " ");t++;
			}
			n--;
			
		}
	}
	
	public static void printInCWn0(int a[][]) {
		int m=a.length-1, n=a[0].length-1;
		int r=0,c=0;
		int t=0;
		
		while(t<a.length*a[0].length) {
			
			for(int i=c;i<=n;i++) {
				System.out.print(a[m][i]+" ");t++;
			}
			m--;
			
			for(int j=m;j>=r;j--) {
				System.out.print(a[j][n]+ " ");t++;
			}
			n--;
			for(int i=n;i>=c;i--) {
				System.out.print(a[r][i]+" ");t++;
			}
			r++;
			for(int j=r;j<=m;j++) {
				System.out.print(a[j][c]+ " ");t++;
			}
			c++;
		}
	}
	
	public static void printInCWnn(int a[][]) {
		int m=a.length-1, n=a[0].length-1;
		int r=0,c=0;
		int t=0;
		
		while(t<a.length*a[0].length) {
			
			for(int j=m;j>=r;j--) {
				System.out.print(a[j][n]+ " ");t++;
			}
			n--;
			for(int i=n;i>=c;i--) {
				System.out.print(a[r][i]+" ");t++;
			}
			r++;
			for(int j=r;j<=m;j++) {
				System.out.print(a[j][c]+ " ");t++;
			}
			c++;
			for(int i=c;i<=n;i++) {
				System.out.print(a[m][i]+" ");t++;
			}
			m--;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter matix size: ");
		int n=sc.nextInt();
		int a[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=(int) (Math.random()*9+1);
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		printInCW00(a);
		System.out.println();
		printInCW0n(a);
		System.out.println();
		printInCWn0(a);
		System.out.println();
		printInCWnn(a);
		System.out.println();
		sc.close();
		sc.close();
	}

}
