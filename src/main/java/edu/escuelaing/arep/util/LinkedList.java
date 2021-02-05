package edu.escuelaing.arep.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {

	Node<E> first = null;
	Node<E> last = null;
	int size = 0;

	public boolean add(E e) {
		Node n = new Node(e);
		if (size == 0) {
			first = n;
			last = first;
		} else {
			last.setNext(n);
			last = n;
		}
		size = size + 1;
		return true;
	}

	public void add(int index, E element) {

	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub

	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<E> iterator() {
		LinkedListIterator<E> linkedListIterator = new LinkedListIterator<E>(first);
		return linkedListIterator;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		Node<E> temp = first;
		while(!temp.getNext().getData().toString().equals(o.toString())) {
			temp = temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
		size = size-1;
		return true;
	}

	public E remove(int index) {
		return null;

	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		return size;
	}

	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public E getFirst() {
		return this.first.getData();
	}

}
