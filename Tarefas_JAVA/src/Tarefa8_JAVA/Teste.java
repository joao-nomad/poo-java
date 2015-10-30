package Tarefa8_JAVA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		List<Animal> animais= new ArrayList<Animal>();
		
		Gato g = new Gato();
		Cachorro c = new Cachorro();
		ManadaVirgula v = new ManadaVirgula();
		v.addAnimal(g);
		v.addAnimal(c);
		v.addAnimal(g);
		
		ManadaSustenido s = new ManadaSustenido();
		s.addAnimal(g);
		s.addAnimal(c);
		s.addAnimal(g);
		s.addAnimal(c);
		
		Gato gato1 = new Gato();
		gato1.setNome("Cristiano");
		gato1.setPeso(9.0);
		
		Gato gato2 = new Gato();
		gato2.setNome("Ronaldo");
		gato2.setPeso(2.4);	
		
		Gato gato3 = new Gato();
		gato3.setNome("Aguero");
		gato3.setPeso(6);	

		Gato gato4 = new Gato();
		gato4.setNome("Kun");
		gato4.setPeso(3.2);
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Aristóteles");
		cachorro1.setPeso(4.2);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("Ezio");
		cachorro2.setPeso(3.2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setNome("Altair");
		cachorro3.setPeso(6.2);
		
		animais.add(gato1);
		animais.add(gato2);
		animais.add(gato3);
		animais.add(gato4);
		animais.add(cachorro1);
		animais.add(cachorro2);
		animais.add(cachorro3);
			
		this.ordenarPorNome(animais);
		System.out.println("Ordenando de acordo com os nomes: " + animais);
		
		Collections.sort(animais);
		System.out.println("Ordenando de acordo com os pesos: " + animais);
	}
	
	private void ordenarPorNome(List<Animal> animais) {
		ComparadorNomes comp = new ComparadorNomes();
		Collections.sort(animais, comp);
	}
}