package com.example.demo.movies.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.example.demo.movies.dto.MoviesDTO;

@SpringBootTest
public class MoviesServiceTest {

	@Autowired
	MoviesService moviesService;

	@Test
	public void 빈이주입되었는지확인() {
		System.out.println("service:" + moviesService);
	}

	@Test
	public void 게시물목록조회() {
		List<MoviesDTO> result = moviesService.getList(""); 
		for(MoviesDTO dto : result) {
			System.out.println(dto);
		}
	}
	
	@Test
	public void 게시물단건조회() {
		MoviesDTO dto = moviesService.read(123l);
		System.out.println(dto);
	}
	
}
