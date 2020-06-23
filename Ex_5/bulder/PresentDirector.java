package Lesson_05.Ex_05.builder;

import Lesson_05.Ex_05.entity.Present;

public class PresentDirector {
    private PresentBuilder presentBuilder;

    public void setPresentBuilder(PresentBuilder presentBuilder) {
        this.presentBuilder = presentBuilder;
    }

    public Present buildPresent() {
        presentBuilder.createPresent();
        presentBuilder.buildName();
        presentBuilder.buildPrice();
        presentBuilder.buildWrap();
        presentBuilder.buildProducts();
        return presentBuilder.getPresent();
    }

    public PresentBuilder getPresentBuilder() {
        return presentBuilder;
    }
}