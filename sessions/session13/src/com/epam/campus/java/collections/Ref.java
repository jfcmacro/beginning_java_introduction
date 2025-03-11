package com.epam.campus.java.collections;

public class Ref<T> {
    private T ref;

    public Ref(T ref) {
	this.ref = ref;
    }

    public T get() {
	return ref;
    }
    
    public void set(T ref) {
	this.ref = ref;
    }
    
    @Override
    public String toString() {
	return ref.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ref refC) {
            if (this.ref.getClass().equals(refC.ref.getClass())) {
		return this.ref.equals(refC.ref);
	    }
	}
        return false;
    }
}
