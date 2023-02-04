package in.ag.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import in.ag.service.DataCollectionService;

@RestController
public class DCRestController {
	
	@Autowired
	private DataCollectionService service;
	
	@GetMapping("/search")
	public ResponseEntity<String> searchApp(@PathVariable Integer appId){
		
		String response = service.createCase(appId);
		return new ResponseEntity<>(response, HttpStatus.OK);

}
}
