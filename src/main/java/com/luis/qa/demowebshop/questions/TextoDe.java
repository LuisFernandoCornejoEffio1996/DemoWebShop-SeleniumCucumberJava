package com.luis.qa.demowebshop.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Question que extrae el texto de un elemento web específico.
 */
public class TextoDe implements Question<String> {

    private final Target target;

    public TextoDe(Target target) {
        this.target = target;
    }

    /**
     * El actor retorna el texto del elemento sin espacios en blanco al inicio/final
     */
    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText().trim();
    }

    /**
     * sintaxis más natural en los tests: TextoDe.the(TARGET)
     */
    public static TextoDe the(Target target) {
        return new TextoDe(target);
    }

}
