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