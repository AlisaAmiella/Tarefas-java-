package br.com.senai.teste;
import java.io.*;
public class ExemploNaTela {
	public static void main(String[] args) {
		  try 
		  { 
		   // Essas duas linhas criam um "leitor com buffer"  
		   // do dispositivo padrão de entrada do Java: 
		   // o teclado (System.in). Mais tarde você apre nderá que esse 
		   // leitor pode ser redirecionado para ler informações 
		   // de outros dispositivos, como uma conexão com a Internet, 
		   // um Socket, o mouse, etc. 
		   InputStreamReader dados = new InputStreamReader(System.in); 
		   BufferedReader teclado = new BufferedReader(dados); 
		 
		 
		  System.out.print("digite uma frase: "); 
		   String frase = teclado.readLine(); 
		   System.out.println("Frase digitada:\t" + frase); 
		 
		 
		  System.out.print("\ndigite um numero inteiro: "); 
		   int numero =   Integer.parseInt(teclado.readLine()); 
		   System.out.println("Número digitado vezes dois =\t" 
		    + (numero * 2)); 
		 
		 
		  System.out.print("\ndigite um numero fracionario: "); 
		   double flutuante =   Double.parseDouble(teclado.readLine()); 
		   System.out.println("Número digitado dividido por dois =\t"  
				    + (flutuante / 2)); 
				 
				 
				  // outros métodos: 
				 
				 
				  // char letra = (char)teclado.read(); 
				   // Float.parseFloat(teclado.readLine()); 
				   // Long.parseLong(teclado.readLine()); 
				 
				 
				 } 
				  catch(Exception error) 
				  { 
				   // Se houver um erro na leitura do teclado, 
				   // a execução do programa será desviada para  
				   // o bloco 'catch' 
				   System.out.println("[ERRO] – " 
				    + "voce digitou um valor invalido"); 
				  } 
				 } 
	}

