package com.luis.qa.demowebshop.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Página de Login.
 * Contiene el mapeo de elementos (locators).
 * No contiene lógica ni acciones.
 */
@DefaultUrl("page:home.url")
public class LoginPage extends PageObject {

    // Mapeo de elementos formulario de login
    public static final Target EMAIL = Target.the("Campo de correo electrónico").located(By.id("Email"));

    public static final Target PASSWORD = Target.the("Campo de contraseña").located(By.id("Password"));

    public static final Target LOGIN_BUTTON = Target.the("Botón de inicio de sesión").located(By.xpath("//input[@value='Log in']"));

    public static final Target LOGIN_MESSAGE_ERROR =
            Target.the("mensaje principal de error de login")
                    .located(By.cssSelector(".validation-summary-errors"));

    public static final Target MESSAGE_LOGIN_DETAIL =
            Target.the("detalle del error de login")
                    .located(By.cssSelector(".validation-summary-errors li"));

    public static final Target VALIDAR_EMAIL_MESSAGE =
            Target.the("mensaje de validacion del campo email")
                    .located(By.cssSelector("span[data-valmsg-for='Email']"));

    public static final Target FORGOT_PASSWORD_LINK =
            Target.the("link de recuperar contraseña")
                    .located(By.xpath("//a[text()='Forgot password?']"));

    // Mapeo de elementos formulario de registro
    public static final Target REGISTER_BUTTON =
            Target.the("Botón de registro")
                    .located(By.xpath("//input[@value='Register']"));

}