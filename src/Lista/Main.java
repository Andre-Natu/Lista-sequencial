package Lista;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		boolean repete = true;
		
		Modificar_Lista x = new Modificar_Lista();
		
		Scanner scr = new Scanner(System.in);
		// Menu usado para as operações da lista
		while(repete) {
			
			
			System.out.println("\nDigite a operação desejada:");
			System.out.println("\n1 - Criar Lista \n2 - Verificar Lista \n3 - Verificar tamanho da lista"
					+ "\n4 - Obter valor de um elemento da lista \n5 - Modificar valor de um elemento da lista"
					+ "\n6 - Adicionar elemento"
					+ "\n7 - Remover elemento"
					+ "\n8 - Terminar o programa");
			try{
				
				opcao = scr.nextInt();
			
				switch(opcao) {
					case 1:
						x.criar_lista();
						break;
					case 2:
						x.verificar_lista();
						break;
					case 3:
						x.tamanho_lista();
						break;
					case 4:
						x.obter_valor(scr);
						break;
					case 5:
						x.modificar_valor(scr);
						break;
					case 6:
						
						x.adicionar_elemento(scr);
						break;
					case 7:
						x.remover_elemento(scr);
						break;
					case 8:
						repete = false;
						break;
					default:
						System.out.println("Opção inválida");
				}
			
			}catch (Exception e) {
				System.out.println("Algo deu errado");
			}	
		
		}
		
		scr.close();
	}

}
