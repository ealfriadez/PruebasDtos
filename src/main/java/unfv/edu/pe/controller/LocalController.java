package unfv.edu.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unfv.edu.pe.model.Local;
import unfv.edu.pe.projection.interfacebased.open.LocalOpenView;
import unfv.edu.pe.service.LocalService;

@RestController
@RequestMapping("/api/local")
public class LocalController {

	@Autowired
	LocalService localService;
	
	@GetMapping("/findAll")
	public List<Local> findAll(){
		return localService.findAll();	
	}
	
	//Open view interface based
	@GetMapping("/findAllLocalOpenView")
	public List<LocalOpenView> findBy(){
		return localService.findBy();	
	}
}
