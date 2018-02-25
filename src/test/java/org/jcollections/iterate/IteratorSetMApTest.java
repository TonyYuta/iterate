package org.jcollections.iterate;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IteratorSetMApTest {
	
	IteratorSetMap ism;
	Set<String> states;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassIteratorSetMApTest() {
		ism = new IteratorSetMap();
		states = new HashSet<>();
		states.add("CA");
		states.add("FL");
		states.add("NY");
	}
	
	@Test(enabled = true, groups = {"Set", "HAshSet", "Iterator", "all"}, priority = 0)
	public void test01iterateHashSetSearch() {
		String searchState = "CA";
		Assert.assertTrue(ism.iterateHashSetSearch(states, searchState), "not found");
	}
	
}
