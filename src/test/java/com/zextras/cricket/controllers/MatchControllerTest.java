package com.zextras.cricket.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class MatchControllerTest {
  @Autowired
  private MockMvc mockMvc;

//  @Test
//  void should_get_empty_array_when_no_active_matches() throws Exception {
//    this.mockMvc
//        .perform(get("/matches"))
//        .andExpect(status().isOk())
//        .andExpect(content().json("[]"));
//  }

  @Test
  void should_get_match_when_there_is_active_match() throws Exception {
    this.mockMvc
        .perform(get("/matches"))
        .andExpect(status().isOk())
        .andExpect(content().json("[{\"matchId\":\"0000-0000-0000-0000\",\"homeTeam\":{\"name\":\"AUS\",\"totalScore\":0},\"guestTeam\":{\"name\":\"PAK\",\"totalScore\":0}}]"));
  }
}