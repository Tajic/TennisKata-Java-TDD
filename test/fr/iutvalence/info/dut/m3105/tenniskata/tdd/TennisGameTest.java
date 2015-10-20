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
		serveurMetUnPoint();
		
		// vérifier les assertions
		assertEquals(tennisGame.serveurMetUnPoint(), "Fifteen-Love");
		
	}
	
	
}
