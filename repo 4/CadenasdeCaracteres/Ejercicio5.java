String cadena = “Viaje al Parnaso”;

int posicion = cadena.indexOf('P');
system.out.println("La posición de la letra P es: " + posicion);

int posicion2 = cadena.indexOf("ar");
System.out.println("La posición de ar es: " + posicion2);

int posicion3 = cadena.indexOf('a');
System.out.println("Ultima ocurrencia de a: " + posicion3);

int posicion4 = cadena.lastIndexOf('a', 3);
System.out.println("Letra a empezando por la posición 3: " + posicion4);