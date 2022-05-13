package idat.com.Dto;

public class CursoDTORequest {

	private Integer IdCursoDTO;
	private String cursoDTO;
	private String descripcionDTO;
	private Integer IdMallaDTO;
	
	public Integer getIdMallaDTO() {
		return IdMallaDTO;
	}
	public void setIdMallaDTO(Integer idMallaDTO) {
		IdMallaDTO = idMallaDTO;
	}
	public Integer getIdCursoDTO() {
		return IdCursoDTO;
	}
	public void setIdCursoDTO(Integer idCursoDTO) {
		IdCursoDTO = idCursoDTO;
	}
	public String getCursoDTO() {
		return cursoDTO;
	}
	public void setCursoDTO(String cursoDTO) {
		this.cursoDTO = cursoDTO;
	}
	public String getDescripcionDTO() {
		return descripcionDTO;
	}
	public void setDescripcionDTO(String descripcionDTO) {
		this.descripcionDTO = descripcionDTO;
	}
	
}
