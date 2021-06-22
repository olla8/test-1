public class Lol {
    int i = 0;
    ExperimentalClass e;

    public void createNew(){
        e = new ExperimentalClass(22);
    }

    public String ret(){
        return e.toString();
    }
    public static void main(String[] args) {
        System.out.println("lol");
        System.out.println("mhh");
        System.out.println(2-6);
        Lol l = new Lol();
        l.createNew();
        System.out.println(l.ret());
    }
     // innn

}
