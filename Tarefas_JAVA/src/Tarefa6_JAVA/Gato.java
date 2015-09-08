package Tarefa6_JAVA;

public class Gato extends Animal{

	//Chamando método construtor com atributos da classe pai
	public Gato(String input1, String input2, String input3)
	{		
		super(input1, input2, input3);
	}
	
	public String fazBarulho()
	{
		return "MIAU-MIAU";
	}
}
