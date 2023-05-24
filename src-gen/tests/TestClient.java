package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import DiagramaClaseIsp.Abonament;
import DiagramaClaseIsp.AntrenamentInstructor;
import DiagramaClaseIsp.Client;
import DiagramaClaseIsp.MainProject;
import DiagramaClaseIsp.ModalitatePlata;
import DiagramaClaseIsp.Sala;

class TestClient {

	@Test
	void testGenerareAbonament() {
		Sala s1 = new Sala("ESX","Splaiul Independentei");
		AntrenamentInstructor ant1 = new AntrenamentInstructor("Bogdan",5);
		Abonament a1 = new Abonament(35, "AbonamentPremium", s1, null, ant1);
		Abonament a2 = new Abonament(5, "AbonamentBasic", s1, null,null);
		MainProject.abonamente.add(a1);
		
		Client c1 = new Client("25.01.2003", "asd@a.com", "501235", "Ionita", "Ionut",30);
		
		assertTrue(c1.introducereMetodaPlata("CASH"));
		assertTrue(c1.modalitatePlata == ModalitatePlata.CASH);
		
		assertFalse(c1.introducereMetodaPlata("asd"));
		assertTrue(c1.modalitatePlata == ModalitatePlata.CASH);
		
		assertTrue(c1.adaugareAbonament("AbonamentBasic"));
		assertFalse(c1.adaugareAbonament("AbonamentPremium"));
		
	}

}
