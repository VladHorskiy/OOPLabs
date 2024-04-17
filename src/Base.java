public abstract class Base {
    protected static int counter = 0;

    public Base() {
        counter++;
    }

    public abstract String toString();
}
