
public class AulaConvert {

	public static void main(String[] args) {
		//short myShort = 31000;
		//System.out.println("valor do shorts: " + myShort);

		//converting int to long
		int i = 5000;
		long l=i;
		System.out.println(l);
		//--------------------------------------------------------------------------------
		//converting float to double
		float f = 0.6F;
		double d = f;
		System.out.println(d);
		//--------------------------------------------------------------------------------
		//converting double to int
		double d2 = 3.6969;
		int i2 = (int)d2;
		System.out.println(i2);
		//--------------------------------------------------------------------------------
		//converting char to int
		char c = 'a';
		int i3 = c;
		System.out.println(i3);
		//--------------------------------------------------------------------------------
		//converting int to string
		int i4 = 123;
		String s=String.valueOf(i4);
		System.out.println(s);
		System.out.println(s+100);//vai dar 123100 pq + é operador de concatenação de strings.
		
	}

}
