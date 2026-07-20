Feature: Recuperación de Contraseña en Demo Web Shop
  Como usuario de Demo Web Shop
  Quiero recuperar mi contraseña
  Para acceder a mi cuenta si la olvido

  Background:
    Given que el usuario se encuentra en la pagina de recuperar contrasena

  @passwordRecovery @regresion
  Scenario Outline: Recuperar contraseña segun estado de registro del email
    When el usuario ingresa su email "<email>"
    And el usuario hace click en el boton Recover
    Then se muestra el mensaje de recuperacion "<mensaje>"

    Examples:
      | email                | mensaje                                       |
      | prueba1_26@gmail.com | Email with instructions has been sent to you. |
      | prueba1_29@gmail.com | Email not found.                              |

  @passwordRecovery @validacionCampo
  Scenario Outline: Validar formato de correo en recuperacion
    When el usuario ingresa su email "<email>"
    And sale del campo email en recuperacion
    Then se muestra el mensaje de validación de email "<mensaje>" en recuperacion

    Examples:
      | email           | mensaje     |
      | correo_invalido | Wrong email |
      | test@           | Wrong email |
      | @dominio.com    | Wrong email |
      | test.com        | Wrong email |