package idat.com.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.com.Model.Curso;

@Repository
public interface CursoRepositorio extends JpaRepository<Curso, Integer>{

}
