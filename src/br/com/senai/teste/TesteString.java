package br.com.senai.teste;

public class TesteString {
	@SuppressWarnings("unused")
	static public void main(String[] args) {
	String disciplina = "SERIÇO NACIONAL DE APRENDIZAGEM INDUSTRIAL - SENAI";
	System.out.println("Disciplina: " + disciplina);
	String megumin = "chunchumaru";
	String SteinsGate = "tuturu";
	System.out.println("-------------------------------------");
	System.out.println("Primeiro caractere + Segundo caractere");
	System.out.println("=====================================");
	System.out.println("Primeiro caractere: "+megumin.charAt(0)+" - "+SteinsGate.charAt(0));
	System.out.println("=====================================");
	System.out.println("Primeiro caractere da váriavel disciplina: "+disciplina.charAt(0)); 
	System.out.println("Segundo caractere: "+disciplina.charAt(1)); 
	System.out.println("-------------------------------------");
	System.out.println("Primeiras cinco letras: "+disciplina.substring(0, 5)); 
	System.out.println("Letras a partir da quarta: "+disciplina.substring(4)); 
}
}
