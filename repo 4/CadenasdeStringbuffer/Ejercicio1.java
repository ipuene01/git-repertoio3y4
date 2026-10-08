
StringBuffer cadena = new StringBuffer(“Viaje al Parnaso”);
System.out.println(cadena.length());
System.out.println(cadena.capacity());
boolean logica = true;
String otraCadena = ”Cervantes”;
int año = 1616;

cadena.append(logica);
System.out.println("Tras anexar logica: " + cadena.toString());

cadena.append(otraCadena);
System.out.println("Tras anexar otraCadena: " + cadena.toString());

cadena.append(año);
System.out.println("Tras anexar año: " + cadena.toString());