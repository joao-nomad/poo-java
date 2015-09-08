package Tarefa6_JAVA;

public class Cachorro extends Animal{

	//Chamando método construtor com atributos da classe pai
	public Cachorro(String input1, String input2, String input3)
	{
		super(input1, input2, input3);
	}
	
	public String fazBarulho()
	{
		return "AU-AU";
	}
}