package Tarefa5_JAVA;
import static java.lang.System.out;

public class Gato extends Animal{

	//Chamando método construtor com atributos da classe pai
	public Gato(String input1, String input2, String input3)
	{		
		super(input1, input2, input3);		
		out.print("Gato adicionado!\n");
	}
}
