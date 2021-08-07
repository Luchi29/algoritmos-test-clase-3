package com.redbee.academy.clase3;

import java.util.Locale;

public class Palindromo {

    /**
     * Generar un algoritmo que resuelva si una palabra es palindramo.
     *
     * Una palabra es palindromo cuando se lee de izquierda a derecha y de derecha a izquierda.
     * Por ej: neuquen
     *
     * @param palabra
     * @return
     */
    public static Boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase();
        String palabraSinEspacios = "";
        String newPalabra = "";
        for (Integer i = palabra.length()-1; i >= 0 ; i--) {
            if (palabra.charAt(i) != ' ') {
                palabraSinEspacios += palabra.charAt(i);
                newPalabra += palabra.charAt(i);
            }

        }

        if (newPalabra.equals(palabraSinEspacios)) {
            return true;
        }
        return false;
    }
}
