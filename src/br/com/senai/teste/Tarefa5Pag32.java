package br.com.senai.teste;

import java.util.Scanner;
public class Tarefa5Pag32 {
	public static void main(String[] args) {
		Scanner Megumin = new Scanner(System.in);
		double n;
		double h = 10.25;
		System.out.printf("Digite a quantidade de horas trabalhas:\n");
		n = Megumin.nextInt(); 
		double qtH = (n*h);
		if (qtH < 50)
		{
			System.out.println("Aten��o, dirija-se � dire��o do Hotel!");
		}
		else
		{
			System.out.printf("O sal�rio ser� de: R$"+qtH);
		}
	}
}