package com.luis.qa.demowebshop.stepDefinition;

import com.luis.qa.demowebshop.interactions.ClickEn;
import com.luis.qa.demowebshop.interactions.IngresarValor;
import com.luis.qa.demowebshop.pages.PasswordRecoveryPage;
import com.luis.qa.demowebshop.questions.TextoDe;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class PasswordRecoveryStepDefinition {

    @When("el {actor} ingresa su email {string}")
    public void elUsuarioIngresaSuEmail(Actor actor, String email) {
        actor.attemptsTo(
                IngresarValor.into(PasswordRecoveryPage.EMAIL, email)
        );
    }

    @And("el {actor} hace click en el boton Recover")
    public void elUsuarioHaceClickEnElBotonRecover(Actor actor) {
        actor.attemptsTo(
                ClickEn.element(PasswordRecoveryPage.RECOVER_BUTTON)
        );
    }

    @Then("se muestra el mensaje de recuperacion {string}")
    public void seMuestraElMensajeDeRecuperacion(String mensaje) {
        Actor actor = OnStage.theActorInTheSpotlight();
        assertThat(actor.asksFor(TextoDe.the(PasswordRecoveryPage.MESSAGE_RECUPERACION)), containsString(mensaje));
    }
}
