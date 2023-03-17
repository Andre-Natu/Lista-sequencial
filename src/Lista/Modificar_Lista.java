package Lista;

import java.util.Scanner;

public class Modificar_Lista {
	
	// contador é a variável responsável por controlar a lista e list é o array da lista em sí.
	private final int TAMANHO = 20;
	private int[] list = new int[TAMANHO];
	private int contador;
	
	public void criar_lista() {
		contador = -1;
		
		System.out.println("A lista foi criada");
	}
	
	public void verificar_lista() {
		if(contador == -1) {
			System.out.println("\nA lista está vazia");
		} else {
			System.out.println("\nA lista está cheia");
		}
	}
	
	public int tamanho_lista() {
		System.out.println("\nO tamanho da lista é: " + (contador+1));
		return (contador+1);
	}
	
	// função usada para obter um valor na lista.
	public int obter_valor(Scanner scr) {
		int valor = 0, posicao = 0;
		
		// for que mostra todos os valores e a sua posição na lista
		for(int i = 0; i <= contador; i++) {
			System.out.println("\nO valor do elemento " + (i+1) + " é: " + list[i]);
		}
		
		// scanner que pergunta qual elemento deseja obter o valor
		System.out.println("\nDigite o elemento que deseja obter o valor: ");
		posicao = scr.nextInt();		
		
		valor = list[posicao-1];
		
		return valor;
	}
	
	// função utilizada para modificar um valor.
	public void modificar_valor(Scanner scr) {
		int  valor = 0;
		
		
		System.out.println("\nDigite a posição que deseja modificar: ");
		int posicao = scr.nextInt();
				
		System.out.println("\nDigite o novo valor: ");
		valor = scr.nextInt();
		
		list[posicao-1] = valor;
		
		System.out.println("\nO novo valor da posição " + posicao + " é " + list[posicao-1]);
	}
	
	public void adicionar_elemento(Scanner scr) {
		boolean repete = true;
		
		// adicionando um elemento a mais no array e no contador
		contador ++;
		
		// condição caso o usuario digite uma posição inválida
		while(repete) {
			System.out.println("\nDigite a posição em que deseja adicionar o elemento: ");
			int posicao = scr.nextInt();
				
			// se a posição digitada não existir na lista, o loop será repetido.
			if(((posicao-1) > contador) || (posicao <= 0) ) {
					System.out.println("\nEsta posição não existe na lista");
					repete = true;
			}else {
				int valor = 0;
				int[] listAuxiliar = new int[TAMANHO*2];
				
				System.out.println("\nDigite o valor do novo elemento: ");
				valor = scr.nextInt();
				
				
				// copio todos os valores depois da posição desejada para um array auxiliar
				for(int i = (posicao-1); i < contador; i++) {
					listAuxiliar[i] = list[i];
				}
				
				// mudo o valor na posição digitada
				list[posicao-1] = valor;
				
				// copio de volta os valores originais na frente da posição digitada
				for(int i = (posicao); i < contador; i++) {
					list[i] = listAuxiliar[i];
				}
				
				System.out.println("O valor adicionado foi: " + list[posicao-1]);
				
				repete = false;
			}
		}
		
		
	}
	
	public void remover_elemento(Scanner scr) {
		
		boolean repete = true;
		
		// condição caso o usuario digite uma posição inválida
		while(repete) {
			System.out.println("\nDigite a posição em que deseja remover o elemento: ");
			int posicao = scr.nextInt();
				
			// se a posição digitada não existir na lista, o loop será repetido.
			if(((posicao-1) > contador) || (posicao <= 0) ) {
					System.out.println("\nEsta posição não existe na lista");
					repete = true;
			}else {
				int[] listAuxiliar = new int[TAMANHO*2];
				
				// copio todos os valores depois da posição desejada para um array auxiliar
				for(int i = (posicao-1); i <= contador; i++) {
					listAuxiliar[i] = list[i];
				}
				
				
				// copio de volta os valores originais atrás da posição digitada
				for(int i = (posicao); i <= contador; i++) {

					list[i-1] = listAuxiliar[i];

					
				}
				
				contador --;
				System.out.println("Elemento removido com sucesso.");
				
				repete = false;
			}
		}
	}
}
