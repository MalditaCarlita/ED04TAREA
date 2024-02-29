package cuentas;

/**
 * 
 * 
 * @author Carla Portela Ubeira
 * 
 * @version v0.1 febrero_2024
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /*Creación de una cuenta con el nombre del titular, el identificador de la cuenta, el saldo y el tipo de interés*/
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    public CCuenta()
    {
    }

    /**
     * 
     * @param nom. Nombre (cadena de caracteres) del titular de la cuenta.
     * @param cue. Identificador (cadena de caracteres) de la cuenta bancaria.
     * @param sal. Valor en coma flotante (double) del saldo de la cuenta.
     * @param tipo. Valor en coma flotante (double) del tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * 
     * @param cantidad. Valor en coma flotante (double) de dinero a ingresar.
     *  
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * @param cantidad. Valor en coma flotante (double) de dinero a retirar.
     * 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
