package com.luis.qa.demowebshop.tasks;

import com.luis.qa.demowebshop.pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaInicio implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(HomePage.class)
        );
    }

    public static AbrirPaginaInicio open() {
        return instrumented(AbrirPaginaInicio.class);
    }

}
