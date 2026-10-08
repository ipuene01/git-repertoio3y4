String cadena = “Viaje al Parnaso”;

int mitad = cadena.length() / 2;
String primeraMitad = cadena.substring(mitad);
System.out.println("Desde la mitad hasta el final: " + primeraMitad);

int pos1 =cadena.indexOf('j');
int pos2 = cadena.indexOf('s');
String subcadena = cadena.substring(pos1, pos2);
System.out.println("Subcadena entre 'j' y 's': " + subcadena);
