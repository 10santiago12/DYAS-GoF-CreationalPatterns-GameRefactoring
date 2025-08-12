# Ejercicio de Juego Santiago Urrego

### En este readme se podrá encontrar el diagrama de clases en formato SVG para mayor claridad. Así como una pequeña guía para cambiar los modos de visualización del juego :)

## Diagrama de clases UML

Como recomendación, es mejor abrir la imagen en una pestaña nueva y luego hacer zoom para ver más a detalle

![Diagrama Juego](/UML/game-class-diagram.svg)

## Guía modos de visualización

Para poder intercambiar entre los modos de visualización, se debe acceder al archivo [GameConfig.java](src/main/java/com/balitechy/spacewar/main/GameConfig.java).  
Allí se encontrará en la línea 14 lo siguiente:

```java
public static final Style DEFAULT_STYLE = Style.COLORFUL_VECTORIAL;

```
Con esto, se podrá intercambiar entre los tres estilos solicitados reescribiendo justo después del **Style.** Se puede escoger entre **VECTORIAL**, **SPRITES** y **COLORFUL_VECTORIAL**

Y eso es todo :D