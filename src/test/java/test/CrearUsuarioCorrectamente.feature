Feature: Se crea un usuario nuevo correctamente

  Background:
    Given El usuario ingresa a la pagina

  Scenario Outline: Verificar la creación de un usuario
    Given El usuario selecciona Sign up
    When Ingresa '<Username>' y '<Password>'
    Then Se crea el usuario correctamente

    Examples:
      | Username      | Password |
      | pruebaUsuario | P4s$W0rd |