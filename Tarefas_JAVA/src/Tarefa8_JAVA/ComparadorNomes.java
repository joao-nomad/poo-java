package Tarefa8_JAVA;

import java.util.Comparator;

public class ComparadorNomes implements Comparator<Animal>{

	@Override
	public int compare(Animal animal, Animal outroAnimal) {
		return animal.getNome().compareTo(outroAnimal.getNome());
	}

}
