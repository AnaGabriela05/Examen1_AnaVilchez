package idat.com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name="universidad")
@Entity
public class Universidad {

	@Id
	@Column(name = "id_universidad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdUniversidad;
	
	private String Universidad;
	
	@OneToOne(mappedBy = "universidad")
	private Malla malla;
	
	public Universidad() {
		// TODO Auto-generated constructor stub
	}
	public Universidad(Integer idUniversidad, String universidad) {
		IdUniversidad = idUniversidad;
		Universidad = universidad;
	}

	public Integer getIdUniversidad() {
		return IdUniversidad;
	}
	public void setIdUniversidad(Integer idUniversidad) {
		IdUniversidad = idUniversidad;
	}
	public String getUniversidad() {
		return Universidad;
	}
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}
	
}
