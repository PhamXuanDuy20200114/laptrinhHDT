//Example 6: Giải Phương Trình
import javax.swing.JOptionPane;
import java.util.Scanner;
public class GiaiPhuongTrinh {

     private static Scanner scanner = new Scanner(System.in);
    
	 public static void main(String[] args) {
		
		System.out.println("***Chon 1 trong 3***: "
				+ "\n1.Giai phuong trinh a.x + b = 0 "
				+ "\n2.Giai he phuong trinh a1.x + b1.y = c1   a2.x + b2.y = c2 "
				+"\n3.Giai phuong trinh a.x^2 + b.x + c = 0 ");
		int m = scanner.nextInt();
		if(m == 1) {
			
			System.out.println("Nhap he so a: ");
			float a = scanner.nextFloat();
			System.out.println("\nNhap he so b: ");
			float b = scanner.nextFloat();
			if(a == 0) {
				if(b==0) {
					System.out.println("\nPhuong trinh vo so nghiem\n");
				}
				else {
					System.out.println("Phuong trinh vo nghiem\n");
				}
			}
			else {
				float c = -b/a;
				System.out.println("Phuong trinh co nghiem la: " + c);
			}
		}
		else {
			if(m ==2) {
				System.out.println("Nhap he so a1: ");
				float a1 = scanner.nextFloat();
				System.out.println("Nhap he so b1: ");
				float b1 = scanner.nextFloat();
				System.out.println("Nhap he so c1: ");
				float c1 = scanner.nextFloat();
				System.out.println("Nhap he so a2: ");
				float a2 = scanner.nextFloat();
				System.out.println("Nhap he so b2: ");
				float b2 = scanner.nextFloat();
				System.out.println("Nhap he so c2: ");
				float c2 = scanner.nextFloat();
				if(a2*b1-a1*b2==0){
					if(c1*a2-c2*a1==0 && c1*b2 - c2*b1 == 0) {
						System.out.println("\nPhuong trinh vo so nghiem");
					}
					else {
						System.out.println("\nPhuong trinh vo nghiem");
					}
				}
				else {
					float x = (c1*b2-c2*b1)/(a1*b2-a2*b1);
					float y = (c1*a2-c2*a1)/(b1*a2-b2*a1);
					System.out.println("He phuong trinh co nghiem: "+
					"x=" + x +"; y= " + y);
				}
			}
			else {
				if(m==3) {
					System.out.println("Nhap he so a: ");
					float a = scanner.nextFloat();
					System.out.println("Nhap he so b: ");
					float b = scanner.nextFloat();
					System.out.println("Nhap he so c: ");
					float c = scanner.nextFloat();
					float denta = b*b-4*a*c;
					if(denta < 0) {
						System.out.println("Phuong trinh vo nghiem\n");
					}
					if(denta == 0) {
						float x = -b/(2*a);
						System.out.println("Phuong trinh co 1 nghiem kep: x = "+x);
					}
					if(denta>0) {
						float x1 = (float) (-b + Math.sqrt(denta))/(2*a);
						float x2 = (float) (-b - Math.sqrt(denta))/(2*a);
						System.out.println("Phuong trinh co hai nghiem x1 = " + x1 +
																	   "; x2 = " + x2);
					}
				}
			}
		}
	}
}
