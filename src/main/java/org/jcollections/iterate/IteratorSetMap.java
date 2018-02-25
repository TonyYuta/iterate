/**
 *   File Name: IteratorSetMap.java<br>
 *
 *   Yutaka<br>
 *   Created: Feb 24, 2018
 *   
 */

package org.jcollections.iterate;

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
	
	
	public boolean iterateHashSetSearch(Set<String> setElements, String search) {
		boolean result = false;
		Iterator<String> it = setElements.iterator();
		while(it.hasNext() ) {
			if(it.next() == search) {
				result = true;
			}
		}
		return result;
	}
	
	
	
	
}
