package Lesson_05.Ex_05;

//  Задача 5.
//  Создать консольное приложение, удовлетворяющее следующим требованиям:
//•  Корректно спроектируйте и реализуйте предметную область задачи.
//•  Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
//проектирования.
//•  Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
//•  для проверки корректности переданных данных можно применить регулярные выражения.
//•  Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
//•  Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

//  Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
//  подарок). Составляющими целого подарка являются сладости и упаковка.

import Lesson_05.Ex_05.action.Client;

public class MainPresentShop {
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}
