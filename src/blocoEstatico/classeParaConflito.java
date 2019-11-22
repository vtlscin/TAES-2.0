package blocoEstatico;

public class classeParaConflito {

	static String w;
	static String x;
	static String y;
	static String z;
	
	static 
	{
		x = "Criação da base";
		z = "Criação do left";
		w = "Criação do right";
		y = "Criação da base";
	}
	public static void main(String[] args) {
		System.out.println(x);
	}
}
