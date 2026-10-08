byte varByte;
short varShort;
int varInt;
long varLong;
float varFloat;
double varDouble;
varFloat= 123.1f;

varByte= (byte) varFloat;
varShort= (short) varFloat;
varInt= (int) varFloat;
varLong= (long) varFloat;
varDouble= (double) varFloat;

System.out.println("Valor en byte: " + varByte);
System.out.println("Valor en short: " + varShort);
System.out.println("Valor en int: " + varInt);
System.out.println("Valor en long: " + varLong);
System.out.println("Valor en double: " + varDouble); 