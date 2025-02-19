package org.zerock.guestbookpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class GuestBookPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestBookPracticeApplication.class, args);
    }

}
