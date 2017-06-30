package com.jdpaley.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdpaley.models.Room;
import com.jdpaley.repositories.RoomRepository;

@Controller
public class RoomController { 
	
	@Autowired
	RoomRepository roomRepository;
	
	@GetMapping(path="/")
	public String list(@ModelAttribute("room") Room room, Model m) {
		
//		Room room = new Room();
//		m.addAttribute("room", room);
		
		Iterable<Room> rooms = roomRepository.findAll();
		//String rooms_str = rooms.toString();
		m.addAttribute("list", rooms);
		
		return "index";

	}

	@PostMapping(path="/add")
	public String add(@ModelAttribute("room") Room room, Model m) {

		roomRepository.save(room);
		
		Iterable<Room> rooms = roomRepository.findAll();
		//String rooms_str = rooms.toString();
		m.addAttribute("list", rooms);
		
		return "index";

	}
	
	@GetMapping(path="/admin")
	public String adminPage(Model m) {


		return "admin";
		
	}
	
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
