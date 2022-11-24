//#Example 5: Tính tông hiệu tích phương hai số người dùng nhập vào
import javax.swing.JOptionPane;
public class TongHieuTichThuong {
	public static void main(String[] args) {
		String strnum1, strnum2;
		strnum1 = JOptionPane.showInputDialog(null,"Enter the first number",
				"Input the first number ", 
				JOptionPane.INFORMATION_MESSAGE);
		strnum2 = JOptionPane.showInputDialog(null,"Enter the second number", 
				"Input the second number ",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strnum1);
		double num2 = Double.parseDouble(strnum2);
		double tong = num1 + num2;
		double hieu = num1 - num2;
		double tich = num1*num2;
		double thuong = num1/num2;
		System.out.println("Tong: " + tong + "\nHieu: "+ hieu + 
				"\nTich: " + tich + "\nThuong: " + thuong);
		System.exit(0);
	}

}
