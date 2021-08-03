package org.spring.my.service;

import org.spring.my.dao.GuestDAO;
import org.spring.my.dto.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestServiceImfo implements GuestService{
	
	@Autowired
	private GuestDAO guestDAO;
	
	@Override
	public Guest selectOne(String userid) {
		return guestDAO.selectOne(userid);
	}

}
