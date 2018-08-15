package br.com.senai.teste;

public class TesteCircuitos {
	public static void main(String[] args) {
		int mes = 12; //if = SE 
		 if((mes == 12) || (mes == 1)) //mes == 12) OU (mes == 1) (|| = OU)
		 {System.out.println("férias :)" );} 
		 if((mes > 1) && (mes < 12)) //mes == 1) E (mes == 12) (&& = E)
		 {System.out.println("semestre em andamento");} 
		 if((mes != 2)) //mes != 2)  (! = NAO (Diferente)
		 {System.out.println("não tem carnaval ");}
	}

}
