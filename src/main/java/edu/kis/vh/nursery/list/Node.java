package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node prev;
	private Node next;

	/**
	 * Konstruktor klasy ktory uzywa metody setValue do ustawienia pola prywatnego value na wartosc i.
	 * @param i
	 */

	public Node(int i)
	{
		setValue(i);
	}

	/**
	 * Metoda zwraca wartosc pola prywatnego klasy Node czyli value.
	 * @return
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Metoda ustawia wartosc pola prywatnego klasy Node na value.
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Metoda zwraca poprzedni wezel.
	 * @return
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * Metoda ustawia wezel poprzedni wezla na wezel prev.
	 * @param prev
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * Metoda zwraca nastepny wezel.
	 * @return
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Metoda ustawia nastepny wezel na wezel next.
	 * @param next
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
}
