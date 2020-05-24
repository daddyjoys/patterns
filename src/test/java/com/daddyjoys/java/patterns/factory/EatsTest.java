package com.daddyjoys.java.patterns.factory;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EatsTest {

    @Test
    public void testGetEats() {
        Eats eats = new Eats();
        assertEquals(eats.getEats(EatTypes.CHERRY).getClass().getSimpleName(), "Cherry");
        assertEquals(eats.getEats(EatTypes.CHOCOLATE).getClass().getSimpleName(), "Chocolate");
        assertEquals(eats.getEats(EatTypes.ALMOND).getClass().getSimpleName(), "Almond");
    }
}