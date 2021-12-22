package com.vogella;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ErrorCollector;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;


import com.example.service.CalculatorService;



public class calcTest 
{

		CalculatorService calculator = new CalculatorService();
	
	@Test
	@DisplayName("Plus test")	
		void testPlus()
	
	// 1 Richtig, 2 Fehler
	{
		assertAll("Plus Test", 
				() -> assertEquals("3", calculator.calculate("1plus2"), "Expected: 1+2 = 3"),
			    () -> assertEquals("-3", calculator.calculate("-1minus3"), "Expected: -1-3 = -4"),
			    () -> assertEquals("2", calculator.calculate("-1plus2"), "Expected: -1+2 = 1"));
					
	}
}