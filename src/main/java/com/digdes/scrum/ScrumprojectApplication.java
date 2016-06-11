package com.digdes.scrum;

import com.digdes.scrum.dao.UserDao;
import com.digdes.scrum.model.enums.BusyStatus;
import com.digdes.scrum.model.enums.Role;
import com.digdes.scrum.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.digdes.scrum.model"})
@EnableJpaRepositories(basePackages = { "com.digdes.scrum.dao"})
public class ScrumprojectApplication implements CommandLineRunner {
	@Autowired
    UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(ScrumprojectApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("hello");
        User user = new User();
        user.setName("Artem");
        user.setLastName("Kopytok");
        user.setRoles(Role.PRODUCTOWNER);
        user.setStatus(BusyStatus.ACTIVE);
        userDao.save(user);

        userDao.findByName("world").forEach(x->{
            System.out.println(x.getId());
        });
    }

}
