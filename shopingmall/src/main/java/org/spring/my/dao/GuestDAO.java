package org.spring.my.dao;

import org.spring.my.dto.Guest;

public interface GuestDAO {
	public Guest selectOne(String userid);
}
