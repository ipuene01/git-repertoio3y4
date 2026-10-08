StringBuffer cadena = new StringBuffer(“Viaje al Parnaso”);
String otraCadena = new String(”Viaje desde Arcadia”);

cadena.replace(0,8,otraCadena);
System.out.println(cadena.toString());