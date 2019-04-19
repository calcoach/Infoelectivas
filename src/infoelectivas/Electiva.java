package infoelectivas;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Electiva {

    public Electiva(String name) {
        this.name = name;
        cargarInformacionConNombre();
    }

    public Electiva(String codigo, int opc) {
        this.codigo = codigo;
        cargarInformacionConCodigo();
   }

    String name;
    String codigo;
    String tipo;
    String Descripcion;
    Files info = new Files();

    private void cargarInformacionConNombre() {

        ArrayList<String> archivo = info.readArchive("data");

        boolean comp1 = true;
        int i = 0;

        while (comp1 & i < archivo.size()) {

            String[] split = archivo.get(i).split("%");

            //Comprueba el semestre
            if (split[3].equals(name)) {

                tipo = split[1];
                codigo = split[2];
                Descripcion = split[4];
                comp1 = false;
            }

            i++;
        }
    }

     private void cargarInformacionConCodigo() {

        ArrayList<String> archivo = info.readArchive("data");

        boolean comp1 = true;
        int i = 0;

        while (comp1 & i < archivo.size()) {

            String[] split = archivo.get(i).split("%");

            //Comprueba el semestre
            if (split[2].contains(codigo)) {

                tipo = split[1];
                codigo = split[2];
                Descripcion = split[4];
                name = split[3];
                comp1 = false;
            }

            i++;
        }
    }
    
    public String getCodigo() {

        return codigo;
    }

    public String getDescripcion() {

        return Descripcion;
    }

    public String getName() {

        return name;
    }

    public String getTipo() {

        return tipo;
    }

}
