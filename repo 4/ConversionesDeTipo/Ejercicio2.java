
public class Ejercicio2 {
    public static void main(String[] args) {
       byte varByte;
       short varShort;
       int varInt;
       long varLong;
       varLong=35000L;

        varInt= (int) varLong;
        varShort= (short) varLong;
        varByte= (byte) varLong;

        System.out.println("Valor en int: " + varInt);
        System.out.println("Valor en short: " + varShort);
        System.out.println("Valor en byte: " + varByte);
    }
}



