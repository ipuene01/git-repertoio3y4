tring cadena = “Viaje al Parnaso”;
String otraCadena = ”Viaje al Olimpo”;

int resultado = cadena.compareTo(otraCadena);
System.out.println("Resultado de la comparación: " + resultado);

if (resultado < 0) {
    System.out.println("La cadena \"" + cadena + "\" es menor que \"" + otraCadena + "\"");
} else if (resultado > 0) {
    System.out.println("La cadena \"" + cadena + "\" es mayor que \"" + otraCadena + "\"");
} else {
    System.out.println("Las cadenas son iguales.");
}