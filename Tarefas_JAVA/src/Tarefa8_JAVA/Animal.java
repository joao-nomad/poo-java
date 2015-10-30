package Tarefa8_JAVA;

public abstract class Animal implements Comparable<Animal>{
	private String raca;
	private double peso;
	private int idade;	
	private String nome;
	
	public void setNome(String nome){this.nome = nome;}
	
	public String getNome(){return nome;}
	
	public String getRaca(){return raca;}
	
	public void setRaca(String raca){this.raca = raca;}
	
	public double getPeso(){return peso;}
	
	public void setPeso(double peso){this.peso = peso;}
	
	public int getIdade(){return idade;}
	
	public void setIdade(int idade){this.idade = idade;}
		
	public abstract String fazerBarulho();
	
	@Override
	public String toString() {
		if(this.getNome() != null)
			return this.nome + ": " + this.peso;
		return "Sem nome";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Animal other = (Animal) obj;
		if(other.getRaca() == raca)
			return true;
			
		return false;
	}
	
	@Override
	public int compareTo(Animal animal) {
		if (this.peso < animal.peso) {
            return -1;
        }
        if (this.peso > animal.peso) {
            return 1;
        }
        return 0;
	}

}