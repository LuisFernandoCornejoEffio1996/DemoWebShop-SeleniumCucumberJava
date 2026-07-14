package com.luis.qa.demowebshop.tasks;

import com.luis.qa.demowebshop.interactions.ClickEn;
import com.luis.qa.demowebshop.interactions.IngresarValor;
import com.luis.qa.demowebshop.pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginConCredenciales implements Task {

    private final String email;
    private final String password;

    public LoginConCredenciales(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarValor.into(LoginPage.EMAIL, email),
                IngresarValor.into(LoginPage.PASSWORD, password),
                ClickEn.element(LoginPage.LOGIN_BUTTON)
        );
    }

    public static LoginConCredenciales using(String email, String password) {
        return instrumented(LoginConCredenciales.class, email, password);
    }
}
