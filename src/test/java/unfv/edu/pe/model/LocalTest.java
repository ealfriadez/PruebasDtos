package unfv.edu.pe.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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
	
	@DisplayName("Test para consultar los locales")
	@Test
	void test() {
		
		List<Local> locales = localRepository.findByFloor("Second floor");
		
		assertEquals("Second floor", locales.get(0));
			
	}
	
	

}
