package idat.com.Dto;

public class ProfesorDTORequest {

	private Integer IdProfesorDTO;
	private String profesorDTO;
	public Integer getIdProfesorDTO() {
		return IdProfesorDTO;
	}
	public void setIdProfesorDTO(Integer idProfesorDTO) {
		IdProfesorDTO = idProfesorDTO;
	}
	public String getProfesorDTO() {
		return profesorDTO;
	}
	public void setProfesorDTO(String profesorDTO) {
		this.profesorDTO = profesorDTO;
	}
	
	public ProfesorDTORequest(Integer idProfesorDTO, String profesorDTO) {
		IdProfesorDTO = idProfesorDTO;
		this.profesorDTO = profesorDTO;
	}
	
	
	
}
