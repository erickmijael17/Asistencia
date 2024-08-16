
package org.example;

import java.util.Date;

public class Persona {
    protected String nombre;

    protected String EstadoAsis;

    char genero;

    Date fechareg;

    public Persona(String nombre, String estadoAsis, char genero) {
        this.nombre = nombre;
        this.EstadoAsis = estadoAsis;
        this.genero=genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoAsis() {
        return EstadoAsis;
    }

    public void setEstadoAsis(String estadoAsis) {
        EstadoAsis = estadoAsis;
    }
}

