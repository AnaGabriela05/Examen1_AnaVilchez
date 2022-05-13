package idat.com.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="profesor")
@Entity
public class Profesor {

	@Id
	@Column(name = "id_profesor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdProfesor;
	private String profesor;
	
	
	@ManyToOne
	@JoinColumn(name = "id_curso", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_curso) references curso (id_curso)"))
	private Curso curso;
	
	
	public Profesor() {
		super();
	}
	
	
	public Profesor(Integer idProfesor, String profesor) {
		IdProfesor = idProfesor;
		this.profesor = profesor;
	}

	public Integer getIdProfesor() {
		return IdProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		IdProfesor = idProfesor;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
}
