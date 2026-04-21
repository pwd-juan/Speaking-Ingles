package EntradaSalida;

public class Ilimitados {
    static java.util.Scanner in;

    public static boolean caso() {
        int n;

        if (!in.hasNext()) {return false;}

        n = in.nextInt();

        // Solución

        return true;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (caso());
    }
}
