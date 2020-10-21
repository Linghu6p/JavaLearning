package Day17;

public class ReviewUpAndDown {
    private Object b;

    public Object getB() {
        return b;
    }

    public void setB(Object b) {
        this.b = b;
    }
    public static void main(String[] args) {
        ReviewUpAndDown R = new ReviewUpAndDown();
        R.setB(new Boolean(true));
        System.out.println(R.getB());
        R.setB(new Float(12.3));
        //Float f = (Float) (R.getB()); 向下转型
        System.out.println(R.getB());
    }
}
