package br.com.skyview.solicitacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.skyview.solicitacao.component.SolicitacaoComponent;
import br.com.skyview.solicitacao.to.DroneRequest;

@RestController
public class SolicitacaoController {

	@Autowired
	private SolicitacaoComponent component;
	
	//http://localhost:8080/solicitacao?latitudeOrigem={}&longitudeOrigem={}&latitudeDestino={}&longitudeDestino={}
	@GetMapping("/solicitacao")
	public String teste(@RequestParam(value="latitudeOrigem") Double latitudeOrigem, @RequestParam(value="longitudeOrigem") Double longitudeOrigem,
							@RequestParam(value="latitudeDestino") Double latitudeDestino, @RequestParam(value="longitudeDestino") Double longitudeDestino) {
		
		DroneRequest request = new DroneRequest();
		
		request.setLatitudeOrigem(latitudeOrigem);
		request.setLongitudeOrigem(longitudeOrigem);
		
		request.setLatitudeDestino(latitudeDestino);
		request.setLongitudeDestino(longitudeDestino);
		
		return component.solicitarDrone(request);
	}
	
}
