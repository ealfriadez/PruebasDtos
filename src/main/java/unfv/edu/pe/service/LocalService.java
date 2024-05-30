package unfv.edu.pe.service;

import java.util.List;

import unfv.edu.pe.model.Local;
import unfv.edu.pe.projection.interfacebased.open.LocalOpenView;

public interface LocalService {

	List<Local> findAll();
	List<LocalOpenView> findBy();
	List<Local> findByFloor(String floor);
}
