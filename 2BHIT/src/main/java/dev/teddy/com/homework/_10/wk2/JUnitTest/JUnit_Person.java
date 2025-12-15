package dev.teddy.com.homework._10.wk2.JUnitTest;

import dev.teddy.com.homework._10.wk2.*;
import dev.teddy.com.homework._10.wk2.ex.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class JUnit_Person {

    @Test
    void testAddPersonsNormally() {
        PersonList list = new PersonList(2);
        assertDoesNotThrow(() -> list.addPerson(new Person("Smith", 20)));
        assertDoesNotThrow(() -> list.addPerson(new Person("Tim", 20)));
    }

    @Test
    void testAddPersonsDuplicate() {
        PersonList list = new PersonList(2);
        assertDoesNotThrow(() -> list.addPerson(new Person("Smith", 20)));
        PersonDublicated exception = assertThrows(PersonDublicated.class, () -> list.addPerson(new Person("Smith", 20)));
        assertEquals("Person Gibt es schon", exception.getMessage());
    }



    @Test
    void testAddPersonWhenListFull() {
        PersonList list = new PersonList(1);
        assertDoesNotThrow(() -> list.addPerson(new Person("Smith", 20)));
        PersonListFullException exception = assertThrows(PersonListFullException.class, () -> list.addPerson(new Person("Tim", 20)));
        assertEquals("Liste ist voll.", exception.getMessage());
    }

    @Test
    void testAddInvalidPersonNull() {
        PersonList list = new PersonList(2);
        InvalidPersonException exception = assertThrows(InvalidPersonException.class, () -> list.addPerson(null));
        assertEquals("Ungültige Person.", exception.getMessage());
    }

    @Test
    void testAddInvalidPersonEmptyName() {
        PersonList list = new PersonList(2);
        InvalidPersonException exception = assertThrows(InvalidPersonException.class, () -> list.addPerson(new Person("", 20)));
        assertEquals("Ungültige Person.", exception.getMessage());
    }

    @Test
    void testAddInvalidPersonNegativeAge() {
        PersonList list = new PersonList(2);
        InvalidPersonException exception = assertThrows(InvalidPersonException.class, () -> list.addPerson(new Person("Smith", -1)));
        assertEquals("Ungültige Person.", exception.getMessage());
    }

    @Test
    void testContainsPersonFound() throws PersonNotFoundException, PersonDublicated, InvalidPersonException, PersonListFullException {
        PersonList list = new PersonList(2);
        list.addPerson(new Person("Smith", 20));
        assertTrue(list.containsPerson("smith")); // case insensitive
    }

    @Test
    void testContainsPersonNotFound() {
        PersonList list = new PersonList(2);
        PersonNotFoundException exception = assertThrows(PersonNotFoundException.class, () -> list.containsPerson("Smith"));
        assertEquals("Person nicht gefunden.", exception.getMessage());
    }

    @Test
    void testAddDuplicateDifferentCase() {
        PersonList list = new PersonList(2);
        assertDoesNotThrow(() -> list.addPerson(new Person("Smith", 20)));
        assertDoesNotThrow(() -> list.addPerson(new Person("smith", 20))); // not duplicate since equals is case sensitive
    }
}