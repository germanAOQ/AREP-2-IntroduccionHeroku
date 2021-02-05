package edu.escuelaing.arep.util;

/**
 * The Class Node.
 *
 */
public class Node<E> {
	
	/** The data. */
	private E data = null;
	
	/** The next. */
	private Node<E> next = null;
	
	/**
	 * Instantiates a new node.
	 *
	 * @param data Dato que contiene el nodo.
	 */
	public Node(E data) {
		this.data = data;
	}
	
	public Node<E> getNext(){
		return next;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public E getData() {
		return data;
	}
	
	/**
	 * Checks for next.
	 *
	 * @return true, si la ejecución del método fue existosa, es decir, si el nodo tiene un siguiente nodo no nulo.
	 */
	public boolean hasNext() {
		boolean res = false;
		if(this.next != null) {
			res = true;
		}
		return res;
	}


}
