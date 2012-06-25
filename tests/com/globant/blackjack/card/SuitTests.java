package com.globant.blackjack.card;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class SuitTests {

	private Suit[] suits;

	@Before
	public void basicSetup() {
		suits = Suit.values();
	}
	
	@Test
	public void testSuitCreation() {
		final int NUMBER_OF_SUITS = 4;
		assertEquals(suits.length, NUMBER_OF_SUITS, suits.length);
	}

	@Test
	public void testSuitStringRepresentation() {
		Set<String> representation = 
				new HashSet<String>(Arrays.asList("H", "D", "C", "S"));
		List<String> actualRepresentation = 
				new ArrayList<String>(suits.length);
		for (Suit suit : suits) {
			actualRepresentation.add(suit.toString());
		}
		assertTrue(String.format("Representations were: %s, %s, %s, %s",
				suits[0], suits[1], suits[2], suits[3]),
				representation.containsAll(actualRepresentation));
	}

}
