Feature: Login en Demo Web Shop
  Como usuario de Demo Web Shop
  Quiero iniciar sesión con distintas credenciales
  Para validar accesos permitidos y rechazados

  Background:
    Given que el usuario se encuentra en la página de login

  @login @regresion
  Scenario Outline: Login exitoso con credenciales válidas
    When el usuario realiza login con email "<email>" y password "<password>"
    Then el usuario es redirigido a la url "/"
    And se muestra el email "<email>" en el menu

    Examples:
      | email                | password |
      | prueba1_26@gmail.com | 1234567  |

  @login @negativo @regresion
  Scenario Outline: Login fallido con credenciales inválidas
    When el usuario realiza login con email "<email>" y password "<password>"
    Then el usuario permanece en la url "/login"
    And el login debe ser fallido con mensaje "<mensaje_principal>" y detalle "<mensaje_detalle>"

    Examples:
      | email                  | password | mensaje_principal                                                | mensaje_detalle                        |
      | test@correo.com        | 123456   | Login was unsuccessful. Please correct the errors and try again. | The credentials provided are incorrect |
      | no-registrado@mail.com | 123456   | Login was unsuccessful. Please correct the errors and try again. | No customer account found              |
      |                        | 123456   | Login was unsuccessful. Please correct the errors and try again. | No customer account found              |
      | test@correo.com        |          | Login was unsuccessful. Please correct the errors and try again. | The credentials provided are incorrect |
      |                        |          | Login was unsuccessful. Please correct the errors and try again. | No customer account found              |

  @login @regresion @validacion
  Scenario Outline: Validación de formato de email sin enviar formulario
    When el usuario ingresa un email inválido "<email>" en el campo email
    And el usuario sale del campo email
    Then se muestra el mensaje de validación de email "<mensaje>"

    Examples:
      | email           | mensaje                              |
      | correo-invalido | Please enter a valid email address.  |
      | a@              | Please enter a valid email address.  |
      | a@f             | Please enter a valid email address.  |
      | @12.com         | Please enter a valid email address.  |

  @login @regresion
  Scenario: Validacion de Forgot Password
    When el usuario hace click en el link Forgot password
    Then el usuario es redirigido a la url "/passwordrecovery"