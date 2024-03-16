Feature: Se compran productos de la misma categoría

  Background:
    Given El usuario ingresa a la pagina
    When Ingresa las credenciales
    Then Se inicio sesion correctamente

  Scenario Outline: Verificar el flujo completo de compra para productos de la misma categoría
    Given El usuario ingresa '<Categoria>' y selecciona un '<Producto>' con '<Precio>' al carrito
    When Ingreso al carrito
    And Se confirma la compra
    And El usuario ingresa '<Nombre>' '<Pais>' '<Ciudad>' '<Tarjeta de credito>' '<Mes>' y '<Anio>' en el formulario
    Then Se confirma la compra correctamente

    Examples:
      | Nombre          | Pais           | Ciudad     | Tarjeta de credito  | Mes | Anio | Categoria | Producto          | Precio |
      | Juan Pérez      | Estados Unidos | Nueva York | 1234 5678 9012 3456 | 08  | 2023 | Phones    | Samsung galaxy s6 | $360   |
      | Maria García    | Reino Unido    | Londres    | 9876 5432 1098 7654 | 05  | 2024 | Phones    | Iphone 6 32gb     | $790   |
      | Laura Rodríguez | Francia        | París      | 3456 7890 1234 5678 | 03  | 2025 | Laptops   | Sony vaio i5      | $790   |



