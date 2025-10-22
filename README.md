# PR-Eclipse-04-DebugProgErr
## 1. Descripción de los errores encontrados  
- **1er error encontrado:** Aunque pongas un valor fuera de rango, lo único que hace el programa es decirte error, pero usa ese valor para la suma, la media y sirve para el contador. Esto ocurre porque no se le especifica al programa que la acción de sumar al contador y meterlo en la suma es únicamente cuando no se cumple la condición del if(necesita un else que englobe contador++ y suma)  
- **2do error encontrado:** Al iniciar la variable de contador en 0, este sigue hasta que supere el valor de número de alumnos, por lo que tendrás un valor de más. Esto ocurre por inicializar la variable contador en 0.  
- **3er error enconrado:** Ausencia de llaves en la función if, se puede hacer para comandos de una sola línea, pero no es recomendable.
- **4to error encontrado:** Al poner la cantidad de alumnos en negativo pasa directamente a hacer la media, finalizando el programa.
## 2. Cómo los detecté  
-**1er error:** Lo detecté al poner un valor negativo cuando te piden la nota y poniendo breakpoints en el lector de datos por el usuario, en el if, en la suma y en el contador++, desde la vista de variables.  
-**2do error:** Lo detecté cuando me pidió por tercera vez cual nota tiene el alumno cuando yo le especifiqué que solo hay dos alumnos. Puse breakpoints donde guarda los datos del usuario en la variable numAlumnos, en el while y la impresión por consola, desde la vista de variables.  
-**3er error:** Desde el punto de vista del depurador no ocurre nada, pero viendo el código me di cuenta de la ausencia de llaves.  
-**4to error:** Al introducir un número negativo en la consola del depurador te salta directamente a la media
## 3. Qué cambios hice para corregirlos  
-**1er cambio:** A la función if le puse las llaves correspondientes y añadí un else para suma y contador, para que en caso de que la nota no sea válida vuelva a preguntar sobre el mismo alumno y no cuente la nota negativa en la suma.  
-**2do cambio:** Inicialicé la variable de contador en 1, para que no cuente un valor más, puesto que no existe un alumno 0.  
-**3er cambio:** Usé un bucle do while para que repita el introducir el número de alumnos hasta que me de un número válido.  
## 4. Breakpoint condicional para notas inválidas  
Poniendo el breakpoint condicional en el print de error, se para unicamente cuando se cumple la condición del if.
## 5. Añade las siguientes expresiones en Expressions que muestren el valor de la suma, el contador y la media parcial en cada iteración  

## 6. Plantilla (Template)
