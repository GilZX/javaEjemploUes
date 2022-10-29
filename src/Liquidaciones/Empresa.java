 /*
    Descripción de la aplicación
    La problemática que se ha planteado es: Aplicación para el cálculo de liquidaciones laborales de una empresa privada, como 
    anteriormente se ha descrito normalmente cuando hay un despido o una liquidación se debe dar 15 días del salario base; en el
    programa que se creara en Java swing, utilizando las opciones que nos da JoptionPane se hará un algoritmo para una empresa 
    privada en la cual se tendrá registrado diferentes roles de trabajo en una empresa con un salario ya definido.
    En el cual cuando el usuario desea hacer una liquidación deberá, digitar su nombre completo, edad, rol de trabajo, años en la 
    empresa, elegir el tipo de liquidación, si fue por despido o renuncia, carnet, ingresar su salario y programa se encargara de
    mostrar el calculo correspondiente a la liquidación, esa información la almacenara en txt para quede registro de la liquidación 
    realizada. Los resultados que se esperan es el ahorro de tiempo, a lo hora de realizar este tipo de tramites, optimización en el
    proceso para notificarle a la empresa cuantos empleados se realizaron liquidaciones ya que toda esta información queda almacenada.

    Informacion adicional a tomar en cuenta
    En caso de que el contrato de un trabajador se de por terminado sin causa, éste recibirá una indemnización por liquidación 
    que asciende a 15 días de salario normal por cada año de servicio prestado a la empresa.
    Este beneficio se otorga igualmente a los empleados cuando renuncian, y el empleador está obligado a proporcionar el pago 
    dentro de los 15 días siguientes al último día de trabajo del empleado.
    */

package Liquidaciones;

   /*
    *Fecha: 11/10/2022
    *Version: 1.0
    *Fecha: 12/10/2022
    *Version: 2.0
    *Fecha: 13/10/2022
    *Version: 3.0
    *Fecha: 14/10/2022
    *Version: 4.0
    *Fecha: 18/10/2022
    *Version: 5.0
    *Fecha: 19/10/2022
    *Version: 6.0
    *Creadores: Aguilar Vasquez, Rodrigo Ómar. (AV20023)
                Aquino Escobar, Oscar René. (AE18021)
                Reyes Rojas, Madeline Elizabeth. (RR20104)
     */

public class Empresa {
    
    //Atributos, entrada de empresa
    private String nombreEmpresa;
    private String rolTrabajo;
    private double aniosEmpresa;
    private String tipoLiquidacion;
    private int telefonoEmpresa;
    private String ubicacion;
    private double salario;

    //Atributo, proceso
    private double liquidacionCalculada;
    private double ivaCalculado;
    private double pago;
    private double liquidacionDia;

    //Atributo para metodo, proceso
    double liquidacion = 2;
    double iva = 0.13;
    
    //Implementacion de 1 a 1
    private Empleado trabajador;

//Constructor, proceso
    public Empresa() {
    }
    
//Metodo constructor, proceso
    public Empresa(String nombreEmpresa, String rolTrabajo, double aniosEmpresa, String tipoLiquidacion, int telefonoEmpresa, String ubicacion, double salario, double liquidacionCalculada, double ivaCalculado, double pago, double liquidacionDia, Empleado trabajador) {
        this.nombreEmpresa = nombreEmpresa;
        this.rolTrabajo = rolTrabajo;
        this.aniosEmpresa = aniosEmpresa;
        this.tipoLiquidacion = tipoLiquidacion;
        this.telefonoEmpresa = telefonoEmpresa;
        this.ubicacion = ubicacion;
        this.salario = salario;
        this.liquidacionCalculada = liquidacionCalculada;
        this.ivaCalculado = ivaCalculado;
        this.pago = pago;
        this.liquidacionDia = liquidacionDia;
        this.trabajador = trabajador;
    }
 
//Metodo get y set, entrada
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRolTrabajo() {
        return rolTrabajo;
    }

    public void setRolTrabajo(String rolTrabajo) {
        this.rolTrabajo = rolTrabajo;
    }

    public double getAniosEmpresa() {
        return aniosEmpresa;
    }

    public void setAniosEmpresa(double aniosEmpresa) {
        this.aniosEmpresa = aniosEmpresa;
    }

    public String getTipoLiquidacion() {
        return tipoLiquidacion;
    }

    public void setTipoLiquidacion(String tipoLiquidacion) {
        this.tipoLiquidacion = tipoLiquidacion;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getLiquidacionCalculada() {
        return liquidacionCalculada;
    }

    public void setLiquidacionCalculada(double liquidacionCalculada) {
        this.liquidacionCalculada = liquidacionCalculada;
    }

    public double getIvaCalculado() {
        return ivaCalculado;
    }

    public void setIvaCalculado(double ivaCalculado) {
        this.ivaCalculado = ivaCalculado;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getLiquidacionDia() {
        return liquidacionDia;
    }

    public void setLiquidacionDia(double liquidacionDia) {
        this.liquidacionDia = liquidacionDia;
    }

    public double getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(double liquidacion) {
        this.liquidacion = liquidacion;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public Empleado getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Empleado trabajador) {
        this.trabajador = trabajador;
    }
    
    //Proceso, Metodo calcular liquidacion es igual a años trabajados * salario / la liquidacion
        public double CalcularLiquidacion(double aniosEmpresa, double salario, double liquidacion){
            liquidacionCalculada = (aniosEmpresa * salario) / liquidacion;
            return liquidacionCalculada;
        }
    
    //Proceso, Metodo calcular IVA es igual a liquidacion calculada * IVA
        public double CalcularIva(double liquidacionCalculada, double iva){
            ivaCalculado = liquidacionCalculada * iva;
            return ivaCalculado;
        }
    
    //Proceso, Metodo calcular bono es igual a liquidacion calculada - IVA calculado
        public double CalcularPago(double liquidacionCalculada, double ivaCalculado){
            pago = liquidacionCalculada - ivaCalculado;
            return pago;
        }
    
    //Proceso, Metodo calcular bonos dados en el dia es igual a todos los pagos hechos
        public double CalcularBonos(double pago){
            liquidacionDia += pago;
            return liquidacionDia;
        }
        
}

