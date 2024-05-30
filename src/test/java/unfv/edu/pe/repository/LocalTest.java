package unfv.edu.pe.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import unfv.edu.pe.model.Local;

//@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class LocalTest {

	@Autowired
	private LocalRepository localRepository;	
	
	@DisplayName("Test para consultar los locales")
	@Test
	void testConsultarLocales() {
		System.out.println("Test para consultar locales");
		
		List<Local> locales = localRepository.findAll();
		
		assertTrue(locales.size() > 0, "La tabla tiene elementos");
		
		for (Local local : locales) {
			System.out.println("Locales: " + local.getName());
		}		
	}

}
