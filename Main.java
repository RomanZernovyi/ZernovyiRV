public class Main {
    public static void main(String[] args) {

        NamesHandler namesHandlers = new NamesHandler (new String[]{"Vitaliy", "Vasiliy", "Elena", "Tania"});

        System.out.println(namesHandlers);

        NamesHandler namesHandlers2 = new NamesHandler ("Vitaliy,Vasiliy,Elena,Tania");

        System.out.println(namesHandlers2);

        System.out.println("-------------------------");

        System.out.println(namesHandlers.toStringByLength(5));

        System.out.println("-------------------------");

        System.out.println(namesHandlers.toStringByStartWith('E'));

    }

}