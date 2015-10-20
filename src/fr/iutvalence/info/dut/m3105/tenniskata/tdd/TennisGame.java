package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGame
{
	int ScoreServeur;
	int ScoreAdversaire;
	
	public TennisGame() {
		this.ScoreServeur = 0;
		this.ScoreAdversaire = 0;
	}
	
	public String getScore()
	{
		
		if(this.ScoreServeur < 1 && this.ScoreAdversaire < 1) return "Love-All";
		else if(this.ScoreServeur < 2 && this.ScoreAdversaire < 1) return "Fifteen-Love";
		else if(this.ScoreServeur < 1 && this.ScoreAdversaire < 2) return "Love-Fifteen";
		else if(this.ScoreServeur < 2 && this.ScoreAdversaire < 2) return "Fifteen-All";
		else if(this.ScoreServeur < 3 && this.ScoreAdversaire < 1) return "Thirty-Love";
		return "null";
	}
	
	public void serveurMetUnPoint()
	{
		this.ScoreServeur = this.ScoreServeur+1;
	}
	
	public void adversaireMetUnPoint()
	{
		this.ScoreAdversaire = this.ScoreAdversaire+1;
	}
	
	
}