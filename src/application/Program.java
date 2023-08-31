package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Bill bill = new Bill();
		
		System.out.println("Sexo: ");
		bill.gender = sc.next().charAt(0);
		
		System.out.println("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println("");
		System.out.println("RELATÓRIO");
		System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
		if(bill.feeding() > 30.0) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f%n", bill.cover() );
		}
		
		System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());		
		System.out.println("");
		System.out.println(bill);
		
		
		
		sc.close();

	}

}
