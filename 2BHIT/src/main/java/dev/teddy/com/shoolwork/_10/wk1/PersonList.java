package dev.teddy.com.shoolwork._10.wk1;

import dev.teddy.com.shoolwork._10.wk1.ex.*;

public class PersonList {
    private Person[] persons;
    private int count;

    public PersonList(int size) {
        persons = new Person[size];
        count = 0;
    }

    public void addPerson(Person p) throws InvalidPersonException, PersonListFullException {
        if (p == null || p.getName() == null || p.getName().isEmpty() || p.getAge() < 0) {
            throw new InvalidPersonException("Ungültige Person.");
        }
        if (count >= persons.length) {
            throw new PersonListFullException("Liste ist voll.");
        }
        persons[count++] = p;
    }

    public boolean containsPerson(String name) throws PersonNotFoundException {
        for (int i = 0; i < count; i++) {
            if (persons[i].getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        throw new PersonNotFoundException("Person nicht gefunden.");
    }
}