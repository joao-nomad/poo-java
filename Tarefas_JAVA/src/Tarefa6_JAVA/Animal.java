package Tarefa6_JAVA;

public abstract class Animal {
	
		String idade;
		String raca;
		String peso;
	
	//Método construtor dos atributos listados acima
	public Animal (String input1, String input2, String input3)
	{
		idade = input1;
		raca = input2;
		peso = input3;
	}
	
	public abstract String fazBarulho();
}