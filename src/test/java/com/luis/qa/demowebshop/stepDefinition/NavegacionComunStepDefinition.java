package com.luis.qa.demowebshop.stepDefinition;

import com.luis.qa.demowebshop.tasks.IrPaginaLogin;
import com.luis.qa.demowebshop.tasks.AbrirPaginaInicio;
import com.luis.qa.demowebshop.tasks.IrPaginaRecuperarContrasena;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;

public class NavegacionComunStepDefinition {

    @Given("que el {actor} se encuentra en la página principal")
    public void enPaginaPrincipal(Actor actor) {
        actor.attemptsTo(AbrirPaginaInicio.open());
    }

    @Given("que el {actor} se encuentra en la página de login")
    public void enPaginaLogin(Actor actor) {
        actor.attemptsTo(
                AbrirPaginaInicio.open(),
                IrPaginaLogin.goToLoginPage()
        );
    }

    @Given("que el {actor} se encuentra en la pagina de recuperar contrasena")
    public void enPaginaRecuperarContrasena(Actor actor) {
        actor.attemptsTo(
                AbrirPaginaInicio.open(),
                IrPaginaLogin.goToLoginPage(),
                IrPaginaRecuperarContrasena.goToRecoverPasswordPage()
        );
    }

}
