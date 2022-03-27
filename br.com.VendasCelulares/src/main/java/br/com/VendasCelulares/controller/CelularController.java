package br.com.VendasCelulares.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.VendasCelulares.model.Celular;
import br.com.VendasCelulares.repository.CelularRepository;

@Controller
@RequestMapping(value = "/celular")
public class CelularController {

	@Autowired
	private CelularRepository repository;

	@RequestMapping("/")
	public ModelAndView abrirIndex() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@GetMapping
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("celular/cadastrar");
		return modelAndView;
	}

	@PostMapping
	public ModelAndView salvar(Celular celular) {
		Celular newCelular = repository.save(celular);
		ModelAndView modelAndView = new ModelAndView("celular/cadastrar");
		modelAndView.addObject(newCelular);
		return modelAndView;
	}

	@PostMapping(value = "/delete/{id}")
	public String deletar(@PathVariable Integer id) {
		repository.deleteById(id);
		return "redirect:/celular";
	}
	
	
	/*@GetMapping(value = "/editar/{id}")
	public ModelAndView editar(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("celular/editar");
		Optional<Celular> celular = repository.findById(id);
		return modelAndView;
	}
	
	
	@PostMapping(value = "/editar")
	public String editarSave(Celular celular) {
		repository.save(celular);
		return "redirect: /celular/cadastrar";
	}*/

	@GetMapping(value = "/listar")
	public ModelAndView listaCelulares() {
		ModelAndView modelAndView = new ModelAndView("celular/listar");
		List<Celular> celulares = (List<Celular>) repository.findAll(); 
		modelAndView.addObject("celulares", celulares);
		return modelAndView;
	}

}

