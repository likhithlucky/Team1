package com.abc.healthcenter.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.healthcenter.entity.AdminEntity;

/**
 * 
 * @author venkatesh
 *
 *Date : 06-Jul-2021
 */

public interface AdminRepository extends JpaRepository<AdminEntity , Integer> {
	
	public Optional<AdminEntity> findByAdminUserName(String AdminUserName);
	
	public boolean existsByAdminUserName(String AdminUserName);
	

}
