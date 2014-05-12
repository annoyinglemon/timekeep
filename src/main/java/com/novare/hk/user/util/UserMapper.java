package com.novare.hk.user.util;
import java.util.ArrayList;
import java.util.List;

import com.novare.hk.user.domain.User;
import com.novare.hk.user.dto.UserDto;
import org.springframework.data.domain.Page;


public class UserMapper {

	public static UserDto map(User user) {
		UserDto userdto = new UserDto();
		userdto.setUserId(user.getUserId());
		userdto.setFirstName(user.getFirstName());
		userdto.setLastName(user.getLastName());
		userdto.setMiddleName(user.getMiddleName());
		userdto.setEmail(user.getEmail());
		userdto.setUsername(user.getUsername());
		userdto.setPassword(user.getPassword());
		userdto.setPositionId(user.getPositionId());
		userdto.setSupervisorId(user.getSupervisorId());
		userdto.setDateHired(user.getDateHired());
		userdto.setRole(user.getRole());
		userdto.setSssId(user.getSssId());
		userdto.setPagibigId(user.getPagibigId());
		userdto.setHealthcardId(user.getHealthcardId());
		userdto.setTinId(user.getTinId());
		userdto.setIsUserAccessDenied(user.getIsUserAccessDenied());
		return userdto;
}

public static List<UserDto> map(Page<User> users) {
	List<UserDto> dtos = new ArrayList<UserDto>();
	for (User user: users) {
		dtos.add(map(user));
	}
	return dtos;
  	}
	
}
