package Questao1;

public class Carro {
	
		 //Variavel estatica da classe;
		static boolean promocao;
			
		//variaveis(Atributos) de instancias do Objeto
		String nome, marca, cor;
		int portas;
		boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
		double precoBase, precoTotal;
		
		public Carro (String nome, String marca, double precoBase) {
			this.nome = nome;
			this.marca = marca;
			this.cor = "Branco";
			this.portas = 2;
			this.vidroEletrico = false;
			this.arCondicionado = false;
			this.cambioAutomatico = false;
			this.direcaoEletrica = false;
			this.precoBase = precoBase;
		}
		public Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico,
				boolean arCondicionado, boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
			this.nome = nome;
			this.marca = marca;
			this.cor = cor;
			this.portas = portas;
			this.vidroEletrico = vidroEletrico;
			this.arCondicionado = arCondicionado;
			this.cambioAutomatico = cambioAutomatico;
			this.direcaoEletrica = direcaoEletrica;
			this.precoBase = precoBase;
		}
		public Carro () {}
		
		public double calculaPreco() {
			double desconto = 0;
			double precoTotal = precoBase;
			//String corBasica = this.cor;
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
			
			if (promocao == true)
				desconto = precoTotal*0.1;
				precoTotal -= desconto;
			
			return precoTotal;
			
		
		}
		public String toString() {
			String output = "";
			output += "Nome: " + this.nome + "\n";
			output += "Marca: " + this.marca + "\n";
			output += "Cor: " + this.cor + "\n";
			output += "Portas: " + this.portas + "\n";
			output += "Vidro Eletrico: " + this.vidroEletrico + "\n";
			output += "Ar Condicionado: " + this.arCondicionado + "\n";
			output += "Cambio Automatico: " + this.cambioAutomatico + "\n";
			output += "Dire��o Eletrica: " + this.direcaoEletrica + "\n";
			output += "Pre�o Base:  " + this.precoBase + "\n"; 
			output += "Pre�o Total: " + (this.calculaPreco()) + "\n";
			output += "Promo��o: " + Carro.promocao + "\n";
			return output;
			
		}
}


