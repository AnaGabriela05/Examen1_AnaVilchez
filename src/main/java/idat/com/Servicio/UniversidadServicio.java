package idat.com.Servicio;

import java.util.List;

import idat.com.Dto.UniversidadDTORequest;
import idat.com.Dto.UniversidadDTOResponse;

public interface UniversidadServicio {

	
	public void guardarUniversidad(UniversidadDTORequest universidad);
	public void editarUniversidad(UniversidadDTORequest universidad);
	public void eliminarUniversidad(Integer id);
	public List<UniversidadDTOResponse> listarUniversidad();
	public UniversidadDTOResponse obtenerUniversidadId(Integer id);
}
