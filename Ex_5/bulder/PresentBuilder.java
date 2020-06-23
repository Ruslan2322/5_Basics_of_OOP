package Lesson_05.Ex_05.builder;

import Lesson_05.Ex_05.entity.Present;

abstract class PresentBuilder {
    Present present;

    void createPresent() {
        present = new Present();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildWrap();
    abstract void buildProducts();

    Present getPresent() {
        return present;
    }
}