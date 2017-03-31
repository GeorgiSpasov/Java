package com;

import java.util.EnumSet;

public class JavaTesting {

    enum Animal {
        DOG("woof") {
            @Override
            public String say() {
                return "Sharo";
            }

            @Override
            public String dontSay() {
                return "Dog Silence";
            }
        },
        CAT("meow") {
            @Override
            public String say() {
                return "Maca";
            }

            @Override
            public String dontSay() {
                return "Cat Silence";
            }
        },
        FISH("burble") {
            @Override
            public String say() {
                return "Goldy";
            }

            @Override
            public String dontSay() {
                return "Fish Silence";
            }
        };
        final String sound; // package access

        private Animal(String s) {
            sound = s;
        }

        public abstract String say();

        public abstract String dontSay();
    }

    public static void main(String[] args) {

        EnumSet.range(Animal.CAT, Animal.FISH).forEach((a) -> {
            System.out.println(a.dontSay());
        });
    }
}
