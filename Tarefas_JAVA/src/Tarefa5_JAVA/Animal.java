package Tarefa5_JAVA;
import static java.lang.System.out;

public abstract class Animal {
	
		String idade;
		String raca;
		String peso;
	
	//M�todo construtor dos atributos listados acima
	public Animal (String input1, String input2, String input3)
	{
		idade = input1;
		raca = input2;
		peso = input3;
	}
	
	//M�todo principal passando valores e criando novas inst�ncias
	public static void main(String[]args)
	{
		Gato cat = new Gato("5", "Persa", "27");
		out.print("Gato: " + cat.idade + " anos, " + cat.raca + ", " + cat.peso + "Kg\n\n");
		
		Cachorro dog = new Cachorro("3", "Pitbull", "60");
		out.print("Cachorro: " + dog.idade + " anos, " + dog.raca + ", " + dog.peso + "Kg\n");		
	}
	
	//M�todo que n�o iremos utilizar nessa atividade
	public static void fazBarulho()
	{
		out.print("Animal fazendo barulho");
	}
}