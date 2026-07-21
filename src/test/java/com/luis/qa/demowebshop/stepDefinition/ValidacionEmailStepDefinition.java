package com.luis.qa.demowebshop.stepDefinition;

import com.luis.qa.demowebshop.interactions.ClickEn;
import com.luis.qa.demowebshop.pages.LoginPage;
import com.luis.qa.demowebshop.pages.PasswordRecoveryPage;
import com.luis.qa.demowebshop.questions.TextoDe;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ValidacionEmailStepDefinition {

    @And("sale del campo email en {word}")
    public void saleDelCampoEmailEn(String contexto) {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(
                ClickEn.element(campoParaPerderFoco(contexto))
        );
    }

    @Then("se muestra el mensaje de validación de email {string} en {word}")
    public void seMuestraElMensajeDeValidacionDeEmailEn(String mensaje, String contexto) {
        Actor actor = OnStage.theActorInTheSpotlight();
        assertThat(actor.asksFor(TextoDe.the(mensajeValidacion(contexto))), containsString(mensaje));
    }

    private Target campoParaPerderFoco(String contexto) {
        return switch (contexto.toLowerCase()) {
            case "login" -> LoginPage.PASSWORD;
            case "recuperacion" -> PasswordRecoveryPage.RECOVER_BUTTON;
            default -> throw new IllegalArgumentException("Contexto no soportado: " + contexto);
        };
    }

    private Target mensajeValidacion(String contexto) {
        return switch (contexto.toLowerCase()) {
            case "login" -> LoginPage.VALIDAR_EMAIL_MESSAGE;
            case "recuperacion" -> PasswordRecoveryPage.VALIDAR_EMAIL_MESSAGE;
            default -> throw new IllegalArgumentException("Contexto no soportado: " + contexto);
        };
    }

}
