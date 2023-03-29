public class Main {
    public static void main(String[] args) {
        String text = "Hello World!";

        int liczba = 0;
        StringBuilder wynik = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
               liczba++;
            }
            wynik.append(c);
        }

        System.out.println("Podany text: " + text);
        System.out.println("Wynik: " + wynik);
        System.out.println("ilosc liter zmienionych: " + liczba);
    }
}