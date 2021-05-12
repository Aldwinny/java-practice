package main;

public class Param<T> {

	private T[] t;

	public Param(T[] t) {
		this.t = t;
	}

	public T get(int index) {
		return t[index];
	}

	public void set(T t, int index) {
		this.t[index] = t;
	}

	public int length() {
		return t.length;
	}

}
