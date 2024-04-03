package com.example.jediscache;

import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@SpringBootApplication
@RequiredArgsConstructor
public class JediscacheApplication implements ApplicationRunner {

	private final UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JediscacheApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		userRepository.save(User.builder().name("jh1").email("wogns8010@naver.com").build());
		userRepository.save(User.builder().name("jh2").email("wogns8020@naver.com").build());
		userRepository.save(User.builder().name("jh3").email("wogns8030@naver.com").build());
		userRepository.save(User.builder().name("jh4").email("wogns8040@naver.com").build());

	}
}
