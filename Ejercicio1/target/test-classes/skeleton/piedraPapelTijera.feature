Feature: Juego Piedra Papel Tijera

 
  Scenario: Piedra vs Piedra
    Given jugador1 juega PIEDRA
    When jugador2 juega PIEDRA
    Then hay empate
	
  Scenario: Tijera vs Tijera
    Given jugador1 juega TIJERA
    When jugador2 juega TIJERA
    Then hay empate
