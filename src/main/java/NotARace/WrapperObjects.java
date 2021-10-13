package NotARace;

public class WrapperObjects {
	public static void main(String[] args) {
		Byte aByteClass = 127;
		System.out.println(aByteClass);

		Short aShortClass = 32767;
		System.out.println(aShortClass);

		Integer anIntegerClass = 2147483647;
		System.out.println(anIntegerClass);

		Long aLongClass = 9223372036854775807L;
		System.out.println(aLongClass);

		Float aFloatClass = 3.4e+038f;
		System.out.println(aFloatClass);

		Double aDoubleClass =  1.7e+308d;
		System.out.println(aDoubleClass);

		Boolean isNutSalty = true;
		Boolean isBeefACake = false;
		System.out.println(isNutSalty);     // Outputs true
		System.out.println(isBeefACake);   // Outputs false

		Character aCharacter = 'B';
		System.out.println(aCharacter);
	}
}
