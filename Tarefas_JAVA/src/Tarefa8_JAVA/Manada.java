package Tarefa8_JAVA;

import java.util.ArrayList;
import java.util.List;

public abstract class Manada{
	protected List<Animal> animais = new ArrayList<Animal>();

	public String estourar(){
		String som = "";
		for(Animal a : animais){
			som += a.fazerBarulho();
			som += getDivisor();
		}
		return som;
	}
	
	public abstract String getDivisor();
	
	public void addAnimal(Animal animal){
		animais.add(animal);
	}
}
