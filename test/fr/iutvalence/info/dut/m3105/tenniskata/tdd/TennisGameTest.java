package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{	
	@Test
	public void loveAllTest()
	{
		// se mettre dans les conditions du test
		TennisGame tennisGame  = new TennisGame();
		
		// vérifier les assertions
		assertEquals(tennisGame.getScore(), "Love-All");
	}
}
