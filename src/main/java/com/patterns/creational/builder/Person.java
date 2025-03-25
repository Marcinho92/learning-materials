package com.patterns.creational.builder;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String city;

    public static class PersonBuilder {

        private final Person person;

        public PersonBuilder(Person person) {
            this.person = person;
        }

        public static PersonBuilder builder() {
            return new PersonBuilder(new Person());
        }

        public PersonBuilder firstName(String firstName) {
            this.person.setFirstName(firstName);
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.person.setLastName(lastName);
            return this;
        }

        public PersonBuilder birthDate(LocalDate birthDate) {
            this.person.setBirthDate(birthDate);
            return this;
        }

        public PersonBuilder city(String city) {
            this.person.setCity(city);
            return this;
        }

        public Person build() {
            return this.person;
        }

    }

}
