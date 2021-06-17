public class ExperimentalClass {
    Integer i;
    String s;

    public ExperimentalClass(Integer i) {
        this.i = i;
    }

    public ExperimentalClass(String s) {
        this.s = s;

    }

    @Override
    public String toString() {
        return "ExperimentalClass{" +
                "i=" + i +
                '}';
    }
}
