package Tarefa4_JAVA;

public class Noh {
	public Object item = null;
	public Noh proximo = null;
	public Noh(Object item) {
		//Super() chamando construtor da classe Pai
		super();
		this.item = item;
	}
	
	//Fun��o main criando uma nova inst�ncia da Classe Noh
	public static void main(String[] args) {		
		Noh head = new Noh("Item 1, ");
		//Adicionando itens � lista
		head.adicionar("Item 2, ");
		head.adicionar("Item 3");
		System.out.println(head);		
	}
	
	//Met�do de adicionar verifica se o pr�ximo item � NULL para adicionar novo elemento
	private void adicionar(Object conteudo) {
		if (this.proximo == null)
		{
			proximo = new Noh(conteudo);
		}
		else
		{
			proximo.adicionar(conteudo);
		}
	}
	
	//M�todo convertando o item para String
	@Override
	public String toString() {
		String text = "";
		text = text + this.item;
		if(proximo != null)
		{
			text = text + proximo.toString();
		}
		return text;
	}
}