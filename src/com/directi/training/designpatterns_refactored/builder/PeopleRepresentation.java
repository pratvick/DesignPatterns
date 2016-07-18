package com.directi.training.designpatterns_refactored.builder;

import java.util.List;

public class PeopleRepresentation
{
    public static String constructRepresentation(List<Person> persons, AbstractBuilder builder)
    {
        builder.addHeader();
        builder.startPeople(persons.size());
        for (Person person : persons) {
            builder.startPerson();
            builder.addId(person.getId() + "");
            builder.addName(person.getName());
            builder.addAddress(person.getCity(), person.getCountry());
            builder.endPerson();
        }
        builder.endPeople();
        return builder.getRepresentation();
    }
}
