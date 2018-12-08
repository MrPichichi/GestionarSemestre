
package gestion_semestre;

import java.time.LocalTime;

public class Horario {
    LocalTime horaInicio;
    LocalTime horaTermino;


    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int hora, int minuto) {
        this.horaInicio = LocalTime.of(hora, minuto);
    }

    public LocalTime getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(int hora, int minuto) {
         this.horaTermino = LocalTime.of(hora, minuto);
    }
    
}
 