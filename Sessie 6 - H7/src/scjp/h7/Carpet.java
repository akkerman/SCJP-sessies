package scjp.h7;
class A { }
class B extends A { }
class C extends B { }
public class Carpet<V extends B> {
public <X extends V> Carpet<? extends V> method(Carpet<? super X> e) {
	//	 return new Carpet<X>();
	//	 return new Carpet<V>();
	//	 return new Carpet<A>();
	//	 return new Carpet<B>();
	//	 return new Carpet<C>();	
} }
