package org.jcollections.iterate;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IteratorSetMApTest {
	
	Set<String> states;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassIteratorSetMApTest() {
		states = new HashSet<String>();
		
	}
	
	@Test(enabled = true, groups = {"Set", "HAshSet", "Iterator", "all"}, priority = 0)
	public void test01iterateHashSetSearch() {
		
	}
}
