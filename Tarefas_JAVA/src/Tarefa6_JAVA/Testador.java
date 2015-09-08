package Tarefa6_JAVA;
//Importando classe para simplificar o Print
import static java.lang.System.out;

//Classe criada para testar todos as demais classes
public class Testador {
	public static void main(String[] args)
	{
		//Instanciando classes de Animais
		Animal cat = new Gato("5", "Persa", "27");
		Animal dog = new Cachorro("3", "Pitbull", "60");
		
		out.print("Barulho do Gato: " + cat.fazBarulho() + "\n");
		out.print("Barulho do Cachorro: " + dog.fazBarulho() + "\n\n");
		
		//Instanciando as duas classes para fazer separação por Sustenidos e/ou vírgula
		ManadaSustenido sustenido = new ManadaSustenido();
		ManadaVirgula virgula = new ManadaVirgula();	
		
		//Adicionando elementos na lista
		virgula.adicionarAnimal(dog);
		virgula.adicionarAnimal(cat);
		virgula.adicionarAnimal(dog);
		
		sustenido.adicionarAnimal(cat);
		sustenido.adicionarAnimal(dog);
		sustenido.adicionarAnimal(cat);

		out.println("Separando lista por Vírgula: "+ virgula.separar());	
		out.println("Separando lista por Sustenido: "+ sustenido.separar());
	}
}