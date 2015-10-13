Feature: Como usuario quiero disparar a los barcos enemigos

  Scenario: Disparo y toco agua
    Given no hay barcos en posicion 1,8
    When disparo a la posicion 1,8
    Then el disparo dio en el agua

  Scenario: Disparo y toco un barco pero no lo hundo
    Given hay un barco en posicion 1,8
    When disparo a la posicion 1,8
    Then el disparo dio en el blanco

  Scenario: No se puede disparar fuera del tablero
    Given tablero es de 10 x 10
    When disparo a la posicion 11,1
    Then no se puede disparar a esa posicion

  Scenario: Disparo toco un barco y lo hundo
    Given hay un barco en posicion 1,8
    When disparo a la posicion 1,8 And el disparo dio en el blanco
    Then el barco ha sido hundido en la posicion 1,8
 