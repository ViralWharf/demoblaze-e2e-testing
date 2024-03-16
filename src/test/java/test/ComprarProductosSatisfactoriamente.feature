Feature: Se compran dos productos satisfactoriamente

  Background:
    Given El usuario ingresa a la pagina
    When Ingresa las credenciales
    Then Se inicio sesion correctamente

  Scenario Outline: Verificar el flujo completo de compra para dos productos
    Given El usuario ingresa productos al carrito
    When Ingresa al carrito
    And Se confirma la compra
    And El usuario ingresa '<Nombre>' '<Apellido>' y '<Zip>' en el formulario
    And Guarda los datos
    And El usuario finaliza la compra
    Then Se realizo la compra correctamente y se vuelve al inicio

    Examples:
      | Nombre    | Apellido | Zip    |
      | José Luis | Díaz     | 110111 |
