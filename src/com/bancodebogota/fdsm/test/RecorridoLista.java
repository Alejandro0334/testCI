/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdsm.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class RecorridoLista {
    
    List<String> lista = new ArrayList<>();
    
    public void listas()
    {


        lista.add("Andrea");        
        lista.add("Amaya");
        lista.add("Julio");
    }

    public void recorrerLista()
    {
            //for each : debemos indicar el dato que almacena la lista , en este caso String , luego debemos declarar una variable pivote (str) finalmente dos puntos (:) y la lista que vamos a recorrer
        for(String str : lista)
        {
            //imprimimos el objeto pivote
            System.out.println(str);
        }

        //for indicamos la variable indice en 0 para recorrer toda la lista, de inicio a fin al final de cada iteracion el indice se incrementa en uno
        for(int indice = 0;indice<lista.size();indice++)
        {
            System.out.println(lista.get(indice));
        }

        //utilizar el metodo foreach() de las colecciones de java , debemos llamar al metodo foreach de la instancia de coleccion y enviar un parametro del tipo Consumer
        lista.forEach(System.out::println);
    }

}
