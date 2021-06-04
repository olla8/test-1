import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondClass {
    private int a,b;

    public SecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int calculateSum() {
        return a+b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        String[] parts = line.split(" ");
        int a = Integer.valueOf(parts[0]);
        int b = Integer.parseInt(parts[1]);
        SecondClass secondClass = new SecondClass(a,b);
        System.out.println(secondClass.calculateSum());
    }


}
