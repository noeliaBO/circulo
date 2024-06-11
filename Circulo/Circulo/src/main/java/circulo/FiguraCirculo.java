package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase FiguraCirculo
 * @author profesor
 */
public final class FiguraCirculo {
    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    
    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
   
    final double MINRADIO = 0.0;

    public FiguraCirculo() {
    }

    public FiguraCirculo(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }







    public double obtenerDiametro() {
        return getRadio() * 2;
    }

    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    public double AreaFiguraCirculo() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    public void trasladarCentro(int moverX, int moverY){
        setCoordenadaX(getCoordenadaX() + moverX);
        setCoordenadaY(getCoordenadaY() + moverY);
    }

    private void establecerRadio(double valorRadio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void establecerX(int valorX) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int obtenerY() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public double obtenerArea() {
        return Math.PI * radio * radio;
    }
 

 

    int getcoordenadaY() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
