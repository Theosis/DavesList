package com.jdpaley;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoomController { 
	
	@Autowired
	RoomRepository roomRepository;
	
	@GetMapping(path="/")
	public String list(@ModelAttribute("room") Room room, Model m) {
		
//		Room room = new Room();
//		m.addAttribute("room", room);
		
		Iterable<Room> rooms = roomRepository.findAll();
		String rooms_str = rooms.toString();
		m.addAttribute("list", rooms_str);
		
		return "index";

	}

	@PostMapping(path="/add")
	public String add(@ModelAttribute("room") Room room, Model m) {
		

		roomRepository.save(room);
		return "index";

	}
	
	@GetMapping(path="/admin")
	public String adminPage(Model m) {


		return "admin";
		
	}

}
