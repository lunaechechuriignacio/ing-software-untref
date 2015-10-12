Feature: Como usuario quiero ubicar mis barcos

  Scenario: Ubico mi barco exitosamente
    Given posicion (1,1) esta libre y posicion (1,2) esta libre
    When jugador posiciona un "Acorazado" en la posicion (1,1) "HORIZONTAL"
    Then barco posicionado exitosamente

  Scenario: No se puede ubicar un barco en una posicion ya ocupada
    Given hay un barco en posicion (1,1)
    When jugador posiciona un barco en la posicion (1,1) "HORIZONTAL"
    Then posicion ocupada no se puede ubicar el barco alli

  Scenario: No se puede ubicar un barco si alguna de sus posiciones intermedias esta siendo ocupada por otro
    Given hay un barco en posicion (2,1)
    When jugador posiciona un  "Destructor" en la posicion (1,1) "VERTICAL"
    Then posicion ocupada no se puede ubicar el barco alli

  Scenario: No puedo ubicar mi barco en una posicion fuera del tablero
    Given tablero es de 10x10
    When jugador posiciona un barco en la posicion (11,1) "VERTICAL"
    Then la posicion elegida no pertenece al tablero
