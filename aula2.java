package aula2;
import java.util.Scanner;

public class aula2 {

	public static void main(String[] args) throws Exception {
	/*
		double [] temperatura = new double[365];
		temperatura[0] = 25.7;
		temperatura[1] = 27.4;
		temperatura[2] = 29.3;
		temperatura[3] = 31.4;
		temperatura[4] = 30.2;
		temperatura[5] = 29.6;
		
		System.out.println("O valor da temperatura do dia 3 é: " + temperatura[2]);
		System.out.println("O tamanho do vetor: " + temperatura.length);
		
		for (int i=0; i<temperatura.length; i++) {
			//if(temperatura[i] != 0) {
				System.out.println("O valor da temperatura do dia " + (i+1) + " é " + temperatura[i]);
			//}
			
		}
		for (double temp : temperatura) {
			//if(temp != 0) {
				System.out.println(temp);
			//}
			
		}*/ // Exercicio 2
		/*Scanner sc = new Scanner(System.in);
		double [] temperatura = new double[7];
		double mediatemp,soma;
		int acimamed,abaixomed,namedia;
		soma=0;
		acimamed =0;
		abaixomed=0;
		namedia=0;
		for(int i=0; i<7; i++) {
			System.out.println("Digite a temperatura do dia "+(i+1)+": ");
			temperatura[i] = sc.nextDouble();
			soma = soma + temperatura[i];
		}
		mediatemp = soma/7;
		
		for(int i=0; i<7; i++) {
			if(temperatura[i]<mediatemp) {
				abaixomed++;
			}else if(temperatura[i]>mediatemp) {
				acimamed++;
			}else {
				namedia++;
			}
		}
		System.out.println("Média: "+mediatemp);
		System.out.println("Total de dias que a temperatura ficou acima da média: "+acimamed);
		System.out.println("Total de dias que a temperatura ficou abaixo da média: "+abaixomed);
		System.out.println("Total de dias que a temperatura ficou na média: "+namedia);
		*/
		//Exercicio 3
		
		Vetor vetor = new Vetor(5);
		
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
			vetor.adiciona("elemento 4");


		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(vetor.adicionaInicio(0, "elemento 0"));
		System.out.println(vetor.tamanho());
		System.out.println(vetor.toString());
		vetor.remove(2);
		System.out.println(vetor.tamanho());
		System.out.println(vetor.busca(0));
		System.out.println(vetor.busca1("elemento "));
		
		
		
		
}
	
	
}

	

