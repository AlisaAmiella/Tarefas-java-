package br.com.senai.teste;

public class IFandElse {
	public static void main(String[] args)
{
		for (int i=0; i<20; i++) {   
			if(i == 10)  
			{    
				continue;   
			}   
			else if(i == 15)   
			{   
				break;   
			}   
			System.out.println("contador: " + i); }
		}
}
