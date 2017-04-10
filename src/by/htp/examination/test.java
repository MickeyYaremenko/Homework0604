package by.htp.examination;

public class test {

	public static void main(String[] args) {
		String num = "1234";
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < num.length(); i++){
			a = (int) (a + Character.getNumericValue(num.charAt(i)) * Math.pow(10, (num.length() - i - 1)));
		}
		System.out.println(a);
		
		b = Integer.parseInt(num);
		System.out.println(b);
		
		int c = Integer.valueOf(num);
		System.out.println(c);
		
		int d = Integer.decode(num);
		System.out.println(d);
		
		int e = new Integer(num);
		System.out.println(e);
		
		String asd = "aasd" + "asdasd";
	}
}
