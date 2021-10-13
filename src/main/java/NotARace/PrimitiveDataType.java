package NotARace;

public class PrimitiveDataType {
	public static void main(String[] args) {

		/*The byte (1 byte) data type can store whole numbers from -128 to 127.
		 This can be used instead of int or other integer types to save memory
		when you are certain that the value will be within -128 and 127.*/
		byte aByte = 127;
		System.out.println(aByte);

		//The short (2 byte) data type can store whole numbers from -32768 to 32767:
		short aShort = 32767;
		System.out.println(aShort);

		/*The int (4 byte) data type can store whole numbers from -2147483648 to 2147483647.
		In general, and in our tutorial, the int data type is the preferred
		data type when we create variables with a numeric value.*/
		int aNumber = 2147483647;
		System.out.println(aNumber);

		/* The long (8 byte) data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
		This is used when int is not large enough to store the value.
		Note that you should end the value with an "L":*/
		long aLong = 9223372036854775807L;
		System.out.println(aLong);

		//The float (4 byte) data type can store fractional numbers from 3.4e−038 to 3.4e+038.
		// Note that you should end the value with an "f":
		float aFloat = 3.4e+038f;
		System.out.println(aFloat);

		//The double (8 byte) data type can store fractional numbers from 1.7e−308 to 1.7e+308.
		// Note that you should end the value with a "d":
		double aDouble =  1.7e+308;
		System.out.println(aDouble);

		/* A boolean (1 bit) data type is declared with the boolean keyword and can only take the values true or false: */
		boolean isNutSalty = true;
		boolean isBeefACake = false;
		System.out.println(isNutSalty);     // Outputs true
		System.out.println(isBeefACake);   // Outputs false

		/*The char (2 bytes) data type is used to store a single character.
		The character must be surrounded by single quotes, like 'A' or 'c': */
		char aChar = 'B';
		System.out.println(aChar);

		//The String data type is used to store a sequence of characters (text).
		// String values must be surrounded by double quotes:
		String aString = "Hello World";
		System.out.println(aString);

	}
}
