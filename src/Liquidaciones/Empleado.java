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

public class Empleado {

//Atributos, entrada de empleado
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private String carnet;

//Constructor, proceso
    public Empleado() {
    }
    
//Metodo constructor, proceso
    public Empleado(String nombre, String apellido, int edad, int telefono, String carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.carnet = carnet;
    }
     
//Metodo get y set, entrada de empleado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
       
}
