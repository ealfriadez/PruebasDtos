package unfv.edu.pe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import unfv.edu.pe.repository.LocalRepository;

//@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class LocalTest {
	
	@Autowired
	private LocalRepository localRepository;
	
	@DisplayName("Test para consultar por el nombre del piso")
	@Test
	void test() {
		
		Optional<Local> local = localRepository.findByFloor("Pet Shop");
				
		assertEquals(3000.95, local.get().getDmc());
		assertTrue(local.get().getName().equals("fifth floor"));
			
	}
	
	@DisplayName("Test para consultar el campo 'dmc'")
	@Test
	void testDMC() {		
		
		Optional<Local> local = localRepository.findByFloor("Pet Shop");		
		assertEquals(3000.95, local.get().getDmc());
		assertFalse(local.get().getDmc()<0);
	}
	
	@DisplayName("Test para comparar 'dmc'")
	@Test
	void testCompareDMC() {		
		
		Optional<Local> local = localRepository.findByFloor("Pet Shop");
		Optional<Local> local1 = localRepository.findByFloor("Pet Shop");
		
		assertEquals(local.get(), local1.get());
	}

	@DisplayName("Test para debito cuenta")
	@Test
	void testCompareDMC1() {		
		
		Optional<Local> local = localRepository.findByFloor("Pet Shop");
		Optional<Local> local1 = localRepository.findByFloor("Pet Shop");
		
		assertEquals(local.get(), local1.get());
	}
}
