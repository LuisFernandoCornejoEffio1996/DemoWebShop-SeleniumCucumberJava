package com.luis.qa.demowebshop.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Interaction personalizada para escribir texto en un campo específico.
 * Se usa para mantener las acciones pequeñas y reutilizables.
 */
public class IngresarValor implements Interaction{

    private final Target target;
    private final String value;

    public IngresarValor(Target target, String value) {
        this.target = target;
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(value).into(target)
        );
    }

    /**
     * Método estático para crear la interacción.
     */
    public static IngresarValor into(Target target, String value) {
        return new IngresarValor(target, value);
    }
}
