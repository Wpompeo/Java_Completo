package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Products;
import entities.UsedProduct;

public class ProgamProduct {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Products> list = new ArrayList<>();
		
		System.out.println("Entre com o número de produtos: ");
		int numberProducts = sc.nextInt();
		
		for(int i=0; i<=numberProducts; i++) {
			System.out.println("Dados do produto #" + i + ":");
			System.out.println("Comum, usado, importado (c/u/i)? ");
			char typeProduct = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Preço: ");
			double price = sc.nextDouble();
			
			if(typeProduct == 'u') {
				System.out.println("Data de fabricação (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			else {
				System.out.println("Taxa de importação: ");
				double customsFree = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFree));
			}
		}
		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO: ");
		for(Products prod : list) {
			System.out.println(prod.priceTag());
		}		
		sc.close();		
	}	

}
