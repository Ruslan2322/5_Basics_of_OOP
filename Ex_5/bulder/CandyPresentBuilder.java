package Lesson_05.Ex_05.builder;

import Lesson_05.Ex_05.action.Client;
import Lesson_05.Ex_05.entity.Product;
import Lesson_05.Ex_05.entity.Wrap;

import java.util.ArrayList;

public class CandyPresentBuilder extends PresentBuilder {

    @Override
    void buildName() {
        String name = Client.checkInputName();
        present.setName(name);
    }

    @Override
    void buildPrice() {
        System.out.println("What price do you want to buy a gift for?");
        double price = Client.checkInputPrice();
        present.setPrice(price);
    }

    @Override
    void buildWrap() {
        Wrap wrap = Client.chooseWrap();
        present.setWrap(wrap);
    }

    @Override
    void buildProducts() {
        present.setProducts(new ArrayList<Product>());
    }
}