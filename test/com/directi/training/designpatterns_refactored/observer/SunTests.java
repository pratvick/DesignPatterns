package com.directi.training.designpatterns_refactored.observer;

import com.directi.training.designpatterns.observer.SunTestClient;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SunTests
{
    @Test
    public void testAtSunrise_CharactersIndoorsAreNotNotified()
    {
        com.directi.training.designpatterns.observer.SunTestClient sunTestClient = new com.directi.training.designpatterns.observer.SunTestClient();
        sunTestClient.aFewCharactersGoOutdoors();
        sunTestClient.sunRise();
        assertTrue("Only outdoors characters are notified on sunrise.",
            sunTestClient.outdoorsCharactersFeelWarm());

        sunTestClient = new com.directi.training.designpatterns.observer.SunTestClient();
        sunTestClient.aFewOtherCharactersGoOutdoors();
        sunTestClient.sunRise();
        assertTrue("Only outdoors characters are notified on sunrise.",
            sunTestClient.outdoorsCharactersFeelWarm());
    }

    @Test
    public void testAtSunset_OnlyCharactersOutsideAreNotified()
    {
        com.directi.training.designpatterns.observer.SunTestClient suntestClient = new SunTestClient();
        suntestClient.aFewCharactersGoOutdoors();
        suntestClient.sunRise();
        suntestClient.sunSet();
        assertTrue("Characters who were outdoors at sunset feel tired.",
            suntestClient.outdoorsCharactersFeelTired());
    }
}
