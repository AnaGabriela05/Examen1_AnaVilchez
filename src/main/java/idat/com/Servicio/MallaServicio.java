package idat.com.Servicio;

import java.util.List;

import idat.com.Dto.MallaDTORequest;
import idat.com.Dto.MallaDTOResponse;

public interface MallaServicio {

	
	public void guardarMalla(MallaDTORequest malla);
	public void editarMalla(MallaDTORequest malla);
	public void eliminarMalla(Integer id);
	public List<MallaDTOResponse> listarMalla();
	public MallaDTOResponse obtenerMallaId(Integer id);
}
