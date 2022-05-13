package idat.com.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.com.Model.Malla;

@Repository
public interface MallaRepositorio extends JpaRepository<Malla, Integer>{

}
