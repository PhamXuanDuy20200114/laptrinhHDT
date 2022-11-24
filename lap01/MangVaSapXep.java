import java.util.Scanner;
 
public class MangVaSapXep {
	public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[n];
        double sum=0;
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        for(int i=0 ; i<n ; i++) {
        	for(int j=i+1;j<n;j++) {
        		if(arr[i]>arr[j]){
        			int doi = arr[j];
        			arr[j]=arr[i];
        			arr[i]=doi;
        		}
        	}
        }
        for (int i = 0; i < n; i++) {
           sum += arr[i];
        }
        sum = sum/n;
        System.out.print("Các phần tử của mảng: ");
        show(arr);
        System.out.println("Trung binh cac phan tu trong mang la: "+sum);
        
    }
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
