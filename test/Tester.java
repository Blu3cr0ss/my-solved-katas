package test;

public class Tester<T> {
    public Tester(T obj) {
        this.obj = obj;
    }

    private static final Tester<Object> defaultTester = new Tester<>(new Object());

    public static Tester<Object> getDefaultTester() {
        return defaultTester;
    }

    public static Tester to(Class<?> clazz) {
        try {
            return new Tester(clazz.newInstance());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Tester to(Object obj) {
        return new Tester(obj);
    }

    private T obj;

    public T getObj() {
        return obj;
    }

    public boolean assertEquals(Object x, Object y) {
        if (x != y) throw new AssertionError(x + " is not equals to " + y);
        return true;
    }
}
