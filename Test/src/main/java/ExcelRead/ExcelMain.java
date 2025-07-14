package ExcelRead;

import java.io.IOException;

public class ExcelMain {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws IOException {
			
			String s=ExcelCode.readStringData(2, 1);
			System.out.println(s);
			String s1=ExcelCode.readIntegerData(2, 0);
			System.out.println(s1);
			

		

	}

}
