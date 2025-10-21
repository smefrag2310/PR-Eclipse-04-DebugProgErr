# PR-Eclipse-04-DebugProgErr
## 1. Descripción de los errores encontrados  
- **1er error encontrado:** Aunque pongas un valor fuera de rango, lo único que hace el programa es decirte error, pero usa ese valor para la suma, la media y sirve para el contador. Esto ocurre porque no se le especifica al programa que la acción de sumar al contador y meterlo en la suma es únicamente cuando no se cumple la condición del if(necesita un else que englobe contador++ y suma)  
- **2do error encontrado:** Al iniciar la variable de contador en 0, este sigue hasta que supere el valor de número de alumnos, por lo que tendrás un valor de más. Esto ocurre por inicializar la variable contador en 0.  
- **3er error enconrado:** La función if no está abierta ni cerrada, se puede hacer para comandos de una sola línea, pero no es recomendable.  
## 2. Cómo los detecté  
## 3. Qué cambios hice para corregirlos  
## 4. Breakpoint condicional para notas inválidas  
## 5. Añade las siguientes expresiones en Expressions que muestren el valor de la suma, el contador y la media parcial en cada iteración  
## 6. Plantilla (Template)
