package org.example.poliformismo.midia;

import javax.print.attribute.standard.Media;

public class MidiaMain {
    public static void main(String[] args) {

        Midia[] playlist = {new Musica(), new Video(), new Podcast()};

        for (Midia m : playlist){
            m.reproduzir();
        }

    }
}
