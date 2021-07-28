package org.generation.blogPessoal.Controller;

import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/Postagens")
@CrossOrigin( "*" )
public class PostagemController {
	
	@Autowired
   private PostagemRepository repository;
	
	






}

