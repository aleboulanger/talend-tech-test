package org.talend.test;

import org.junit.jupiter.api.Test;
import org.talend.test.lambda.Country;
import org.talend.test.lambda.CountryUtils;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountryTest {

    static class France implements Country {

        @Override
        public String getContinent() {
            return "europe";
        }

        @Override
        public int getPopulation() {
            return 67813396;
        }
    }

    static class Germany implements Country {

        @Override
        public String getContinent() {
            return "europe";
        }

        @Override
        public int getPopulation() {
            return 83129285;
        }
    }

    @Test
    void testEmptyList_shouldReturn0() {
        int population = new CountryUtils().getPopulation(Collections.emptyList(), "");
        assertEquals(0, population);
    }

    @Test
    void testEuropeContinent() {
        int population = new CountryUtils().getPopulation(List.of(new France(), new Germany()), "europe");
        assertEquals(150942681, population);
    }
}