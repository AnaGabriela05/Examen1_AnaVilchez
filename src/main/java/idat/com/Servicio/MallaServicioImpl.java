package idat.com.Servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import idat.com.Repositorio.MallaRepositorio;
import idat.com.Dto.MallaDTORequest;
import idat.com.Dto.MallaDTOResponse;
import idat.com.Model.Malla;

@Service
public class MallaServicioImpl implements MallaServicio {

	@Autowired
	public MallaRepositorio repositorio;
	

	@Override
	public void guardarMalla(MallaDTORequest malla) {
		Malla m = new Malla();
		m.setAño(malla.getAñoDTO());
		m.setIdMalla(malla.getIdMallaDTO());
		repositorio.save(m);
	}

	@Override
	public void editarMalla(MallaDTORequest malla) {
		Malla m = new Malla();
		m.setAño(malla.getAñoDTO());
		m.setIdMalla(malla.getIdMallaDTO());
		repositorio.saveAndFlush(m);
	}

	@Override
	public void eliminarMalla(Integer id) {
		repositorio.deleteById(id);
	}

	@Override
	public List<MallaDTOResponse> listarMalla() {
		
		List<MallaDTOResponse> lista = new ArrayList<MallaDTOResponse>();
		MallaDTOResponse m = null; 
		

		for (Malla malla :repositorio.findAll()) {
			m = new MallaDTOResponse();
			
			m.setAñoDTO(malla.getAño());
			m.setIdMallaDTO(malla.getIdMalla());
			lista.add(m);
		}
		return lista;
	}

	@Override
	public MallaDTOResponse obtenerMallaId(Integer id) {
		
		Malla malla = repositorio.findById(id).orElse(null);
		MallaDTOResponse m = new MallaDTOResponse();
		m.setAñoDTO(malla.getAño());
		m.setIdMallaDTO(malla.getIdMalla());
		return m;
	}

}
