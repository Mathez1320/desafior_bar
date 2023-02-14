package program;

import java.util.Locale;
import java.util.Scanner;

import pub.Bill;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill billFromCliente = new Bill();
		
		System.out.print("Sexo: ");
		billFromCliente.gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		billFromCliente.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		billFromCliente.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		billFromCliente.barbercue = sc.nextInt();
		
		
		
		System.out.println("RELATÓRIO:  ");
		System.out.printf("Consumo = R$ %.2f%n ", billFromCliente.feeding());
		if(billFromCliente.cover() > 0)
		{
			System.out.printf("Couver = %.2f%n", billFromCliente.cover());
		}else 
		{
			System.out.println("Isento de Couvert");
		}
		System.out.printf("Ingresso = R$ %.2f%n ", billFromCliente.ticket());
		System.out.printf("Valor a pagar = R$ %.2f%n", billFromCliente.total());
		sc.close();
	}

}
