package scjp.voertuig;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

public class VoertuigTest {

	private final String AUTO_NAAM = "Audi";
	private final String BOOT_NAAM = "Valkje";
	private final String AMFIBIE_NAAM = "Hover";
	private final int AUTO_SNELHEID = 120;
	private final int BOOT_SNELHEID = 24;

	private Auto auto;
	private Boot boot;
	private Amfibie amfibie;

	@Before
	public void init() {
		auto = VoertuigFabriek.createAuto(AUTO_NAAM);
		boot = VoertuigFabriek.createBoot(BOOT_NAAM);
		amfibie = VoertuigFabriek.createAmfibie(AMFIBIE_NAAM);
	}

	@Test
	public void testAuto() {
		assertEquals("Naam van Auto incorrect", AUTO_NAAM, auto.getNaam());
		auto.rij();
		auto.setSnelheid(AUTO_SNELHEID);
		assertEquals("Snelheid van Auto incorrect", AUTO_SNELHEID, auto.getSnelheid());
	}

	@Test
	public void testBoot() {
		assertEquals("Naam van Boot incorrect", BOOT_NAAM, boot.getNaam());
		boot.vaar();
		boot.setSnelheid(BOOT_SNELHEID);
		assertEquals("Snelheid van Boot incorrect", BOOT_SNELHEID, boot.getSnelheid());
	}

	@Test
	public void testAmfibie() {
		assertEquals("Naam van Amfibie incorrect", AMFIBIE_NAAM, amfibie.getNaam());
		amfibie.rij();
		amfibie.setSnelheid(AUTO_SNELHEID);
		amfibie.vaar();
		amfibie.setSnelheid(BOOT_SNELHEID);
		assertEquals("Snelheid van Amfibie incorrect", BOOT_SNELHEID, amfibie.getSnelheid());
	}

	@Test
	public void bootIsVoertuig() {
		Voertuig v = (Voertuig) boot;
		v.getNaam();
	}

	@Test
	public void autoIsVoertuig() {
		Voertuig v = (Voertuig) auto;
		v.getNaam();
	}

	@Test
	public void amfibieIsVoertuig() {
		Voertuig v = (Voertuig) amfibie;
		v.getNaam();
	}

	@Test
	public void amfibieIsAuto() {
		try {
			Auto a = (Auto) amfibie;
			a.rij();
		} catch (ClassCastException e) {
			fail("Een amfibie zou het zelfde gedrag moeten hebben als een auto");
		}
	}

	@Test
	public void amfibieIsBoot() {
		try {
			Boot b = (Boot) amfibie;
			b.vaar();
		} catch (ClassCastException e) {
			fail("Een amfibie zou het zelfde gedrag moeten hebben als een auto");
		}
	}

	@Test
	public void autoKanNietVaren() {
		for (Method methodInInterface : auto.getClass().getMethods()) {
			if (methodInInterface.getName().equals("vaar"))
				fail("Methode 'vaar' niet verwacht in auto.");
		}
	}

	@Test
	public void bootKanNietRijden() {
		for (Method methodInInterface : boot.getClass().getMethods()) {
			if (methodInInterface.getName().equals("rij"))
				fail("Methode 'rij' niet verwacht in boot.");
		}
	}
	
	@Test
	public void eenDefinitieVoorGetNaam() {
		eenDefinitie("getNaam");
	}
	
	@Test 
	public void eenDefinitieVoorGetSnelheid() {
		eenDefinitie("getSnelheid");
	}
	
	@Test
	public void printSpeeds() {
		System.out.println("----");
		auto.setSnelheid(130);
		auto.rij();
		
		boot.setSnelheid(18);
		boot.vaar();
		
		amfibie.setSnelheid(500); // too large
		amfibie.rij(); // max 150
		amfibie.vaar(); // max 30
		
		System.out.println("Amfibie speed: "+amfibie.getSnelheid());
		System.out.println("----");
	}
	
	public void eenDefinitie(String methodeNaam) {
		Class<?> declaring = null;
		try {
			declaring = auto.getClass().getMethod(methodeNaam, new Class[]{}).getDeclaringClass();
		} catch (NoSuchMethodException e) {
			fail("Methode '"+methodeNaam+"' verwacht in Auto");			
		}
		
		try {
			Class<?> declaringBoot = boot.getClass().getMethod(methodeNaam, new Class[]{}).getDeclaringClass();
			assertEquals("Methode '"+methodeNaam+"' zou voor Boot en Auto in dezelfde class gedefinieerd moeten zijn", declaring, declaringBoot);
		} catch (NoSuchMethodException e) {
			fail("Methode '"+methodeNaam+"' verwacht in Boot");			
		}
		
		try {
			Class<?> declaringamfibie = amfibie.getClass().getMethod(methodeNaam, new Class[]{}).getDeclaringClass();
			assertEquals("Methode '"+methodeNaam+"' zou voor Amfibie en Auto in dezelfde class gedefinieerd moeten zijn", declaring, declaringamfibie);
		} catch (NoSuchMethodException e) {
			fail("Methode '"+methodeNaam+"' verwacht in Amfibie");			
		}
	}

}
