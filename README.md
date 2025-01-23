# N-Queens Solver con JavaFX

Este proyecto resuelve el problema de las **N-Reinas** utilizando una interfaz gráfica construida con **JavaFX**. El programa permite al usuario introducir el número de filas, columnas y reinas a través de la interfaz, y genera una solución utilizando el algoritmo de **backtracking**.

## Descripción

El programa tiene una interfaz gráfica que solicita los siguientes datos al usuario:

- **Número de filas**: La cantidad de filas de la tabla (tablero) donde se deben colocar las reinas.
- **Número de columnas**: La cantidad de columnas de la tabla.
- **Número de reinas**: La cantidad de reinas que deben ser colocadas en el tablero de manera que ninguna de ellas se ataque entre sí.

Una vez que el usuario introduce estos datos y hace clic en "Calcular", el programa resuelve el problema utilizando el algoritmo de **backtracking** y guarda las soluciones en un archivo `.txt` dentro de una carpeta llamada `solutions` dentro del proyecto.

## Funcionalidades

- **Interfaz Gráfica**: Desarrollada con **JavaFX** para una fácil interacción con el usuario.
- **Algoritmo de Backtracking**: Utilizado para resolver el problema de las N-Reinas, explorando todas las posibles configuraciones y asegurándose de que las reinas no se ataquen.
- **Generación de archivo de soluciones**: Las soluciones generadas son guardadas en un archivo `.txt` dentro de la carpeta `solutions` dentro del proyecto.

## Instrucciones de uso

1. **Clonar el repositorio**:
    ```bash
    git clone [<URL-del-repositorio>](https://github.com/Faprin/n-Queens)
    ```

2. **Abrir el proyecto** en tu IDE favorito (por ejemplo, IntelliJ IDEA o Eclipse).

3. **Compilar y ejecutar** la aplicación. La interfaz gráfica pedirá que introduzcas:
    - Número de filas
    - Número de columnas
    - Número de reinas

4. **Generación del archivo de soluciones**: Después de hacer clic en "Calcular", el programa generará un archivo `.txt` en la carpeta `solutions`, que contiene las posibles configuraciones de las reinas en el tablero.

    Ejemplo de formato de archivo generado:
    ```txt
    Solución 1:
    1 0 0 0
    0 0 1 0
    0 0 0 1
    0 1 0 0

    Solución 2:
    0 1 0 0
    1 0 0 0
    0 0 1 0
    0 0 0 1
    ```

## Requisitos

- **Java 8 o superior**: Necesario para ejecutar JavaFX.
- **IDE compatible con JavaFX**: IntelliJ IDEA, Eclipse o cualquier IDE que soporte proyectos JavaFX.

## Licencia

Este proyecto está licenciado bajo la **Licencia MIT**. Consulta el archivo LICENSE para más detalles.
