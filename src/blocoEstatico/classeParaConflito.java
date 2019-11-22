package blocoEstatico;

public class classeParaConflito {

	static String w;
	static String x;
	static String y;
	
	static 
	{
		x = "Criação da base";
		w = "Criação do right";
		y = "Criação da base";
	}
	public static void main(String[] args) {
		System.out.println(x);
	}
}
