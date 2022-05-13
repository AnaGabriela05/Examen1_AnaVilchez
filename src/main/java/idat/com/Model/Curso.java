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
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name="curso")
@Entity
public class Curso {
	@Id
	@Column(name = "id_curso")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdCurso;
	private String curso;
	private String descripcion;
	
	
	@OneToMany(mappedBy = "curso")
	private List<Profesor> profesor = new ArrayList<Profesor>();
	
	
	@JoinColumn(name="id_malla", nullable = false,unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_malla) references malla(id_malla)"))
	@ManyToOne
	private Malla malla;
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	
	public Curso(Integer idCurso, String curso, String descripcion) {
		IdCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
	}

	public Integer getIdCurso() {
		return IdCurso;
	}
	public void setIdCurso(Integer idCurso) {
		IdCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
