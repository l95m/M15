package beispiel;

public class StringReverse {

	public static void main(String[] args) {
		
		String hw = "Hello World!";
		// String zum zwischenspeichern
		String reverse = "";
		
		// Methode char Array
		char[] cArr = hw.toCharArray();
		
		for (int i = cArr.length-1; i >= 0; i--) {
			reverse += cArr[i];
		}
		
		hw = reverse;
		
		System.out.print(hw);
		
		
		// Methode ohne char Array
		
		for (int i = hw.length()-1; i >= 0; i--) {
			reverse += hw.charAt(i);
		}
		
		System.out.print(reverse);
		
	}

}
