package com.workz.inherit;

public class cricketTester {

	public static void main(String[] args) {
		
		//Parent class 
		/*String teamName;
		String playerName;
		int jerseyNumber;
		int duration;
		String playingcountry;
		int numberOfPlayers;*/
		
		Cricket Team = new Cricket();
		
		
		Team.Rain();//From Sports class
		
		Team.bestCoach();//From Cricket Class
		
		Team.goodTeam();//From Cricket Class
		
		Team.duckwordlewisMethod();//From Sports Class
		
		
		
		Team.teamName="india";
		Team.playerName="Sachin";
		Team.jerseyNumber=10;
		Team.playingcountry="Melbourne";
		Team.numberOfPlayers=11;
		
		System.out.println(Team.teamName);
		System.out.println(Team.playerName);
		System.out.println(Team.jerseyNumber);
		System.out.println(Team.playingcountry);
		System.out.println(Team.numberOfPlayers);
		
		
		

	}

}
