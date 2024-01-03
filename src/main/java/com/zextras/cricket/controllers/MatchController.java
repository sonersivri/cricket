package com.zextras.cricket.controllers;

import com.zextras.cricket.model.Match;
import com.zextras.cricket.service.MatchService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matches")
public class MatchController {
  private final MatchService matchService;

  public MatchController(final MatchService matchService) {
    this.matchService = matchService;
  }

  @GetMapping("")
  public List<Match> getActiveMatches() {
    return matchService.getMatches();}
}
