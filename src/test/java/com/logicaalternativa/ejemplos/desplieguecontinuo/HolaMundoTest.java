package com.logicaalternativa.ejemplos.desplieguecontinuo;

import static org.junit.Assert.*;

import org.junit.Test;

public class HolaMundoTest {

	@Test
	public final void testGetBienvenida() {
		
		HolaMundo miHolaMundo = new HolaMundo();

		assertEquals("Hola Mundo!", miHolaMundo.getBienvenida() );
	}

}
