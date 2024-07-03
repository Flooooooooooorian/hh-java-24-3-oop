package abc;

public class Main {

    public static void main(String[] args) {

        String color = "durchsichtig";
        String text = "tea";
        int size = 200;
        int content = 0;

        System.out.println("Ursulas abc.Tasse:");
        System.out.println("Farbe: " + color);
        System.out.println("Aufdruck: " + text);
        System.out.println("größe: " + size);
        System.out.println("Inhalt: " + content);


        Tasse henriquesTasse = new Tasse();

        henriquesTasse.color = "dunkel blau";
        henriquesTasse.content = 50;
        henriquesTasse.size = 450;
        henriquesTasse.text = "";

        System.out.println(henriquesTasse.color);

        Tasse olgasTasse = new Tasse();
        olgasTasse.color = "weiß";

        System.out.println(olgasTasse.color);
        System.out.println(henriquesTasse.color);

        Tasse meineTasse = new Tasse("schwarz");
        Tasse deineTasse = new Tasse();

        System.out.println(meineTasse.color);
        System.out.println(deineTasse.color);
        System.out.println(deineTasse.text);
        System.out.println(deineTasse.size);
    }
}
