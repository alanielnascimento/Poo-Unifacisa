
public class Carro {
	
	//variaveis(Atributos) de instancias do Objeto
	String marca, nome, cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica, promocao;
	double precoBase, precoTotal;
	

	public Carro() {}
	
	public Carro(String nome, String marca, double precoBase) {
		this.marca = marca;
		this.nome = nome;
		this.precoBase = precoBase;
		this.portas = 2;
		this.cor = "Branco";
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	
	}
	public Carro(String marca, String nome, String cor, int portas, boolean vidroEletrico, boolean arCondicionado,
			boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
		this.marca = marca;
		this.nome = nome;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	public double calculaPreco() {
		double precoTotal = precoBase;
		switch (cor) {
		case "Branco":
		case "Azul":
		case "Vermelho":
		case "Preto":
			break;
		default:
			precoTotal += 1000;
			break;
		}
		
		if (vidroEletrico) 
			precoTotal += 1250;
		
		if(arCondicionado)
			precoTotal += 1250; 
		
		if (cambioAutomatico)
			precoTotal += 1250; 
		
		if (direcaoEletrica)
			precoTotal += 1250;
		
		return precoTotal;
		
	
	}
	public String toString() {
		String output = "";
		output += "Marca: " + this.marca + "\n";
		output += "Nome: " + this.nome + "\n";
		output += "Cor: " + this.cor + "\n";
		output += "Portas: " + this.portas + "\n";
		output += "Vidro Eletrico: " + (this.vidroEletrico == true ? "Sim": "Não") + "\n";
		output += "Ar Condicionado: " + (this.arCondicionado == true ? "Sim": "Não") + "\n";
		output += "Cambio Automatico: " + (this.cambioAutomatico == true ? "Sim": "Não") + "\n";
		output += "Direção Eletrica: " + (this.direcaoEletrica == true ? "Sim": "Não") + "\n";
		output += "Preço Base:  " + this.precoBase + "\n"; 
		output += "Preço Total: " + (this.calculaPreco());
		return output;
		
	}
}
