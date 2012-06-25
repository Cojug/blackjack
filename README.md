Blackjack - Taller TDD - Carlos Obregon
===

Objetivo
===
La idea del taller es desarrollar un juego de Blackjack usando TDD.

Descripción
===

Blackjack es un juego que utiliza la baraja francesa. Cada carta tiene un palo (suit) y un número (rank). 
Los valores posibles en orden son: As, 2,3,4,5,6,7,8,9,J,Q,K. En la mayoría de juegos, cada carta tiene 
un valor correspondiente a su posición en el orden: As vale 1, J vale 11, etc. Pero en Blackjack las cartas 
J,Q y K también valen 10. Adicionalmente el As vale 1 u 11, lo que convenga más al jugador. Un conjunto de 
52 cartas (13 por cada uno de los 4 palos) se le conoce como mazo (deck).

El objetivo del juego es obtener el mayor pountaje posible qu sea menor a 22. En el juego un jugador representa 
la casa llamado crupier y compite contra varios jugadores. En nuestra versión, sólo habrá un jugador.

Cada jugador cuenta con un conjunto de cartas llamadas la mano. El valor de la mano es la suma del valor 
de las cartas. Obtener 21 con solo 2 cartas recibe el nombre de Blackjack. Al iniciar el juego, sele reparte 2 cartas a cada jugador, 
pero la segunda carta del crupier permanece tapada.

Entonces comienza el turno del jugador. En nuestro juego, el jugador tendrá sólo 2 opciones:
plantarse o pedir una carta. Al plantarse termina su turno, situcación que se da automaticamente sí en algún momento su puntaje llega 
a 21 o más. Al pedir una carta, como su nombre lo indica, se le añade una carta del mazo a su mano. Si el puntaje 
del jugdor es más de 21 pierde automáticamente la partida.

Una vez terminado el turno del jugador si este no es el crupier destapa su carta y debe pedir una nueva carta
hasta que su puntaje sea al menos 17.

El jugador gana la partida si tiene un puntaje estricamente mayor que el crupier siempre y cuando el puntaje no exceda 21 o si puntaje 
es menor que el crupier y el de éste es mayor a 21. La partida se empata si y solo si ambos jugadores tienen Blackjack.
En todos los demás casos la casa gana.

Pasos
===

1. Clone este proyecto
2. Vea el desarrollo de la clase BlackjackCard usando TDD
3. Utilizando TDD realice el código necesario para tener una implementación concreta de la interfaz Hand. Aunque el
orden en el que desarrolle los métodos no tiene un gran impacto le recomendamos el siguiente orden:

  a. int size();
  b. void flipCards();
  c. void addCard(Card card);
  d. int getValue();
  
Recuerde los 3 pasos para cada iteración con TDD: rojo, en donde se escribe un test que falla (no compilar se considera fallo);
verde, donde escribimos la mínima implementación posible que nos permita hacer pasar el test; refactor, 
donde limpiamos el código de la clase implementada y de los test.

Realice los tests suficientes para considerar que ha probado todos los caminos posibles que pueda tomar su código.

4. El comportamiento para decidir el desenlace del juego no se ajusta realmente a las reglas como están descritas en este
documento. Utilice TDD para añadir tests que le permitan encontrar los bugs y haga los ajustes necesarios al método
BlackjackWinnerdetermineOutcome(int player) de la clase BlackjackGame para que estos test pasen. Una vez los test pasen, 
realice un refactor al código para hacerlo más simple. Al hacer el refactor, corra frecuentemente los test para verificar 
que no ha roto funcionalidad ya existente.