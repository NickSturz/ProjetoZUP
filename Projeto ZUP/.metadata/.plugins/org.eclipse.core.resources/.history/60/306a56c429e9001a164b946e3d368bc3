package com.socialZuppers.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.socialZuppers.model.Usuarios;
import com.usuarios.repository.UsuariosRepository;

@Controller
public class usuariosController {
	
	@Autowired
	private UsuariosRepository er;
	
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.GET)
	public String form() {
		return "usuarios/indexCreate";
	}
		
		@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.POST)
		public String form(Usuarios evento) {
			
			er.save(evento);
			
			
			return "redirect:/cadastrarUsuario";
	}
		
		@RequestMapping("/usuarios")
		public ModelAndView listaUsuarios() {
			ModelAndView mv = new ModelAndView("IndexInit");
			Iterable<Usuarios> usuarios = er.findAll();
			mv.addObject("usuarios", usuarios);
			return mv;
		}

}
