Feature: Juego Ahorcado	

  Scenario: Arriesgo una "a"
    Given la palabra secreta es "auto"
    When arriesgo "a"
    Then estado es "a***"
    And me quedan 7 vidas

  Scenario: Arriesgo una "A"
    Given la palabra secreta es "auto"
    When arriesgo "A"
    Then estado es "a***"
    And me quedan 7 vidas

  Scenario: Arriesgo una "x"
    Given la palabra secreta es "auto"
    When arriesgo "x"
    Then estado es "****"
    And me quedan 6 vidas

  Scenario: Arriesgo una "o"
    Given la palabra secreta es "auto"
    When arriesgo "o"
    Then estado es "***o"
    And me quedan 7 vidas

  Scenario: Arriesgo una "u"
    Given la palabra secreta es "auto"
    When arriesgo "u"
    Then estado es "*u**"
    And me quedan 7 vidas

  Scenario: Arriesgo una "u"
    Given la palabra secreta es "auto"
    When arriesgo "t"
    Then estado es "**t*"
    And me quedan 7 vidas

  Scenario: Arriesgo una "o" y acierto la palabra secreta
    Given la palabra secreta es "auto"
    When el estado es "aut*"
    And arriesgo "o"
    Then estado es "auto"

  Scenario: Arriesgo una "x" con "1" vida
    Given la palabra secreta es "auto"
    And me quedan 1 vida
    When arriesgo "x"
    Then estado es "ahorcado"
