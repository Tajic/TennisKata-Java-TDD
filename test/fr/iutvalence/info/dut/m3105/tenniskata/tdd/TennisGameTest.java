package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import static org.junit.Assert.assertEquals;
import junit.framework.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{	
	@Test
	public void loveAllTest()
	{
		TennisGame tennisGame  = new TennisGame();
		
		// vérifier les assertions
		assertEquals(tennisGame.getScore(), "Love-All");
		
	}
	
	@Test
	public void fifteenLoveTest()
	{
		TennisGame tennisGame  = new TennisGame();
		tennisGame.serveurMetUnPoint();
		
		// vérifier les assertions
		assertEquals(tennisGame.getScore(), "Fifteen-Love");
		
	}
	
	@Test
	public void loveFifteenTest()
	{
		TennisGame tennisGame  = new TennisGame();
		tennisGame.adversaireMetUnPoint();
		
		// vérifier les assertions
		assertEquals(tennisGame.getScore(), "Love-Fifteen");
		
	}
	
	@Test
	public void fifteenAllTest()
	{
		TennisGame tennisGame  = new TennisGame();
		tennisGame.adversaireMetUnPoint();
		tennisGame.serveurMetUnPoint();
		
		// vérifier les assertions
		assertEquals(tennisGame.getScore(), "Fifteen-All");
		
	}
	
	@Test
	public void thirtyLoveTest()
	{
		TennisGame tennisGame  = new TennisGame();
		tennisGame.serveurMetUnPoint();
		tennisGame.serveurMetUnPoint();		
		// vérifier les assertions
		assertEquals(tennisGame.getScore(), "Thirty-Love");
		
	}
	
}
