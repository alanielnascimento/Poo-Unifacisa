package Questao1;

public class LojaDeCarros {

	public static void main(String[] args) {
		

		Carro palio = new Carro("P�lio", "Fiat", 35000);
		Carro palioPrata = new Carro("P�lio", "Fiat", "Prata", 2, false, false, false, false, 35000);
		Carro civic = new Carro("Civic", "Honda", "Cinza", 4, true, true, true, true, 110000);
		Carro corolla = new Carro("Corolla", "Toyota", "Preto", 4, true, true, false, true, 110000);
		Carro gol = new Carro();
		gol.nome = "Gol";
		gol.marca = "Volksvagem";
		gol.cor = "Vermelho";
		gol.portas = 4;
		gol.vidroEletrico = true;
		gol.arCondicionado = true;
		gol.cambioAutomatico = true;
		gol.direcaoEletrica = true;
		gol.precoBase = 55000;
		
		
		System.out.println(palio);
		System.out.println(palioPrata);
		System.out.println(civic);
		System.out.println(corolla);
		System.out.println(gol);
		
		Carro.promocao = true;
		
		System.out.println(palio);
		System.out.println(palioPrata);
		System.out.println(civic);
		System.out.println(corolla);
		System.out.println(gol);
		
		
	}

}




