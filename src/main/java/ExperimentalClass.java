public class ExperimentalClass {
    Integer i;
    String s;

    public ExperimentalClass(Integer i) {
        this.i = i;
    }

    public ExperimentalClass(String s) {
        this.s = s;
        String k = "ola";

    }

    @Override
    public String toString() {
        return "ExperimentalClass{" +
                "i=" + i +
                '}';
    }
}
