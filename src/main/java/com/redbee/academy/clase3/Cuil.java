package com.redbee.academy.clase3;

import java.util.ArrayList;
import java.util.List;

public class Cuil {

    /**
     * Un CUIL es un número que consta de 11 dígitos y está conformado de la siguiente manera:
     * <p>
     * XX-12345678-Y
     * <p>
     * Donde XX es el tipo de persona física o jurídica y pueden ser los siguientes:
     * 27 es para mujeres
     * 20 es para hombres
     * 23 puede ser ambos (se usa cuando hay otro número igual)
     * 30 empresas
     * <p>
     * Generar un algoritmo para poder calcular el valor de Y que se hace de la siguiente forma:
     * A cada uno de los 10 dígitos que conocemos, se multiplica por: 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 respectivamente
     * <p>
     * <p>
     * Se suman los valores obtenidos, el resultado se divide por 11, y del resultado  se toma el primer decimal.
     * Ese primer decimal se resta a 11 y el resultado es el numero verificador.
     * <p>
     * <p>
     * EJEMPLO
     * DNI 12.345.678 Masculino
     * <p>
     * 2 0 1 2 3 4 5 6 7 8
     * x
     * 5 4 3 2 7 6 5 4 3 2
     * ————————————————————
     * 10+0+3+4+21+24+25+24+21+16= 148
     * <p>
     * <p>
     * 148 dividido 11 = 5 ( porque 148/11= 13,454 –; .454 se redondea a 5).
     * 11-5 = 6
     * <p>
     * Entonces, el CUIL es 20-12345678-6
     *
     * @param tipoPersona
     * @param dni
     * @return
     */
    public static Integer calcular(Integer tipoPersona, Integer dni) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(2);
        nums.add(7);
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);

        ArrayList<Integer> tiposPersona = new ArrayList<Integer>();
        tiposPersona.add(5);
        tiposPersona.add(4);

        double sumaTotal = ((multiplicarDni(dni, nums))+(multiplicarDni(tipoPersona, tiposPersona)))/11.0;
        Integer sumaTotalRound = (int) Math.round(sumaTotal*100)%10;
        Integer finalNumber = 11 - sumaTotalRound;

        return finalNumber;
    }


    public static Integer multiplicarDni(Integer num, ArrayList<Integer> nums) {
        Integer sum = 0;
        Integer i = nums.size()-1;
        while(i >=0 ){
            sum += (num%10)* nums.get(i);
            num/=10;
            i--;
        }
        return sum;
    }
}
