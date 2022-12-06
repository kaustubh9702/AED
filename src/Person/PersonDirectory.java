/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaustubh
 */
public class PersonDirectory {
     List<Person> personList;
    private static PersonDirectory persondirectory;

    public static PersonDirectory getInstance() {
        if (persondirectory == null) {
            persondirectory = new PersonDirectory();
        }
        return persondirectory;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public PersonDirectory() {
        personList = new ArrayList<Person>();
    }

    public Person addPerson() {
        Person ch = new Person();
        personList.add(ch);
        return ch;
    }

    public void removePerson(Person ch) {
        personList.remove(ch);
    }
}
