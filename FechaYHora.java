/**
 * Write a description of class calendario here.
 *
 * @author (David Rodriguez Diez)
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // Declarando variables dia, mes y año
    private DisplayDosCaracteres nDia;
    private DisplayDosCaracteres nMes;
    private DisplayDosCaracteres nAno;
    private DisplayDosCaracteres hora;
    private DisplayDosCaracteres minutos;
    /**
     * Constructor de la clase CalendarioBasico
     */ 
    public FechaYHora()
    {
        nDia = new DisplayDosCaracteres(31);
        nMes = new DisplayDosCaracteres(13);
        nAno = new DisplayDosCaracteres(100);
        hora = new DisplayDosCaracteres(24);
        minutos = new DisplayDosCaracteres(60);
    }

    /**
     * Fijamos la fecha nueva
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno, int horaDisplay, int minutoDisplay)
    {
        nDia.setValorAlmacenado(nuevoDia);
        nMes.setValorAlmacenado(nuevoMes);
        nAno.setValorAlmacenado(nuevoAno);
        hora.setValorAlmacenado(horaDisplay);
    }

    /**
     *Metodo para obtener la fecha
     */
    public String obtenerFecha()
    {
        String devolverFecha;
        devolverFecha = nDia.getTextoDelDisplay() + "-" + nMes.getTextoDelDisplay() + "-" + nAno.getTextoDelDisplay();
        return devolverFecha;
    }

    public void avanzarFecha()
    {
        nDia.incrementaValorAlmacenado();
        if (nDia.getValorAlmacenado() == 1){
            nMes.incrementaValorAlmacenado();
            if(nMes.getValorAlmacenado() == 1){
                nAno.incrementaValorAlmacenado();
            }
        }
    }

    public void getFechaYHora()
    {
        
    }
}