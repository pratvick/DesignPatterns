package com.directi.training.designpatterns.builder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PeopleRepresentationTest
{
    @Test
    public void testPeopleXml()
    {
        List<Person> persons = new ArrayList<>(3);
        persons.add(new Person("Wu", 25, "Shanghai", "China"));
        persons.add(new Person("Kobayashi", 200, "Kanto", "Japan"));
        persons.add(new Person("Vasily", 1, "Leningrad", "Russia"));
        String expectedXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                             "<people number=3>" +
                                "<person>" +
                                    "<id>25</id>" +
                                    "<name>Wu</name>" +
                                    "<address>" +
                                        "<city>Shanghai</city>" +
                                        "<country>China</country>" +
                                    "</address>" +
                                "</person>" +
                                "<person>" +
                                    "<id>200</id>" +
                                    "<name>Kobayashi</name>" +
                                    "<address>" +
                                        "<city>Kanto</city>" +
                                        "<country>Japan</country>" +
                                    "</address>" +
                                "</person>" +
                                "<person>" +
                                    "<id>1</id>" +
                                    "<name>Vasily</name>" +
                                    "<address>" +
                                        "<city>Leningrad</city>" +
                                        "<country>Russia</country>" +
                                    "</address>" +
                                "</person>" +
                             "</people>";
        assertEquals(expectedXml, PeopleRepresentation.getPeopleXml(persons));
    }

    @Test
    public void testPeopleJson()
    {
        List<Person> persons = new ArrayList<>(3);
        persons.add(new Person("Wu", 25, "Shanghai", "China"));
        persons.add(new Person("Kobayashi", 200, "Kanto", "Japan"));
        persons.add(new Person("Vasily", 1, "Leningrad", "Russia"));

        String expectedJson = "people:" +
                              "[" +
                              "{" +
                              "\"id\":25," +
                              "\"name\":\"Wu\"," +
                              "\"address\":" +
                                "{" +
                                    "\"city\":\"Shanghai\"," +
                                    "\"country\":\"China\"" +
                                "}" +
                              "}," +
                              "{" +
                              "\"id\":200," +
                              "\"name\":\"Kobayashi\"," +
                              "\"address\":" +
                                "{" +
                                    "\"city\":\"Kanto\"," +
                                    "\"country\":\"Japan\"" +
                                "}" +
                              "}," +
                              "{" +
                              "\"id\":1," +
                              "\"name\":\"Vasily\"," +
                              "\"address\":" +
                                "{" +
                                    "\"city\":\"Leningrad\"," +
                                    "\"country\":\"Russia\"" +
                                "}" +
                              "}" +
                              "]";
        assertEquals(expectedJson, PeopleRepresentation.getPeopleJson(persons));
    }
}