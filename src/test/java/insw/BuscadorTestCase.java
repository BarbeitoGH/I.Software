package insw;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class BuscadorTestCase {
	Buscador buscador;

	@BeforeEach
	void setup() {
		buscador = new Buscador();
	}
	
	@Test
	@DisplayName("search should work")
	void TestBuscarPalabra() {
		String nombre = "Alejandro";
		List<String> lista1 = Arrays.asList("Ventos","Agustin", nombre);
		boolean resultado = buscador.buscarPalabra(nombre, lista1);
		assertTrue(resultado,"search should work");
	
	}
	
	@Test
	@DisplayName("Devolution should work")
	void TestDevolverPalabra() {
		String piedra = "piedra";
		List<String>lista2 = Arrays.asList("Jorge","manzana","piedra");
		assertEquals(piedra,buscador.devolverPalabra(lista2, 2),"It should find the word");
	}
	
	@Test
	@DisplayName("Devolution should work")
	void TestDevolverPrimerElemento() {
		List<String>lista3 = Arrays.asList("Jorge","manzana","piedra");
		assertEquals("Jorge",buscador.devolverPrimerElemento(lista3),"It should give the first element");
	}
	
	
	@Test
	@DisplayName("Devolution should work")
	void TestDevolverUltimoElemento() {
		List<String>lista4 = Arrays.asList("Jorge","manzana","piedra","caracol");
		assertEquals("caracol",buscador.devolverUltimoElemento(lista4),"It should gives the last element");
	}

	
	@Test
	@DisplayName("Search shoul work")
	
	void TestBuscarFrase() {
		String frase = "Hola me llamo juan";
		List<String>lista5 = Arrays.asList("Hola me llamo julia",frase,"Me duele la tripa","fiesta neno");
		boolean resultado = buscador.buscarFrase(frase, lista5);
		assertTrue(resultado,"Search should be succesful");
	}
}
