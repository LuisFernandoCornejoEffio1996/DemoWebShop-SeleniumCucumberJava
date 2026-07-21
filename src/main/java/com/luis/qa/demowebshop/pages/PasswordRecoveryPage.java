package com.luis.qa.demowebshop.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PasswordRecoveryPage extends PageObject {
    public static final Target EMAIL = Target.the("campo de email").located(By.id("Email"));

    public static final Target RECOVER_BUTTON = Target.the("botón Recover").located(By.xpath("//input[@value='Recover']"));

    public static final Target MESSAGE_RECUPERACION = Target.the("mensaje de recuperación").located(By.cssSelector(".result"));

    public static final Target VALIDAR_EMAIL_MESSAGE = Target.the("mensaje de validacion del campo email").located(By.cssSelector("span[data-valmsg-for='Email']"));
}
