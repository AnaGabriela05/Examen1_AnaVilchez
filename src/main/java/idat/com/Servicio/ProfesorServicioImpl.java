package idat.com.Servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import idat.com.Repositorio.ProfesorRepositorio;
import idat.com.Dto.ProfesorDTORequest;
import idat.com.Dto.ProfesorDTOResponse;
import idat.com.Model.Profesor;

@Service
public class ProfesorServicioImpl implements ProfesorServicio {

	@Autowired
	public ProfesorRepositorio repositorio;
	

	@Override
	public void guardarprofesor(ProfesorDTORequest profesor) {
		Profesor p = new Profesor();
		p.setProfesor(profesor.getProfesorDTO());
		p.setIdProfesor(profesor.getIdProfesorDTO());
		repositorio.save(p);
	}

	@Override
	public void editarprofesor(ProfesorDTORequest profesor) {
		Profesor p = new Profesor();
		p.setProfesor(profesor.getProfesorDTO());
		p.setIdProfesor(profesor.getIdProfesorDTO());
		repositorio.saveAndFlush(p);
	}

	@Override
	public void eliminarprofesor(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<ProfesorDTOResponse> listarProfesor() {
		
		List<ProfesorDTOResponse> lista = new ArrayList<ProfesorDTOResponse>();
		ProfesorDTOResponse p = null; 
		

		for (Profesor Profesor :repositorio.findAll()) {
			p = new ProfesorDTOResponse();
			
			p.setProfesorDTO(Profesor.getProfesor());
			p.setIdProfesorDTO(Profesor.getIdProfesor());
			lista.add(p);
		}
		return lista;
	}

	@Override
	public ProfesorDTOResponse obtenerProfesorId(Integer id) {
		
		Profesor Profesor = repositorio.findById(id).orElse(null);
		ProfesorDTOResponse p = new ProfesorDTOResponse();
		p.setProfesorDTO(Profesor.getProfesor());
		p.setIdProfesorDTO(Profesor.getIdProfesor());
		return p;
	}

}
