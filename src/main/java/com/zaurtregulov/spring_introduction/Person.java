package com.zaurtregulov.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {

//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.sureName}")
    private String surname;
    @Value("${person.age}")
    private int age;

        public Person() {
        System.out.println("Person is  created");
    }

//    @Autowired
//    public Person(@Qualifier("dog") Pet pet) {
//        System.out.println("Person bean is  created");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is  created");
        this.pet = pet;
    }

    public void setAge(int age) {
        System.out.println("Class Pesron: Age is set");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        System.out.println("Class Pesron: Surname is set");
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }


//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: pet created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
