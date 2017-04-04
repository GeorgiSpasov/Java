package com.basics;

import java.util.EnumSet;

public class Enums {

    enum Animal {
        DOG("woof") {
            @Override
            public String identify() {
                return "Balkan";
            }

            @Override
            public int nameLength() {
                return identify().length();
            }
        },
        CAT("meow") {
            @Override
            public String identify() {
                return "Kate";
            }

            @Override
            public int nameLength() {
                return identify().length();
            }
        },
        FISH("burble") {
            @Override
            public String identify() {
                return "Goldy";
            }

            @Override
            public int nameLength() {
                return identify().length();
            }
        };
        private String sound; // package access

        public String getSound() {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }

        private Animal(String s) {
            sound = s;
        }

        public abstract String identify();

        public abstract int nameLength();
    }

    public static void main(String[] args) {

        Animal.DOG.setSound("woof woof");

        EnumSet.range(Animal.DOG, Animal.FISH).forEach((a) -> {
            System.out.printf("%s's name is %s (%d chars).\n", a.name(), a.identify(), a.nameLength());
            System.out.printf("%s's sound is %s.\n", a.name(), a.sound);
            switch (a.name()) {
                case "DOG":
                case "CAT":
                    System.out.println("Mammal");
                    break;
                case "FISH":
                    System.out.println("Not mammal");
                    break;
            }
        });

    }
}
