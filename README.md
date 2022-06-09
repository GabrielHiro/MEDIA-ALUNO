# MEDIA-ALUNO

### de: Gabriel Hiro Furukawa👨‍💻

# ¿? **ATIVIDADE**

  1) Deseja-se saber o número de pessoas presentes em uma sala específica do bloco Q (contendo seis salas) de uma universidade. para isso, é necessário um vetor que tenha tamanho 6 e que cada posição armazene o número de pessoas em cada sala. Qual seria a média de alunos nas salas informadas? Apresente quais são as salas com uma quantidade de pessoas acima da média encontrada.   
  2) Ainda com base no exemplo, crie um algoritmo que receba a entrada da quantidade de alunos em cada uma das seis salas, calcule a média e apresente as salas com o maior número da média e as salas com menor número.

  
# 📑 **ALGORITMO**

programa MEDIA ALUNO

var

	s_quanti : Conjunto[1..6,1..2] de inteiro
	a, c : inteiro

inicio 

	(Rotina de entrada)

	para a de 1 até 6 passo 1 faça
		escreva "DIGITE O NUMERO DE PESSOAS DA SALA: " 
		leia s_quanti[a,1]
		s_quanti[a,2] = a
		sm_contagem++
	fim_para

	
	media = sm_contagem / 6
	

	( Rotina de saida )

	escreva media
	
	para a de 1 até 6 passso 1 faça
		se (s_quanti[a,1] > media)
			escreva s_quanti[a,0], s_quanti[a,1]
		fim_se
	fim_para

	para a de 1 até 6 passso 1 faça
		se (s_quanti[a,1] < media)
			escreva s_quanti[a,0], s_quanti[a,1]
		fim_se
	fim_para
  
fim

# ⛏ **FLUXOGRAMA**

![fluxograma](https://github.com/GabrielHiro/MEDIA-ALUNO/blob/4a05523adbd7768793ce4823d04a0962ee2306cc/Fluxograma_agenda.png)

#### 📑Licença MIT
#### 🕑Última atualização 08/06/2022
