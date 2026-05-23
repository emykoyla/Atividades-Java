public class Main
{
	public static void main(String[] args) {
	    
	final int baseDeCalculo = 4350;
	float aliquota = 0.225f;
	float dedução = 651.73f;
	float vlrIRRF = 0f;
	
	vlrIRRF = (baseDeCalculo * aliquota) - dedução;
	
	System.out.println("Valor IRRF: " + vlrIRRF);
	}
}