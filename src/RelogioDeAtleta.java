/*
  Nome: Gustavo Gon�alo Rodrigues
*/

import java.util.*;

public class RelogioDeAtleta {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int frequenciaCardiacaAtual;
		System.out.println("Informe sua Frequ�ncia Card�aca Atual: ");
		frequenciaCardiacaAtual = ler.nextInt();
		
		int frequenciaCardiacaRepouso;
		System.out.println("Informe sua Frequ�ncia Card�aca em Repouso: ");
		frequenciaCardiacaRepouso = ler.nextInt();
		
		int oxigenacao;
		System.out.println("Informe a Oxigena��o Atual: ");
		oxigenacao = ler.nextInt();
		
		if (frequenciaCardiacaAtual > frequenciaCardiacaRepouso * 3 || oxigenacao < 95) {
			System.out.println("diminuir");
		}
		else if (frequenciaCardiacaAtual < frequenciaCardiacaRepouso * 2 || oxigenacao > 97) {
			System.out.println("aumentar");
		}
		else {
			System.out.println("manter");
		}
		
		/*
		System.out.println("Informe a Idade: ");
		int idade = ler.nextInt();
		
		System.out.println("Informe o Sal�rio");
		double salario = ler.nextDouble();
		*/
	}

}
