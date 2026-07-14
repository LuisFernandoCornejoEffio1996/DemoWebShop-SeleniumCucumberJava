package com.luis.qa.demowebshop.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TextoDe implements Question<String> {

    private final Target target;

    public TextoDe(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText().trim();
    }

    public static TextoDe the(Target target) {
        return new TextoDe(target);
    }

}
