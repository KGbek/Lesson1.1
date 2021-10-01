package com.geektech;

public class Main {

    public static void main(String[] args) {

        Shelter shelter = new Shelter("Ромашка","Масалиева 10");

        Dog ovcharka = new Dog("Мухтар", "Немецкая овчарка",
                new String[]{"Сидеть", "Атаковать"},shelter, ColorEnum.BLACK);
        System.out.println(ovcharka.getInfo());
        ovcharka.makeVoice("Гав гав");
        System.out.println("______________________");

        Dog buldog = new Dog("Спайк", "Бульдог",shelter, ColorEnum.BLACK);
        System.out.println(buldog.getInfo());
        buldog.makeVoice("Гав гав", 3);
        System.out.println("______________________");

        Dog pitbull = new Dog("Killer", "pitbull", new String[]{"Jump","Run"}, shelter, ColorEnum.BLACK);
        System.out.println(pitbull.getInfo());
        pitbull.makeVoice();
        System.out.println("______________________");

    }
}
