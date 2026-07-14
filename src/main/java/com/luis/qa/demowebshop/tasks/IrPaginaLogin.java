package com.luis.qa.demowebshop.tasks;

import com.luis.qa.demowebshop.interactions.ClickEn;
import com.luis.qa.demowebshop.pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrPaginaLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickEn.element(HomePage.LOGIN_MENU)
        );
    }

    public static IrPaginaLogin goToLoginPage() {
        return instrumented(IrPaginaLogin.class);
    }

}
