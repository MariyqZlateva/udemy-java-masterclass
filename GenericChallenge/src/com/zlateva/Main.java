package com.zlateva;

public class Main {
    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantile");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");

        footballLeague.addTeamToLeagueTable(adelaideCrows);
        footballLeague.addTeamToLeagueTable(melbourne);
        footballLeague.addTeamToLeagueTable(fremantle);
        footballLeague.addTeamToLeagueTable(hawthorn);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        footballLeague.showLeagueTable();
    }
}