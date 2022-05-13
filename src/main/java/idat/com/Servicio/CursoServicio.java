package idat.com.Servicio;

import java.util.List;

import idat.com.Dto.CursoDTORequest;
import idat.com.Dto.CursoDTOResponse;

public interface CursoServicio {

	
	public void guardarCurso(CursoDTORequest curso);
	public void editarCurso(CursoDTORequest curso);
	public void eliminarCurso(Integer id);
	public List<CursoDTOResponse> listarCurso();
	public CursoDTOResponse obtenerCursoId(Integer id);
}
