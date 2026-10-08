double dGigante, dNormal, dMinimo;
float fGigante, fNormal, fMinimo;
double dGigante = 1.766e289;
double dNormal = 35.987654321;
double dMinimo = 0.2E-256;

float fGigante = (float) dGigante;
float fNormal = (float) dNormal;
float fMinimo = (float) dMinimo;

System.out.println("Gigante: " + fGigante);
System.out.println("Normal : " + fNormal);
System.out.println("Minimo : " + fMinimo);

byte b = (byte) 130;
short s = (short) 32770;
int i = (int) 2147483650L; // Ajustado al valor común de desbordamiento de int

System.out.println("byte : " + b);
System.out.println("Short : " + s);
System.out.println("int : " + i);

float f = 1.3e22f;
System.out.println("f: " + f);