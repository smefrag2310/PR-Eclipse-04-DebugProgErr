# PR-Eclipse-04-DebugProgErr
## 1. Descripción de los errores encontrados  
- **1er error encontrado:** Aunque pongas un valor fuera de rango, lo único que hace el programa es decirte error, pero usa ese valor para la suma, la media y sirve para el contador. Esto ocurre porque no se le especifica al programa que la acción de sumar al contador y meterlo en la suma es únicamente cuando no se cumple la condición del if(necesita un else que englobe contador++ y suma)  
- **2do error encontrado:** Al iniciar la variable de contador en 0, este sigue hasta que supere el valor de número de alumnos, por lo que tendrás un valor de más. Esto ocurre por inicializar la variable contador en 0.  
- **3er error enconrado:** Ausencia de llaves en la función if, se puede hacer para comandos de una sola línea, pero no es recomendable.  
## 2. Cómo los detecté  
-**1er error:** Lo detecté al poner un valor negativo cuando te piden la nota y poniendo breakpoints en el lector de datos por el usuario, en el if, en la suma y en el contador++, desde la vista de variables.  
-**2do error:** Lo detecté cuando me pidió por tercera vez cual nota tiene el alumno cuando yo le especifiqué que solo hay dos alumnos. Puse breakpoints donde guarda los datos del usuario en la variable numAlumnos, en el while y la impresión por consola, desde la vista de variables.  
-**3er error:** Desde el punto de vista del depurador no ocurre nada, pero viendo el código me di cuenta de la ausencia de llaves.  
## 3. Qué cambios hice para corregirlos  

## 4. Breakpoint condicional para notas inválidas  
## 5. Añade las siguientes expresiones en Expressions que muestren el valor de la suma, el contador y la media parcial en cada iteración  
## 6. Plantilla (Template)
