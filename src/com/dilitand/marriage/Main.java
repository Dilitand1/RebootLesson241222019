package com.dilitand.marriage;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(true,"Dima");
        Person person2 = new Person(false,"Natalia");

        Person person3 = new Person(true,"Vasia");
        Person person4 = new Person(false, "Elena");

        System.out.println(person1.marry(person2));//женим первую пару
        System.out.println();
        System.out.println(person3.marry(person4));//женим вторую пару
        System.out.println();
        System.out.println(person1.marry(person4));//меняем супругов
        System.out.println();
        System.out.println(person1.marry(person3));//пытаемся поженить однополых (по идее false);
        //Тестим работу гитхаба, добавил в конец эту строку 25122019 19-54 и пытаюсь пропушить на другой акк
    }
}
