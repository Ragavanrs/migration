package java8features;

@FunctionalInterface
public interface Inter {

	public abstract String hello(Employee e);
	
	static String word() {
		return "hello lord";
	}
	
}
