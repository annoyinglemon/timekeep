package com.novare.hk.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.novare.hk.user.domain.User;
import com.novare.hk.user.repository.UserRepository;


@Service
@Transactional
public class UserService {

		@Autowired
		private UserRepository repository;
		
		public Boolean create(User user){
			User existing = repository.findByUsername(user.getUsername());
			if (existing != null)
				return false;
			
			User saved = repository.save(user);
			if (saved == null)
				return false;
			return true;
		}
		
		public Boolean update(User user) {
			User existing = repository.findByUsername(user.getUsername());
			if (existing == null) 
				return false;
		
			existing.setFirstName(user.getFirstName());
			existing.setLastName(user.getLastName());
			existing.setMiddleName(user.getMiddleName());
			existing.setEmail(user.getEmail());
			existing.setUsername(user.getUsername());
			existing.setPassword(user.getPassword());
			existing.setPositionId(user.getPositionId());
			existing.setSupervisorId(user.getSupervisorId());
			existing.setDateHired(user.getDateHired());
			existing.setRole(user.getRole());
			existing.setSssId(user.getSssId());
			existing.setPagibigId(user.getPagibigId());
			existing.setHealthcardId(user.getHealthcardId());
			existing.setTinId(user.getTinId());
			existing.setIsUserAccessDenied(user.getIsUserAccessDenied());
			
			User saved = repository.save(existing);
			if(saved == null) 
				return false;
			return true;
			
		}
		public Boolean delete(User user) {
			User existing = repository.findOne(user.getUserId());
			if (existing == null) 
				return false;
			
			repository.delete(existing);
			User deletedUser = repository.findOne(user.getUserId());
			if (deletedUser != null) 
				return false;
			
			return true;
		}
}
