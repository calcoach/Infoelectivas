/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoelectivas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Data {

    Files info = new Files();

    public String[] tipoElectivasSemestre(String semestre) {

        String[] tipoelectivas = new String[5];
        ArrayList<String> archivo = info.readArchive("data");

        boolean comp1 = true;
        int i = 0;
        int j = 0;
        System.out.println("tamaño: " + archivo.size());
        while (comp1 & i < archivo.size()) {

            String[] split = archivo.get(i).split("%");

            //Comprueba el semestre
            if (split[0].equals(semestre)) {

                if (j == 0) {

                    tipoelectivas[j] = split[1];
                    j++;
                } else //Comprueba que no se repita el tipo de electiva
                 if (!split[1].equals(tipoelectivas[j - 1])) {

                        tipoelectivas[j] = split[1];
                        j++;
                    }

            } //Si j>0 significa que ya se agregaron todas las elesctivas de ese demestre 
            else if (j > 0) {
                comp1 = false;
            }

            i++;
        }

        return tipoelectivas;
    }

    public String[] ObtenerElectivas(String tipoelectiva) {

        String[] electivas = new String[100];

        ArrayList<String> archivo = info.readArchive("data");

        boolean comp1 = true;
        int i = 0;
        //int cont=0;
        int j = 0;

        while (comp1 == true & i < archivo.size()) {

            String[] split = archivo.get(i).split("%");

            //Comprueba el semestre
            if (split[1].equals(tipoelectiva)) {

                electivas[j] = split[3];
                j++;
            } else if (j > 0) {
                comp1 = false;
                break;
            }
            i++;
        }

        return electivas;
    }

    public Electiva getElectiva(String codigo) {

        Electiva electiva = null;

        try {
            File file = new File("data.txt");
            FileReader r = new FileReader(file);
            BufferedReader bf = new BufferedReader(r);

            while (bf.ready()) {

                String[] linea = bf.readLine().split("%");
                if (linea.length > 0) {
                   
                    electiva = new Electiva(linea[2], 0);
                    if (electiva.getCodigo().trim().equals(codigo)) {
                        return electiva;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return electiva;
    }
}
