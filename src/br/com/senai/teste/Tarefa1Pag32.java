package br.com.senai.teste;

public class Tarefa1Pag32 {
	public static void main(String[] args) {
			long x = 0, par=0, impar=0;
			int i;
			for( i=1 ; i <= 30; i++){
			if(i%2==0){
				if(i>2){
				par = par*i;
				}
				else{
				par = i;
				}
			}
			else{
			impar = impar+i;
			}
			}
			System.out.println("Soma dos �mpares �: "+impar);
			System.out.println("Multiplica��o dos pares �: "+par);
			}
	}

