package idat.com.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.com.Model.Universidad;

@Repository
public interface UniversidadRepositorio extends JpaRepository<Universidad, Integer>{

}
