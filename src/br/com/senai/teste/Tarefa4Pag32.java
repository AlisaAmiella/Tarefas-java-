package br.com.senai.teste;

import java.util.Scanner;
public class Tarefa4Pag32 {
	public static void main(String[] args) {
		Scanner Megumin = new Scanner(System.in);
		double n;
		double h = 10.25;
		System.out.printf("Digite a quantidade de horas trabalhas:\n");
		n = Megumin.nextInt(); 
		double qtH = (n*h);
		System.out.printf("O salário será de: R$"+qtH);
	}
}
