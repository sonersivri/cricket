package com.zextras.cricket.services;

import com.zextras.cricket.service.MatchService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatchServiceTest {

  @Test
  void should_return_list_of_one_match_when_there_is_one_match() {
    MatchService matchService = new MatchService();
    Assertions.assertEquals(1, matchService.getMatches().size());
  }
}
