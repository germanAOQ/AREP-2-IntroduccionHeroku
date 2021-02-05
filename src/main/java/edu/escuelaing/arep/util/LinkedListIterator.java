package edu.escuelaing.arep.util;

import java.util.Iterator;

/**
 * The Class LinkedListIterator.
 *
 */
public class LinkedListIterator<E> implements Iterator<E>{

	/** The current. */
	Node<E> current = null;
	
	/**
	 * Instantiates a new linked list iterator.
	 *
	 * @param node Nodo desde el cual va a iniciar el iterador.
	 */
	public LinkedListIterator(Node<E> node) {
		current = node;
	}
	
	/**
	 * Checks for next.
	 *
	 * @return true, si el nodo tiene un nodo siguiente.
	 */
	public boolean hasNext() {
		return current!=null;
	}

	/**
	 * Next.
	 *
	 * @return La data del siguiente nodo.
	 */
	public E next() {
		E data = current.getData();
		current = current.getNext();
		return data;
	}

}
