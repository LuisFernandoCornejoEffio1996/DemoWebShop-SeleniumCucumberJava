package com.luis.qa.demowebshop.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Interaction personalizada para realizar clic sobre un elemento específico.
 * Mantiene la acción simple y reutilizable.
 */
public class ClickEn implements Interaction {

    private final Target target;

    public ClickEn(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target)
        );
    }

    /**
     * Método estático para crear la interacción.
     */
    public static ClickEn element(Target target) {
        return new ClickEn(target);
    }
}
