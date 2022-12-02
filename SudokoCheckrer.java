
@SuppressWarnings("serial")
public class SudokoCheckrer extends Exception {

	public static boolean sudokoChecker(int a[][]) {
	  try {
		for (int i = 0; i < 9; i++) {
			int arr[] = new int[10];
			for (int j = 0; j < 9; j++) {
				if (arr[a[i][j]] >= 1) {
					return false;
				} else {
					arr[a[i][j]]++;
				}
			}
		}
		for (int i = 0; i < 9; i++) {
			int arr[] = new int[10];
			for (int j = 0; j < 9; j++) {
				if (arr[a[j][i]] >= 1) {
					return false;
				} else {
					arr[a[j][i]]++;
				}
			}
		}
		
		return true && checkSubMat(a);
	  }
	  catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("Dilli se Ho kya?? \nInput dalne nahi aata Kya??");
		  return false;
	  }
	}

	public static boolean checkSubMat(int a[][]) {
		int p=0,q=0;
		while (p < 9 && q < 9) {
			int arr[] = new int[10];
			for (int i = p; i <= p + 2; i++) {
				for (int j = q; j <= q + 2; j++) {
					if (arr[a[i][j]] >= 1) {
						return false;
					} else {
						arr[a[i][j]]++;
					}
				}
			}
			if (p == 0 && q == 0) {
				p = 0;
				q = 3;
			} else if (p == 0 && q == 3) {
				p = 0;
				q = 6;
			} else if (p == 0 && q == 6) {
				p = 3;
				q = 0;
			} else if (p == 3 && q == 0) {
				p = 3;
				q = 3;
			} else if (p == 3 && q == 3) {
				p = 3;
				q = 6;
			} else if (p == 3 && q == 6) {
				p = 6;
				q = 0;
			} else if (p == 6 && q == 0) {
				p = 6;
				q = 3;
			} else if (p == 6 && q == 3) {
				p = 6;
				q = 6;
			} else {
				p = 9;
				q = 9;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[][] = {

				{1,2,3, 4,5,6, 7,8,9}, 
				{9,1,2, 3,4,5, 6,7,8}, 
				{8,9,1, 2,3,4, 5,6,7},

				{7,8,9, 1,2,3, 4,5,6}, 
				{6,7,8, 9,1,2, 3,4,5}, 
				{5,6,7, 8,9,1, 2,3,4},

				{4,5,6, 7,8,9, 1,2,3}, 
				{3,4,5, 6,7,8, 9,1,2}, 
				{2,3,4, 5,6,7, 8,9,1}

		};
		System.out.println(sudokoChecker(s));
	}
	
//	public static boolean checkCond(int a[][], int p, int q) {
//		int arr[] = new int[10];
//		int i = p;
//		while (i >= 0) {
//			int j = q;
//			while (j >= 0) {
//				if (arr[a[p][q]] >= 1) {
//					return false;
//				} else {
//					arr[a[p][q]]++;
//				}
//				j--;
//			}
//			i--;
//		}
//		return true;
//	}
	
}

