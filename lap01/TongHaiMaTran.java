import java.util.Scanner;
public class TongHaiMaTran {
	public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số hàng của ma trận: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int n = scanner.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] arr3 = new int[m][n];
        System.out.print("Nhập các phần tử của ma trận 1: \n");
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		 System.out.printf("a1[%d][%d] = ", i,j);
                 arr1[i][j] = scanner.nextInt();
        	}
        }
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		 System.out.printf("a2[%d][%d] = ", i,j);
                 arr2[i][j] = scanner.nextInt();
        	}
        }
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		arr3[i][j]=arr1[i][j]+arr2[i][j];
        	}
        }
        System.out.println("Kết quả là: ");
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		System.out.printf("a1[%d][%d] = ", i,j);
        		System.out.println(arr3[i][j]);
        	}
        }
    }
}
