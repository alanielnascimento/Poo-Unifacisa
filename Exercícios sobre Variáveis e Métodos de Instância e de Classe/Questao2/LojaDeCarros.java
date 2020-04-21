package Questao2;

public class LojaDeCarros {

	public static void main(String[] args) {

		Carro palio = new Carro("Pálio", "Fiat", 35000);
		Carro palioPrata = new Carro("Pálio", "Fiat", "Prata", 2, false, false, false, false,true, 35000);
		Carro civic = new Carro("Civic", "Honda", "Cinza", 4, true, true, true, true, false, 110000);
		Carro corolla = new Carro("Corolla", "Toyota", "Preto", 4, true, true, false, true, true, 110000);
		Carro gol = new Carro();
		gol.nome = "Gol";
		gol.marca = "Volksvagem";
		gol.cor = "Vermelho";
		gol.portas = 4;
		gol.vidroEletrico = true;
		gol.arCondicionado = true;
		gol.cambioAutomatico = true;
		gol.direcaoEletrica = true;
		gol.promocao = false;
		gol.precoBase = 55000;
		
		
		System.out.println(palio);
		System.out.println(palioPrata);
		System.out.println(civic);
		System.out.println(corolla);
		System.out.println(gol);

	}

}
