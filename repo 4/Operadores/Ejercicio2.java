int edad = 19
int numeroPartes = 4;
boolean deportivo = true;
boolean rebaja = (edad >= 18 && numeroPartes < 4 && deportivo == true)|| 
                 (edad > 15 && numeroPartes <= 3 && deportivo == false) ;
// rebaja = expresión booleana
System.out.println("Rebaja= "+rebaja)