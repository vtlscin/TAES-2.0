package blocoEstatico;

public class classeParaConflito {

	static String w;
	static String x;
	static String y;
	
	static 
	{
		x = "Cria��o da base";
		w = "Cria��o do right";
		y = "Cria��o da base";
	}
	public static void main(String[] args) {
		System.out.println(x);
	}
}
