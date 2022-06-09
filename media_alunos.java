package media_aluno;

import java.util.Scanner; //import do Scanner

public class media_alunos {

	@SuppressWarnings({ "resource", "null" }) //suprimir ou ignorar avisos do compilador
	public static void main(String[] args) {
		// Novo Scanner: "ler"
	
		Scanner ler = new Scanner(System.in);
		
		
		
		//variaveis
		
		// "s_" = sala
		// "sm_" = media da sala
		// "st_" = "Rank" das salas
		
		int s_sala;							//contagem das salas
		
		int s_cache;						// cache dos valores da sala "interligação"
		
		int sm_contagem = 0, media; 				//contagem da media
		
		int s_quanti[][]= new int [6][2]; 		//matriz de dimensão 6
		
		int a,b,c,x,x1;						//rank
		
		//RECEBEMENTO DAS QUANTIDADE DE PESSOAS DA SALA | usando repetição com for para implementando em cada variavel do vetor
		for (s_sala = 1; s_sala <= 6; s_sala++){
			
			System.out.printf("\n DIGITE O NUMERO DE PESSOAS DA SALA %d:  ", s_sala);
			
			s_cache = ler.nextInt();//scanner
			
			s_quanti[s_sala - 1][0] = s_cache; // o vetor recebe no slot o valor de s_cache; O "s_sala-1" é assim pois exibira para a pessoa que esta aplimentando no primeiro, mas no vetor tem que ser um a menos por conta da contagem dos slot começar no "0";
			
			s_quanti[s_sala - 1][1] = s_sala;
			
			//CONTAGEM DA MÉDIA
			sm_contagem += s_cache;// contagem adicionando todas os numero antes de serem aplimentados na variavel s_quanti.
		}
		
		
		//MÉDIA
		media = sm_contagem / 6;
		
		
		//Ordenação 
		for(a = 0; a < 6; a++) {
	
			for(b = 0; b < 6; b++) {

				if (s_quanti[a][0] > s_quanti[b][0]) {
						x = s_quanti[a][0];//alunos
						x1 = s_quanti[a][1];//sala
						
						s_quanti[a][0] = s_quanti[b][0];//alunos
						s_quanti[a][1] = s_quanti[b][1];//sala
						
						s_quanti[b][0] = x;//alunos
						s_quanti[b][1] = x1;//sala
				}
				
			}
		}

		//Exibição dos resultados
		
		System.out.print("\n\n RESULTADOS!");
		
		//Exibição Média
		
		System.out.printf("\n Media de alunos nas salas = %d  ", media);
		
		//Exibição Média
		System.out.print("\n\n Salas quantidade de pessoas acima da media: ");
		for(c = 0; c < 6; c++) {
			if (s_quanti[c][0] > media) {
				System.out.printf("\n 0%d° - Sala %d = %d  ", c + 1,s_quanti[c][1],s_quanti[c][0]);
			}
		}
		
		System.out.print("\n\n Salas quantidade de pessoas abaixo da media: ");
		for(c = 0; c < 6; c++) {
			if (s_quanti[c][0] < media) {
				System.out.printf("\n 0%d° - Sala %d = %d  ", c + 1,s_quanti[c][1],s_quanti[c][0]);
			}
		}
	}
}

