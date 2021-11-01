package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Júnior".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", x)
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
	}
}
