
public class Imovel {
	
	String tipo, imobiliaria;
	int pavimentos, pavimento, quartos, suites, banheiros, metroQuadrado, pav;
	boolean elevador, piscina, quadra;
	
	public Imovel(String tipo, String imobiliaria, int quartos, int suites, int banheiros, 
			int metroQuadrado, boolean piscina, boolean quadra) {
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metroQuadrado = metroQuadrado;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	public Imovel(String tipo, String imobiliaria, int pavimentos, int pavimento, int quartos, int suites, 
			int banheiros, int metroQuadrado, boolean elevador, boolean piscina, boolean quadra) {
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metroQuadrado = metroQuadrado;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	public double calculaPreco() {
		metroQuadrado *= 5000;
		double precoTotal = metroQuadrado;
		int pavimento = 5;
		while (pavimento <= this.pavimento) {
			precoTotal += 2000;
			pavimento ++;
		}
		
		if (elevador == true) 
			precoTotal += 2500;
		if (piscina == true)
			precoTotal += 2500;
		if (quadra == true)
			precoTotal += 2500;	
		return precoTotal;
	}
	public String toString() {
		String output = "";
		output += "Tipo de im�vel: " + this.tipo + "\n";
		output += "Imobili�ria: " + this.imobiliaria + "\n";
		output += "Pavimentos: " + this.pavimentos + "\n";
		output += "Andar: " + this.pavimento + "\n";
		output += "Quartos: " + this.quartos + "\n";
		output += "Su�tes: " + this.suites + "\n";
		output += "Banheiros: " + this.banheiros + "\n";
		output += "Metros Quadrados: " + this.metroQuadrado + "m�" + "\n";
		output += "Elevador: " + (this.elevador == true ? "Sim": "N�o") + "\n";
		output += "Piscina: " +  (this.piscina == true ? "Sim": "N�o") + "\n";
		output += "Quadra Esportiva: " + (this.quadra == true ? "Sim": "N�o") + "\n";
		output += "Pre�o Total: " + ( this.calculaPreco());
		return output;
	}
		
	
}
