package com.luis.qa.demowebshop.tasks;

import com.luis.qa.demowebshop.interactions.ClickEn;
import com.luis.qa.demowebshop.pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrPaginaRecuperarContrasena implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickEn.element(LoginPage.FORGOT_PASSWORD_LINK)
        );
    }

    public static IrPaginaRecuperarContrasena goToRecoverPasswordPage() {
        return instrumented(IrPaginaRecuperarContrasena.class);
    }
}
