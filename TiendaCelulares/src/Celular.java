public class Celular {
    private String marca;
    private String modelo;
    private String procesador;
    private String camara;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getCamara() {
        return camara;
    }

    public double getPrecio() {
        return precio;
    }

    public Celular(String marca, String modelo, String procesador, String camara, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.camara = camara;
        this.precio = precio;
    }
}
