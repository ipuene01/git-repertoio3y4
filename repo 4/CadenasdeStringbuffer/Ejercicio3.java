StringBuffer cadena = new StringBuffer(“Viaje al Parnaso”);
// Modificaciones

cadena.replace(9,16, "Castilia")
cadena.deleteCharAt(7);
System.out.println(cadena.toString());