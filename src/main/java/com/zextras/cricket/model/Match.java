package com.zextras.cricket.model;

public class Match {
  private String matchId;
  private Team homeTeam;
  private Team guestTeam;

  public Match(final String matchId, final Team homeTeam, final Team guestTeam) {
    this.matchId = matchId;
    this.homeTeam = homeTeam;
    this.guestTeam = guestTeam;
  }

  public Team getHomeTeam() {
    return homeTeam;
  }

  public void setHomeTeam(final Team homeTeam) {
    this.homeTeam = homeTeam;
  }

  public Team getGuestTeam() {
    return guestTeam;
  }

  public void setGuestTeam(final Team guestTeam) {
    this.guestTeam = guestTeam;
  }

  public String getMatchId() {
    return matchId;
  }

  public void setMatchId(final String matchId) {
    this.matchId = matchId;
  }
}
