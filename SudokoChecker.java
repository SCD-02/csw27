public class SudokoChecker {

  public static boolean sudokoChecker(int a[][]) {
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
    return true;
  }

  public static void traverseSubMat(int a[][], int p, int q) {
    while (p < 9 && q < 9) {
      System.out.println("SubMatrix " + p + "," + q + " to " + (p + 2) + "," + (q + 2));
      for (int i = p; i <= p + 2; i++) {
        for (int j = q; j <= q + 2; j++) {
          System.out.print(a[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println();
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
  }

  public static void main(String[] args) {

    int s[][] = {

        { 6, 1, 9, 7, 4, 2, 3, 5, 8 },
        { 4, 5, 7, 8, 3, 1, 6, 9, 2 },
        { 8, 2, 3, 6, 9, 5, 1, 7, 4 },

        { 2, 3, 6, 4, 1, 9, 5, 8, 7 },
        { 5, 9, 1, 2, 7, 8, 4, 6, 3 },
        { 7, 8, 4, 3, 5, 6, 2, 1, 9 },

        { 9, 6, 2, 1, 8, 3, 7, 4, 5 },
        { 3, 4, 5, 9, 6, 7, 8, 2, 1 },
        { 1, 7, 8, 5, 2, 4, 9, 3, 6 }

    };
    System.out.println(sudokoChecker(s));

    traverseSubMat(s, 0, 0);
  }

}