package br.com.senai.teste;

public class TesteSwitch {
	public static void main(String[] args) {
		int valor = 1; 
		switch (valor) {   
		case 0:    System.out.println("cadastro de produto"); 
			break;   
		case 1:    
			  System.out.println("emitir nota fiscal");    
			  break;   
		case 2:    
			System.out.println("cancelar compra");    
			break;   
		default:    System.out.println("efetuar venda");    
		break;   } 
	}
}
