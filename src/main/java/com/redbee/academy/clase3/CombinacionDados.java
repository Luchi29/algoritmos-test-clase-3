package com.redbee.academy.clase3;

public class CombinacionDados {

    /**
     * Cuando tiramos 2 dados y sumamos los valores es posible generar un resultado comprendido entre 2 al 12.
     * <p>
     * Generar un algoritmo que diga con cuantas combinaciones posibles se puede generar un valor dado.
     * <p>
     * Por ej:
     * Para sacar 4 hay 3 combinaciones posibles: 1+3, 2+2 y 3+1
     * Para sacar 3 hay 2 combinaciones posibles: 1+2 y 2+1
     *
     * @param valor
     * @return
     */
    public static Integer resolverCombinacionesPosiblesCon2Dados(Integer valor) {
        Integer countCombi = 0;
        for (Integer i = 1; i <= 6; i++) {
            for (Integer j = 1; j <= 6; j++) {
                if (i + j == valor) {
                    countCombi++;
                }
            }
        }

        return countCombi;
    }

    /**
     * Lo mismo pero con 3 dados
     *
     * @param valor
     * @return
     */
    public static Integer resolverCombinacionesPosiblesCon3Dados(Integer valor) {
        Integer countCombi = 0;
        for (Integer i = 1; i <= 6; i++) {
            for (Integer j = 1; j <= 6; j++) {
                for (Integer k = 1; k <= 6; k++) {
                    if (i + j + k == valor) {
                        countCombi++;
                    }
                }
            }
        }
        return countCombi;
    }
}
