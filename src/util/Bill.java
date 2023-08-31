package util;

public class Bill {
	
	public static double COUVERT = 4.0;
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		return COUVERT;
	}
	
	public double feeding() {
		return (beer * 5) + (barbecue * 7) + (softDrink * 3);
	}		
	
	public double ticket() {
		if( gender == 'M') {
			return 10.0;
		} 
		else {
			return 8.0;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
	
	public String toString() {
		return "Valor a pagar = R$ " + String.format("%.2f", total());
	}
}
