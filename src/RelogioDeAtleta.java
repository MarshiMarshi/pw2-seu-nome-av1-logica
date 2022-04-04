/*
  Nome: Gustavo Gonçalo Rodrigues
*/

import java.util.*;

public class RelogioDeAtleta {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int frequenciaCardiacaAtual;
		System.out.println("Informe sua Frequência Cardíaca Atual: ");
		frequenciaCardiacaAtual = ler.nextInt();
		
		int frequenciaCardiacaRepouso;
		System.out.println("Informe sua Frequência Cardíaca em Repouso: ");
		frequenciaCardiacaRepouso = ler.nextInt();
		
		int oxigenacao;
		System.out.println("Informe a Oxigenação Atual: ");
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
		
		System.out.println("Informe o Salário");
		double salario = ler.nextDouble();
		*/
	}

}
