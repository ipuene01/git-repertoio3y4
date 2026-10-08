int segundos, horas, minutos;
int totalSegundos = 56000;
// Realización de cálculos
horas = totalSegundos / 3600 ;
minutos = (totalSegundos % 3600 )/ 60 ;
segundos = totalSegundos % 60 ;

System.out.println(horas+"h "+minutos+"m "+segundos+"s ");