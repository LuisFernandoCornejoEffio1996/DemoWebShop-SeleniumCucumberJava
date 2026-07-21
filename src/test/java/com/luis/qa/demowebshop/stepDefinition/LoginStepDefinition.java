package com.luis.qa.demowebshop.stepDefinition;

import com.luis.qa.demowebshop.interactions.ClickEn;
import com.luis.qa.demowebshop.interactions.IngresarValor;
import com.luis.qa.demowebshop.pages.HomePage;
import com.luis.qa.demowebshop.pages.LoginPage;
import com.luis.qa.demowebshop.questions.UrlPaginaActual;
import com.luis.qa.demowebshop.questions.TextoDe;
import com.luis.qa.demowebshop.tasks.IrPaginaRecuperarContrasena;
import com.luis.qa.demowebshop.tasks.LoginConCredenciales;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Step Definitions que conectan los pasos del feature con las Tasks y Questions de Screenplay.
 * Aquí se orquesta el comportamiento del actor.
 */
public class LoginStepDefinition {

    @When("el {actor} realiza login con email {string} y password {string}")
    public void loginConCredenciales(Actor actor, String email, String password) {
        actor.attemptsTo(LoginConCredenciales.using(email, password));
    }

    @Then("el {actor} es redirigido a la url {string}")
    public void redirigidoAUrl(Actor actor, String path) {
        assertThat(actor.asksFor(UrlPaginaActual.value()), containsString(path));
    }

    @And("se muestra el email {string} en el menu")
    public void emailEnMenu(String email) {
        Actor actor = OnStage.theActorInTheSpotlight();
        assertThat(actor.asksFor(TextoDe.the(HomePage.ACCOUNT_LINK)), is(email));
    }

    @Then("el {actor} permanece en la url {string}")
    public void elUsuarioPermaneceEnLaUrl(Actor actor, String path) {
        assertThat(actor.asksFor(UrlPaginaActual.value()), containsString(path));
    }

    @And("el login debe ser fallido con mensaje {string} y detalle {string}")
    public void elLoginDebeSerFallidoConMensajeYDetalle(String mensajePrincipal, String mensajeDetalle) {
        Actor actor = OnStage.theActorInTheSpotlight();
        assertThat(actor.asksFor(TextoDe.the(LoginPage.LOGIN_MESSAGE_ERROR)), containsString(mensajePrincipal));
        assertThat(actor.asksFor(TextoDe.the(LoginPage.MESSAGE_LOGIN_DETAIL)), containsString(mensajeDetalle));
    }

    @When("el {actor} ingresa un email invalido {string} en el campo email")
    public void elUsuarioIngresaUnEmailInvalidoEnElCampoEmail(Actor actor, String email) {
        actor.attemptsTo(
                IngresarValor.into(LoginPage.EMAIL, email)
        );
    }

    @When("el {actor} hace click en el link Forgot password")
    public void elUsuarioHaceClickEnElLinkForgotPassword(Actor actor) {
        actor.attemptsTo(
                IrPaginaRecuperarContrasena.goToRecoverPasswordPage()
        );
    }

}
