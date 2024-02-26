public class CostePersonal {
    

    static float calcularCosteTotal(Trabajador trabajadores[]) {
        float costeTotal = 0;

        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR || trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
                costeTotal += trabajador.getNomina();
            } else {
                float horasExtras = trabajador.getHorasExtras();
                costeTotal += trabajador.getNomina() + (horasExtras * 20);
            }
        }

        return costeTotal;
    }
}

