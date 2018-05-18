package zadania.genericTypes;

public class Pair<T,V> {
    private T ob1;
    private V ob2;

    public Pair(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public void setOb1(T ob1) {

        this.ob1 = ob1;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public T getOb1() {

        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public String printPair(){
        return getOb1().toString() + " " + getOb2().toString();
    }
}
