package com.zextras.cricket.service;

import com.zextras.cricket.model.Match;
import com.zextras.cricket.model.Team;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
  private final List<Match> matches = new ArrayList<>();
  public static final String MATCH_ID = "0000-0000-0000-0000";
  public static final String DEFAULT_HOME_TEAM = "AUS";
  public static final String DEFAULT_GUEST_TEAM = "PAK";

  public MatchService() {
    matches.add(new Match(MATCH_ID, new Team(DEFAULT_HOME_TEAM), new Team(DEFAULT_GUEST_TEAM)));
  }

  public List<Match> getMatches() {
    return matches;
  }
}
