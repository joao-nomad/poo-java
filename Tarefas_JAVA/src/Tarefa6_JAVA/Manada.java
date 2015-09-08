package Tarefa6_JAVA;
//Importando bibliotecas para utilizar as listas em Java
import java.util.List;
import java.util.ArrayList;

public abstract class Manada {
	//Declarando um novo Array de lista do objeto Animal
	List<Animal> animals = new ArrayList<Animal>();		
	
	//Método para retornar todos os animais
	public List<Animal> receberAnimais()
	{
		return animals;
	}
	//Método para definir os animais
	public void definirAnimais(List<Animal> animals)
	{
		this.animals = animals;
	}
	//Método para adicionar cada animal
	public void adicionarAnimal(Animal objeto)
	{
		animals.add(objeto);
	}
	
	//Método que irá retornar o barulho que cada animal faz
	public String separar()
	{
		String barulho = "";
		for(Animal each : animals)
		{
			barulho = barulho + each.fazBarulho();
			barulho += dividindo();
		}
		 return barulho;
	}
	
	//Classe abstrata que irá ser usada para dividir a lista
	public abstract String dividindo();	
}