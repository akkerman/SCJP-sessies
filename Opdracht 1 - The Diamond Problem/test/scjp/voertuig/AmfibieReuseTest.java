package scjp.voertuig;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmfibieReuseTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	private final static String NAAM = "Anoniem";
	
	private Auto auto;
	private Boot boot;
	private Amfibie amfibie;
	
	@Before
	public void init() {
		auto = VoertuigFabriek.createAuto(NAAM);
		boot = VoertuigFabriek.createBoot(NAAM);
		amfibie = VoertuigFabriek.createAmfibie(NAAM);
	}

	@Before 
	public void setupStreams() {
	    System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	@Test
	public void amfibieHeeftAutoGedrag() {		
		auto.setSnelheid(400);
		auto.rij();
		
		String out = outContent.toString();
		outContent.reset();

		amfibie.setSnelheid(500);
		amfibie.rij();
		
		assertEquals(out, outContent.toString());
	}
	
	@Test
	public void amfibieHeeftBootGedrag() {		
		boot.setSnelheid(12);
		boot.vaar();
		
		String out = outContent.toString();
		outContent.reset();

		amfibie.setSnelheid(12);
		amfibie.vaar();
		
		assertEquals(out, outContent.toString());
	}
}