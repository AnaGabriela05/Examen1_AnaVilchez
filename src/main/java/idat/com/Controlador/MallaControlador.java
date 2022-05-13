package idat.com.Controlador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import idat.com.Dto.MallaDTORequest;
import idat.com.Dto.MallaDTOResponse;
import idat.com.Servicio.MallaServicio;

@RestController
@RequestMapping("/Malla")
public class MallaControlador {
	
	@Autowired
	private MallaServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<MallaDTOResponse>> listarMalla(){
		
		return new ResponseEntity<List<MallaDTOResponse>>(servicio.listarMalla(), HttpStatus.CREATED);  
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody MallaDTORequest malla){
		servicio.guardarMalla(malla);
		return  new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(path = "/listar/{id}" , method = RequestMethod.GET)
	public ResponseEntity<MallaDTOResponse> listarPorId(@PathVariable Integer id) {
		
		MallaDTOResponse m = servicio.obtenerMallaId(id);
		if(m != null)
			return new ResponseEntity<MallaDTOResponse>(m, HttpStatus.OK);
		
		return new ResponseEntity<MallaDTOResponse>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody MallaDTORequest malla){
		
		MallaDTOResponse m = servicio.obtenerMallaId(malla.getIdMallaDTO());

		if(m != null) {
			servicio.editarMalla(malla);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		MallaDTOResponse m = servicio.obtenerMallaId(id);
		if(m != null) {
			servicio.eliminarMalla(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

	}
	
}
