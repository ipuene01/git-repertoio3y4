String cadena = “Viaje al Parnaso”;
String otraCadena = ”ViAje al pArnaso”;

boolean iguales = cadena.equals(otraCadena);
System.out.println("¿Son iguales las cadenas? " + iguales);

boolean igualesIgnorandoMayusculas = cadena.equalsIgnoreCase(otraCadena);
System.out.println("¿Son iguales las cadenas ignorando mayúsculas? " + igualesIgnorandoMayusculas);


string cadenaminusculas = cadena.toLowerCase();
string otraCadenaminusculas = otraCadena.toLowerCase();
boolean igualesMinusculas = cadenaminusculas.equals(otraCadenaminusculas);
System.out.println("¿Son iguales las cadenas en minúsculas? " + igualesMinusculas);
