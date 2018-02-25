/**
 *   File Name: IteratorSetMap.java<br>
 *
 *   Yutaka<br>
 *   Created: Feb 24, 2018
 *   
 */

package org.jcollections.iterate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * IteratorSetMap //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class IteratorSetMap {
	
	Set<String> states;
	
	public boolean iterateHashSetSearch(HashSet<String> hs) {
		boolean result = false;
		Iterator<String> it = hs.iterator();
		while(it.hasNext() ) {
			if(it.equals("CA")) {
				System.out.println("CA");
				result = true;
			}
			it.next();
		}
		return result;
	}
}
