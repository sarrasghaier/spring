package com.DPC.spring;

import com.DPC.spring.entities.ERole;
import com.DPC.spring.entities.Role;
import com.DPC.spring.entities.User;
import com.DPC.spring.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableSwagger2

public class Application   extends SpringBootServletInitializer /*implements ApplicationRunner */{

	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;

	@Autowired
	UserDetailsRepository userDetailsRepository;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

//
//
//	public BCryptPasswordEncoder passwordEncoder() {
//		BCryptPasswordEncoder passwordEncoderBean = applicationContext.getBean(BCryptPasswordEncoder.class);
//		return passwordEncoderBean;
//	}
//
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//
////		// Save roles
//		Role superAdminRole = this.roleRepository.save(new Role(ERole.ADHERENT));
//		Role adminRole = this.roleRepository.save(new Role(ERole.ADMIN));
//
//
//		// Save users
//		User user1 = new User("marwen", "sghair",
//				"marwen@dipower.fr",
//			this.passwordEncoder().encode("12345"));
//
//
//
//		// ManyToMany Relations
//		Set<Role> roles = new HashSet<>();
//		roles.add(superAdminRole);
//		roles.add(adminRole);
//
//		user1.setRoles(roles);
//		this.userRepository.save(user1);
//
//
//	}
	}

