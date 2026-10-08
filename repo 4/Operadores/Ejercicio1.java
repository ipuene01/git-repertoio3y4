final int CONST = 128;
int op1;
int op2;
int resultado;
//Preincrementa op1 y multiplicalo por 12
op1 = ++op1 * 12 ;
//El valor de op2 es la suma op1 predecrementado con CONST
op2 = --op1 + CONST ;
//Halla el resto de dividir op2 entre op1 y guardalo en resultado
resultado = op2 % op1;
//Muestra por pantalla los valores de op1, op2 y resultado
System.out.println("op1: " + op1) ;
System.out.println("op2: " + op2) 
System.out.println("resultado: " + resultado) ;