package com.directi.training.designpatterns_refactored.observer;

import com.directi.training.designpatterns.observer.CharacterTestClient;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CharacterTests
{
    @Test
    public void testSanity()
    {
        com.directi.training.designpatterns.observer.CharacterTestClient client = new CharacterTestClient();
        assertTrue(client.testOutdoors());
        assertTrue(client.testSunRose());
        assertTrue(client.testSunSet());
        assertTrue(client.testIndoors());
    }
}