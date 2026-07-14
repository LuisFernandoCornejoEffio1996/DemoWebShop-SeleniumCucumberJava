Feature: Navegación de la pagina principal de Demo Web Shop
  Como usuario de Demo Web Shop
  Quiero acceder a las opciones disponibles en la página principal
  Para navegar hacia las distintas funcionalidades del sitio

  Background:
    Given que el usuario se encuentra en la página principal

  @home @smoke
  Scenario: Visualización del botón Log in
    Then el botón Log in debe mostrarse en la barra superior

  @smoke @navegacion
  Scenario: Navegación al formulario de Login
    When el usuario hace clic en el botón Log in
    Then el usuario es redirigido a la página de Login

