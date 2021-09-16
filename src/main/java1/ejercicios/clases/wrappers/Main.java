package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte
		byte datoByte = 2; // primitivo
		System.out.println("primitivo" + datoByte);
		Byte datoByteWrapper = 3; // wrapper
		System.out.println("Wrapper" + datoByteWrapper);

		// conversiones
		byte datoByte1 = 6;
		Byte datoConvertido = datoByte1;
		System.out.println("Byte convertido " + datoConvertido);

		// conversiones2
		Byte datoConvertido1 = 6;
		byte datoByte2 = datoConvertido1.byteValue();
		System.out.println("byte convertido" + datoByte2);

		// short
		short datoShort = 1; // primitivo
		System.out.println("primitivo" + datoShort);
		Short datoShortWrapper = 2;// Wrapper
		System.out.println("Wrapper" + datoShortWrapper);

		// conversiones
		short datoShort1 = 5;
		Short shortConvertido = datoShort1;
		System.out.println("Short convertido " + shortConvertido);

		// conversiones 2
		Short datoShort2 = 5;
		short datoConvertido2 = datoShort2.shortValue();
		System.out.println("Short convertido " + datoConvertido2);

		// int
		int edad = 45; // primitivo
		System.out.println("primitivo" + edad);
		Integer edadWrapper = 32; // Wrapper
		System.out.println("Wrapper" + edadWrapper);

		// conversiones
		int edad1 = 45;
		Integer integerConvertido = edad1;
		System.out.println("Integer convertido " + integerConvertido);

		// conversiones2
		Integer integerConvertido2 = 23;
		int edad2 = integerConvertido2.intValue();
		System.out.println("int convertido " + edad2);

		// long
		long valorGrande = 232; // primitivo
		System.out.println("primitivo" + valorGrande);
		Long valorGrandeWrapper = 12124l; // wrapper
		System.out.println("Wrapper" + valorGrandeWrapper);

		// conversiones
		long valorGrande1 = 1234;
		Long longConvertido = valorGrande1;
		System.out.println("Long convertido " + longConvertido);

		// conversiones2
		Long longConvertido1 = 1221l;
		long valorConvertido = longConvertido1.longValue();
		System.out.println("long convertido " + valorConvertido);

		// char

		char valorUnico = 2; // primitivo
		System.out.println("primitivo" + valorUnico);
		Character valorUnicoWrapper = 1; // Wrapper
		System.out.println("Wrapper" + valorUnicoWrapper);

		// conversiones
		char valorUnico1 = 1;
		Character charConvertido = valorUnico1;
		System.out.println("Char convertido " + charConvertido);

		// conversiones2
		Character valorUnico2 = 1;
		char charConvertido1 = valorUnico2.charValue();
		System.out.println("char convertido " + charConvertido1);

		// boolean

		boolean decision = true; // primitivo
		System.out.println("primitivo" + decision);
		Boolean decisionWrapper = false; // Wrapper
		System.out.println("primitivo" + decisionWrapper);

		// conversiones
		boolean decision1 = true;
		Boolean decisionConvertida = decision1;
		System.out.println("Boolean convertido " + decisionConvertida);

		// conversiones2
		Boolean decision2 = false;
		boolean decisionConvertida2 = decision2.booleanValue();
		System.out.println("boolean convertido " + decisionConvertida2);

		// float

		float datoFloat = 1212;
		System.out.println("primitivo" + datoFloat);
		Float datoFloatWrapper = 23234f;
		System.out.println("Wrapper" + datoFloatWrapper);

		// conversiones
		float datoFloat1 = 2335;
		Float floatConvertido = datoFloat1;
		System.out.println("Float convertido " + floatConvertido);

		// conversiones2
		Float floatConvertido1 = 54532f;
		float datoFloat2 = floatConvertido1.floatValue();
		System.out.println("float convertido " + datoFloat2);

		// double

		double datoDouble = 121312;
		System.out.println("primitivo" + datoDouble);
		Double datoDoubleWrapper = 1212432d;
		System.out.println("Wrapper" + datoDoubleWrapper);

		// conversiones
		double datoDouble1 = 2312434;
		Double doubleConvertido = datoDouble1;
		System.out.println("Double convertido " + doubleConvertido);

		// conversiones2
		Double doubleConvertido2 = 124342d;
		double datoDouble2 = doubleConvertido2.doubleValue();
		System.out.println("double convertido " + datoDouble2);
	}

}
