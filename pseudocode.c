1) 
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    entero i;
    mensaje("Introduzca número del 1 al 5:");
    leer("%d",&i);
    si (i!=4) {
      mensaje("Es primo.");
    }
    sino
    {
      mensaje("No es primo.");
    }

    sistema("PAUSA");     
    regresar 0;
}

2) 
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    entero i;
    mensaje("Introduzca número:");
    leer("%d",&i);

    si (i%2==0) {
      mensaje("Es par.");
    }
    sino
    {
      mensaje("Es impar.");
    }

    sistema("PAUSA");     
    regresar 0;
}

3) 
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    entero i;
    mensaje("Introduzca número del 1 al 7:");
    leer("%d",&i);

    menusi(i){
              caso 1:
                   mensaje("Lunes\n");
                   salir;
              caso 2:
                   mensaje("Martes\n");
                   salir;
              caso 3:
                  mensaje("Miércoles\n");
                   salir;
              caso 4:
                  mensaje("Jueves\n");
                   salir;
              caso 5:
                  mensaje("Viernes\n");
                   salir;
              caso 6:
                  mensaje("Sábado\n");
                   salir;
              caso 7:
                  mensaje("Domingo\n");
                   salir;
              predeterminado:
                   mensaje("Opción no válida\n");
                   salir;
    }

    sistema("PAUSA");     
    regresar 0;
}

4) 
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    caracter c;
           
    mensaje("Introduzca un carácter:");
    leer("%c",&c);
   
    menusi (c)
    {
           caso 'a':
                mensaje("Es vocal\n");
                salir;
           caso 'e':
                mensaje("Es vocal\n");
                salir;
           caso 'i':
                mensaje("Es vocal\n");
                salir;
           caso 'o':
                mensaje("Es vocal\n");
                salir;
           caso 'u': 
                mensaje("Es vocal\n");
                salir;       
           predeterminado:
               mensaje("No es vocal\n");
                salir;
    }
   
    sistema("PAUSA");
    regresar 0;
}

5) 
#include <stdio.h>
 
int main()
{
  entero numero;
 
  mensaje("Teclea un número (0 para salir): ");
  leer("%d", &numero);
  mientras (numero!=0)
  {
    si (numero > 0) 
        mensaje("Es positivo\n");
    sino 
        mensaje("Es negativo\n");
    mensaje("Teclea otro número (0 para salir): ");
    leer("%d", &numero);
  }
 
  regresar 0;
}

6) 
#include <stdio.h>
 
int main()
{
  entero valida = 711;
  entero clave;
 
  hacer
  {
    mensaje("Introduzca su clave numérica: ");
    leer("%d", &clave);
    si (clave != valida) 
        mensaje("No válida!\n");
  }
  mientras(clave != valida);
  mensaje("Aceptada.\n");
 
  regresar 0;
}

7) 
#include <stdio.h>
 
int main()
{
  entero tabla, numero;
 
  para (tabla=1; tabla<=5; tabla++)
    para (numero=1; numero<=10; numero++)
      mensaje("%d por %d es %d\n", tabla, numero, tabla*numero);
 
  regresar 0;
}

8) 
#include <stdio.h>
 
int main()
{
  caracter letra;
 
  para (letra='z'; letra>='a'; letra-=2)
    mensaje("%c", letra);
 
  regresar 0;
}


