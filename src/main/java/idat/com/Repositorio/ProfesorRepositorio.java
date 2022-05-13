package idat.com.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.com.Model.Profesor;


@Repository
public interface ProfesorRepositorio extends JpaRepository< Profesor, Integer>{


}
