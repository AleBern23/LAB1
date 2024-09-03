package com.example.lab1_cervezas;

import java.util.ArrayList;
import java.util.List;

public class Beers {
    public List<String> obtenerCervezas(String spinner){
        List<String> cerveza = new ArrayList<>();
        if (spinner.equals("Light")){
            cerveza.add("Lager Americana");
            cerveza.add("Pilsner");
            cerveza.add("Blonde Ale");
        } else if (spinner.equals("Amber")) {
            cerveza.add("Amber Lager");
            cerveza.add("Oktoberfest");
            cerveza.add("Vienna Lager");
        }else if (spinner.equals("Brown")) {
            cerveza.add("Porter");
            cerveza.add("Scottish Ale");
            cerveza.add("Schwarzbier");
        }else if (spinner.equals("Dark")) {
            cerveza.add("Stout");
            cerveza.add("Russian Imperial Stout");
            cerveza.add("Porter");
        }else {
            cerveza.add("Tipo de cerveza no seleccionado");
        }
        return cerveza;
    }
}
