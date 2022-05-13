package idat.com.Servicio;

import java.util.List;

import idat.com.Dto.ProfesorDTORequest;
import idat.com.Dto.ProfesorDTOResponse;

public interface ProfesorServicio {

	
	public void guardarprofesor(ProfesorDTORequest profesor);
	public void editarprofesor(ProfesorDTORequest profesor);
	public void eliminarprofesor(Integer id);
	public List<ProfesorDTOResponse> listarProfesor();
	public ProfesorDTOResponse obtenerProfesorId(Integer id);
}
