package unfv.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unfv.edu.pe.model.Local;
import unfv.edu.pe.projection.interfacebased.open.LocalOpenView;
import unfv.edu.pe.repository.LocalRepository;

@Service
public class LocalServiceImpl implements LocalService{

	@Autowired
	LocalRepository localRepository;
	
	@Override
	public List<Local> findAll() {		
		return localRepository.findAll();
	}

	@Override
	public List<LocalOpenView> findBy() {		
		return localRepository.findBy();
	}

}
