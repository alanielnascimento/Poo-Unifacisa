
public class Classificados {

	public static void main(String[] args) {
		Imovel moradia1 = new Imovel("Casa", "Falcão", 3, 1, 2, 120, true, false);
		Imovel moradia2 = new Imovel("Apartamento", "Falcão",15, 8, 3, 2, 3, 82, true, false, false);
		Imovel moradia3 = new Imovel("Casa", "Altaman",0,0, 4, 2, 3, 240, true, true, true);
		Imovel moradia4 = new Imovel("Casa", "Leblon",0, 0, 6, 3, 5, 540, true, true, true);
		Imovel moradia5 = new Imovel("Apartamento", "Alto Branco", 3, 2, 2, 1, 2, 60, false, false,false);
		
		System.out.println(moradia1);
		System.out.println("	");
		System.out.println(moradia2);
		System.out.println("	");
		System.out.println(moradia3);
		System.out.println("	");
		System.out.println(moradia4);
		System.out.println("	");
		System.out.println(moradia5);
		System.out.println("	");
		
	}

}
