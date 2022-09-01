package com.hnt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.hnt.AdminRepository;
import com.hnt.entity.Admin;

@ExtendWith(MockitoExtension.class)
public class AdminServiceTest {
	
	@InjectMocks
	AdminService adminService;
	
	@Mock
	AdminRepository adminRepository;
	
	@Test
	void testSaveAdmin(){
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setName("Priyanka");
		admin.setPassword("Priyanka@123");
		
		when(adminRepository.save(admin)).thenReturn(admin);//mock
		
		adminService.save(admin);
		
		assertEquals(1, admin.getAdminId());
	}
	
//	@Test
//	void testSaveAdminForException(){
//		assertThrows(IllegalArgumentException.class, ()->{
//			Admin admin = new Admin();
//			admin.setPassword("");
//			adminService.save(admin);
//			
//		});
//	}
}
