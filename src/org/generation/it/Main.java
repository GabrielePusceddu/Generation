package org.generation.it;

import java.util.Scanner;

//All'avvio del programma, chiedere quanti prodotti sono in vendita nel negozio, e successivamente far inserire per ogni prodotto:


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int i;
		boolean trovato;
		String daCercare, risposta;
		
		final int INVENTARIO=5;
		String [] nomeProdotto=new String [INVENTARIO];
		String [] prezzoProdotto=new String [INVENTARIO];
		String [] quantitàProdotto=new String[INVENTARIO];
		
		for (i=0;i<nomeProdotto.length;i++) {
			System.out.print("Inserisci il nome in posizione " + i+ ": ");
		nomeProdotto[i]=sc.nextLine();
		
		System.out.print("Inserisci il prezzo di " + nomeProdotto[i]+ ": ");
		prezzoProdotto[i]=sc.nextLine();
		
		System.out.println("Inserisci la quantità di " + nomeProdotto[i] + ": ");
		quantitàProdotto[i]=sc.nextLine();
		}
		
		do {
			System.out.println("Quale prodotto vuoi acquistare?: ");
			daCercare=sc.nextLine();
			trovato=false;
			for (i=0;i<nomeProdotto.length;i++)
				if (nomeProdotto[i].equalsIgnoreCase(daCercare)) {
					trovato=true;
					System.out.println("Nome: " + nomeProdotto[i] + " Prezzo: " + prezzoProdotto[i] + "Quantità: " + quantitàProdotto[i]);
				}
			if (!trovato)   //trovato==false
				System.out.println("Nome/numero non trovato!");
			System.out.println("Vuoi cercare un altro nome (s/n)?: ");
				risposta=sc.nextLine();
			
			
			
		} while (risposta.equalsIgnoreCase("s"));
		
	
		 
	}

}
