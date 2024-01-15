package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program {

public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		
		Bill bi = new Bill();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sexo: ");
		bi.gender = sc.next().charAt(0);
		
		System.out.println("Quantidade de cervejas: ");
		bi.beer = sc.nextInt();
		
		System.out.println("Quantidade de refrigerantes: ");
		bi.softDrink = sc.nextInt();
		
		System.out.println("Quantidade de espetinhos: ");
		bi.barbecue = sc.nextInt();
		
		System.out.println(); 
		System.out.println("RELATÓRIO: ");
		System.out.printf("Consumo = R$ %.2f\n", bi.feeding());
		System.out.printf("Couvert = R$ %.2f\n", bi.cover());
		System.out.printf("Ingresso = R$ %.2f\n", bi.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f", bi.total());
		
		sc.close();
	}	
}
