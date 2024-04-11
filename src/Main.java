public class Main {
    public static void main(String[] args) {
        System.out.println("si ves un solo valor el singleton fue reutilizado (Yeiii!)" + "\n" +
                "Si ves diferentes valores, es por que dos singletons fueron creados (booo!!)" + "\n\n" +
                "RESULTADO:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

    }
}
