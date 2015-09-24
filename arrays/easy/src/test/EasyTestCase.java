package test;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.FindDuplicatesSolution;

public class EasyTestCase {

	@Test
	public void testContainsDuplicate() {
		int[] testData = {1,1,2,3,4};
		assertTrue(	new FindDuplicatesSolution().containsDuplicate(testData));

	}
	
	@Test
	public void testContainsDuplicateFaster() {
		int[] testData = {1,1,2,3,4};
		assertTrue(	new FindDuplicatesSolution().containsDuplicateFaster(testData));

	}

}
