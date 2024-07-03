package abc;

import house.kitchen.Tasse;

public class Main {

    public static void main(String[] args) {

        String color = "durchsichtig";
        String text = "tea";
        int size = 200;
        int content = 0;

        System.out.println("Ursulas house.kitchen.Tasse:");
        System.out.println("Farbe: " + color);
        System.out.println("Aufdruck: " + text);
        System.out.println("größe: " + size);
        System.out.println("Inhalt: " + content);


        Tasse henriquesTasse = new Tasse();

        henriquesTasse.setColor("dunkel blau");
        henriquesTasse.setContent(50);
        henriquesTasse.setSize(450);
        henriquesTasse.setText(new String[]{"Text"});

        System.out.println(henriquesTasse.getColor());

        Tasse olgasTasse = new Tasse();
        olgasTasse.setColor("weiß");

        System.out.println(olgasTasse.getColor());
        System.out.println(henriquesTasse.getColor());

        Tasse meineTasse = new Tasse("schwarz");
        Tasse deineTasse = new Tasse("schwarz");

        meineTasse.setText(new String[]{"Text"});

        System.out.println(meineTasse.getColor());
        System.out.println(deineTasse.getColor());
        System.out.println(deineTasse.getText());
        System.out.println(deineTasse.getContent());

        System.out.println(meineTasse);
        System.out.println(deineTasse);

        System.out.println("Hallo".equals("Tschüs"));
        System.out.println(meineTasse.equals(deineTasse));
    }
}
