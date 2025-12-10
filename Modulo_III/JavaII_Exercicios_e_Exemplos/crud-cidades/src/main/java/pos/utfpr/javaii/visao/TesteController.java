package pos.utfpr.javaii.visao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {

	@GetMapping()
	public ResponseEntity<Object> makingTest() {
		try {
			return new ResponseEntity<>("Teste realizado com sucesso", HttpStatus.OK);
		} catch (Exception e) {
			throw e;
		}
	}

}
