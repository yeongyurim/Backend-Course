package ch13.exam;

public class Container<T, K> {
	T name;
	K job;

	public T getKey() {
		return name;
	}
	
	public K getValue() {
		return job;
	}

	public void set(T name, K job) {
		this.name = name;
		this.job = job;
	}
}
