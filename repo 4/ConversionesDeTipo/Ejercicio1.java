byte varByte;    
short varShort;  
int varInt;      
long varLong;    
float varFloat;  
double varDouble; 
char varChar ;  
boolean varBoolean; 
varByte = 50;
varShort = 1500 ;
varInt = 1500000 ;
varLong = 65000000 ;
varFloat = 20.0E4F ;
varDouble = 0.123456789e9 ;
varChar = 'H' ;
varBoolean = true ;
varInt = varShort;       //correcta
varDouble = varFloat;    //correcta
varFloat = varLong;      //correcta
varLong = varInt;        //correcta
varLong = 9223372036854775807L;    //correcta
varFloat = varLong;       //correcta
varByte = varShort;       //incorrecta pues varShort contine 16 bits mientras que vasByte contine 8 bits
varShort = varInt;        //incorrecta pues varInt contine 32 bits mientras que vasShort contine 16 bits