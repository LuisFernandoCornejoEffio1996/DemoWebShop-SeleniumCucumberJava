package com.luis.qa.demowebshop.stepDefinition;

import com.luis.qa.demowebshop.pages.HomePage;
import com.luis.qa.demowebshop.questions.UrlPaginaActual;
import com.luis.qa.demowebshop.questions.EsVisible;
import com.luis.qa.demowebshop.tasks.IrPaginaLogin;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class HomeStepDefinition {

    @Then("el botón Log in debe mostrarse en la barra superior")
    public void elBotonLogInDebeMostrarseEnLaBarraSuperior() {
        Actor actor = OnStage.theActorInTheSpotlight();
        assertThat(actor.asksFor(EsVisible.the(HomePage.LOGIN_MENU)), is(true));
    }

    @When("el {actor} hace clic en el botón Log in")
    public void elUsuarioHaceClicEnElBotonLogIn(Actor actor) {
        actor.attemptsTo(IrPaginaLogin.goToLoginPage());
    }

    @Then("el {actor} es redirigido a la página de Login")
    public void elUsuarioEsRedirigidoALaPaginaDeLogin(Actor actor) {
        assertThat(actor.asksFor(UrlPaginaActual.value()), containsString("/login"));
    }
}
