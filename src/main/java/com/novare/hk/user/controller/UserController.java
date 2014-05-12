package com.novare.hk.user.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.novare.hk.user.domain.User;
import com.novare.hk.user.dto.UserDto;
import com.novare.hk.user.repository.UserRepository;
import com.novare.hk.user.service.UserService;
import com.novare.hk.user.util.UserMapper;



@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository repository;
	@Autowired
	private UserService service;
	
	
	@RequestMapping
	public String getUserPage(ModelMap model){
		Pageable pageRequest = new PageRequest(0, 10);
		Page<User> users = repository.findAll(pageRequest);
		model.addAttribute("users", UserMapper.map(users));
		model.addAttribute("usercommand", new UserDto());
		model.addAttribute("usertype", "new");
		return "users";
	}
	
	@RequestMapping(value="/get", produces="application/json")
	public @ResponseBody UserDto get(@RequestBody UserDto user){
		return UserMapper.map(repository.findByUsername(user.getUsername()));
	}
	
	@RequestMapping(value="/create", produces="application/json", method=RequestMethod.POST)
	public String create(@ModelAttribute User dto, BindingResult result){
		if(dto.getUserId() != null){
			User existingDto = new User(dto.getUserId(),dto.getFirstName(), dto.getLastName(), dto.getMiddleName(), dto.getEmail(), 
											dto.getUsername(), dto.getPassword(), dto.getPositionId(), dto.getSupervisorId(),
											dto.getDateHired(), dto.getRole(), dto.getSssId(), dto.getPagibigId(), dto.getHealthcardId(),
											dto.getTinId(), dto.getIsUserAccessDenied());
			service.update(existingDto);
		} else {
			User newUser = new User(dto.getUserId(), dto.getFirstName(), dto.getLastName(), dto.getMiddleName(), dto.getEmail(), 
					dto.getUsername(), dto.getPassword(), dto.getPositionId(), dto.getSupervisorId(),
					dto.getDateHired(), dto.getRole(), dto.getSssId(), dto.getPagibigId(), dto.getHealthcardId(),
					dto.getTinId(), dto.getIsUserAccessDenied());
			service.create(newUser);
		}
		return "redirect:/users";
	}
	@RequestMapping(value="/edit")
	public String edit(Long userId, ModelMap model){
		Pageable pageRequest = new PageRequest(0, 10);
		Page<User> users = repository.findAll(pageRequest);
		model.addAttribute("users", UserMapper.map(users));
		model.addAttribute("usercommand", UserMapper.map(repository.findOne(userId)));
		model.addAttribute("usertype", "update");
		return "users";
	}
	
	@RequestMapping(value="/delete")
	public String delete(Long userId){
		User existing = new User();
		existing.setUserId(userId);
		service.delete(existing);
		return "redirect:/users";
	}
}


