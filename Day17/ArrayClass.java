package Day17;

public class ArrayClass<T> {
    private T[] array;//设置泛型数组

    public void SetT(T[] array) {
        this.array = array;
    }

    public T[] getT() {
        return array;
    }

    public static void main(String[] args) {
        ArrayClass<String> a = new ArrayClass<String>();
        String[] array = {"One", "Two", "Three", "Four", "Five"};
        a.SetT(array);
        for (int i = 0; i < a.getT().length; ++i) {
            System.out.print(a.getT()[i] + " +");
        }



    }
}
