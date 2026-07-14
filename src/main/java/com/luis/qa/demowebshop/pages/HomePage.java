package com.luis.qa.demowebshop.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("page:home.url")
public class HomePage extends PageObject {

    // Botón del menú superior para abrir el formulario de login
    public static final Target LOGIN_MENU = Target.the("opción Log in del menú superior").located(By.xpath("//a[text()='Log in']"));

    public static final Target ACCOUNT_LINK =
            Target.the("correo del usuario logueado en el menu")
                    .located(net.serenitybdd.core.annotations.findby.By.cssSelector("a.account"));
}
