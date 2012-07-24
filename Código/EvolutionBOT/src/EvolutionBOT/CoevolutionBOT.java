/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package EvolutionBOT;

import java.util.ArrayList;
import Utils.sel_mapa;
import java.util.*;
import java.io.*;
import Utils.*;

/**
 *
 * @author antares
 */
public class CoevolutionBOT extends SimpleGenetic {

    ArrayList<sel_mapa> m_population;

    @Override
    public void main(){



        System.out.println("Empezando algoritmo genético con los siguientes parámetros");
        System.out.println("==============================================================");
        System.out.println("Factor mutación: " + factor_mutacion);
        System.out.println("Factor crossover: " + factor_crossover);
        System.out.println("Total generaciones: " + total_generaciones);
        System.out.println("Tamaño población: " + size);
        System.out.println("Número individuos torneo: " + nts);
        System.out.println("Cantidad de individuos elitimo: " + n_eli);
        System.out.println("Utilizando " + n_hebras + " hebras simultaneas para evaluaciones.");

        //Inicializamos
        System.err.println("Inicializando población");
        //start_espectro(population);
        start_random(population, size);

        //Evaluamos toda la población

        evaluate();

        System.err.println("\n Ajustando población");

        //Ordenamos
//        Collections.sort(population, new IndividuoComparator());

        System.err.println("Almacenando información sobre individuos");
        store();

        //Comienza el algoritmo genético en si
        while (generation < total_generaciones) {
            generation++;

            next_generation();

            //Evaluamos de nuevo los nuevos individuos
            i = 0;
            evaluate();

            //Ordenamos de nuevo
            System.err.print("\n");
//            Collections.sort(population, new IndividuoComparator());

            //Almacenamos
            store();
        }
        
    }
}
