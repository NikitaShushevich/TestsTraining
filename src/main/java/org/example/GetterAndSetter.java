package org.example;

public class GetterAndSetter {
    private String name;
    private int age;

    // Геттер для поля "name"
    public String getName() {
        return name;
    }

    // Сеттер для поля "name"
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для поля "age"
    public int getAge() {
        return age;
    }

    // Сеттер для поля "age"
    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Некоректний вік!");
        }
    }



    public static void main(String[] args) {
        GetterAndSetter person = new GetterAndSetter();

        // Використання сеттера для встановлення значення поля "name"
        person.setName("John");

        // Використання сеттера для встановлення значення поля "age"
        person.setAge(30);

        // Використання геттера для отримання значення поля "name"
        System.out.println("Ім'я: " + person.getName()); // Виведе: Ім'я: John

        // Використання геттера для отримання значення поля "age"
        System.out.println("Вік: " + person.getAge()); // Виведе: Вік: 30

        // Спроба встановити некоректне значення для поля "age"
        person.setAge(0); // Виведе: Некоректний вік!
    }
}
