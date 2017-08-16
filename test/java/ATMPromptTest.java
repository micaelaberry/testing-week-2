package src.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import src.main.ATMPrompt;

public class ATMPromptTest {

	@Test
	public void whenUserTypesCorrectAtmPin(){
		ATMPrompt atmPrompt = new ATMPrompt();
		int pinNumber = 1234;
		assertEquals(true, atmPrompt.correctNumber(pinNumber));
	}


}
