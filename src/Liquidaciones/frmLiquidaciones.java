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

//Importando galerias, salida
    import java.util.ArrayList;
    import java.io.File;
    import java.io.FileWriter;
    import java.io.FileReader;
    import java.util.List;
    import java.awt.event.KeyEvent;
    import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
    import java.io.IOException;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;

public class frmLiquidaciones extends javax.swing.JFrame {

    Empresa empre = new Empresa();
//empre = instancia de Empresa, entrada
    
    Empleado emple = new Empleado();
//emple = instancia de Empleado, entrada
    
//Metodo de la tabla, entrada
    DefaultTableModel empres = new DefaultTableModel();
//empres = modelo de control de Empresa
    
//Creando el array list Empleado, entrada
   public List<Empresa> empresas = new ArrayList<>();
//empresas = arraylist de Empresa
    
//Atributos, salida
    int salir, elige, filaBorrada, confirmar;
    String opcion, carnet;
    char valida;
    
    private final String ruta = System.getProperties().getProperty("user.di");
    public frmLiquidaciones() {
        initComponents();
        File archivo = null;
        FileReader FileR = null;
        BufferedReader BufferedR = null;
        

        //Agregar nombre del documento
        archivo = new File (ruta + "//ProyectoEsd115.txt");
        //FileR = new FileReader(archivo);
        

        
//        empres = (DefaultTableModel)this.tbLiquidaciones.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLiquidaciones = new javax.swing.JLabel();
        lblTelefonoEmpresa = new javax.swing.JLabel();
        lblLiquidacion = new javax.swing.JLabel();
        lblEmpresaUbicacion = new javax.swing.JLabel();
        lblEdadEmpleado = new javax.swing.JLabel();
        lblApellidoEmpleado = new javax.swing.JLabel();
        lblNombreEmpleado = new javax.swing.JLabel();
        lblCarnetEmpleado = new javax.swing.JLabel();
        lblTelefonoEmpleado = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        lblTrabajados = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        cbxUbicacion = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        cbxNombreEmpresa = new javax.swing.JComboBox<>();
        txtTelefonoEmpresa = new javax.swing.JTextField();
        cbxLiquidacion = new javax.swing.JComboBox<>();
        txtCarnet = new javax.swing.JTextField();
        cbxPuesto = new javax.swing.JComboBox<>();
        txtSalario = new javax.swing.JTextField();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        spLiquidaciones = new javax.swing.JScrollPane();
        tbLiquidaciones = new javax.swing.JTable();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtApellidoEmpleado = new javax.swing.JTextField();
        btnIngresarDatos = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtTrabajados = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        lblLiquidaciones.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblLiquidaciones.setText("Liquidaciones");

        lblTelefonoEmpresa.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTelefonoEmpresa.setText("Telefono de la empresa");

        lblLiquidacion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblLiquidacion.setText("Tipo de liquidacion");

        lblEmpresaUbicacion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblEmpresaUbicacion.setText("Ubicacion de la empresa");

        lblEdadEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblEdadEmpleado.setText("Edad del empleado");

        lblApellidoEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblApellidoEmpleado.setText("Apellido del empleado");

        lblNombreEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblNombreEmpleado.setText("Nombre del empleado");

        lblCarnetEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCarnetEmpleado.setText("Carnet del empleado");

        lblTelefonoEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTelefonoEmpleado.setText("Telefono del empleado");

        lblSalario.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblSalario.setText("Salario");

        lblPuesto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPuesto.setText("Puesto");

        lblTrabajados.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTrabajados.setText("Años trabajados");

        lblNombreEmpresa.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblNombreEmpresa.setText("Nombre de la empresa");

        cbxUbicacion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbxUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahuachapan", "Cabañas", "Chalatenango", "Cuscatlan", "LaLibertad", "Morazan", "LaPaz", "SantaAna", "SanMiguel", "SanSalvador", "SanVicente", "Sonsonate", "LaUnion", "Usulutan" }));
        cbxUbicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedUbicacion(evt);
            }
        });

        txtEdad.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedEdad(evt);
            }
        });

        cbxNombreEmpresa.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbxNombreEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Claro", "Tigo", "Movistar", "Digicel" }));
        cbxNombreEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNombreEmpresaActionPerformed(evt);
            }
        });
        cbxNombreEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedNombreEmpresa(evt);
            }
        });

        txtTelefonoEmpresa.setEditable(false);
        txtTelefonoEmpresa.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtTelefonoEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedTelefonoEmpresa(evt);
            }
        });

        cbxLiquidacion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbxLiquidacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Despido", "Renuncia" }));
        cbxLiquidacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedLiquidacion(evt);
            }
        });

        txtCarnet.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedCarnet(evt);
            }
        });

        cbxPuesto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbxPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Seguridad", "Recepcionista", "Ordenanza" }));
        cbxPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPuestoActionPerformed(evt);
            }
        });
        cbxPuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedPuesto(evt);
            }
        });

        txtSalario.setEditable(false);
        txtSalario.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedSalario(evt);
            }
        });

        txtTelefonoEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtTelefonoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedTelefonoEmpleado(evt);
            }
        });

        tbLiquidaciones.setBackground(new java.awt.Color(0, 0, 0));
        tbLiquidaciones.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tbLiquidaciones.setForeground(new java.awt.Color(102, 153, 0));
        tbLiquidaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empresa", "Telefono", "Ubicacion", "Tipo", "Carnet", "Empleado", "Apellido", "Edad", "Tiempo", "Puesto", "Salario", "Telefono", "Liquidacion", "IVA", "Bono", "Entregados"
            }
        ));
        spLiquidaciones.setViewportView(tbLiquidaciones);

        txtNombreEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedNombreEmpleado(evt);
            }
        });

        txtApellidoEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtApellidoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedApellidoEmpleado(evt);
            }
        });

        btnIngresarDatos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnIngresarDatos.setForeground(new java.awt.Color(0, 153, 102));
        btnIngresarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Liquidaciones/add.png"))); // NOI18N
        btnIngresarDatos.setText("Ingresar Datos");
        btnIngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDatosActionPerformed(evt);
            }
        });
        btnIngresarDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedIngresarDatos(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 153, 102));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Liquidaciones/eliminarico.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        btnEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedEliminar(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 153, 102));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Liquidaciones/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedSalir(evt);
            }
        });

        txtTrabajados.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtTrabajados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrabajadosKeyTypedEdad(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 153, 102));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Liquidaciones/save.png"))); // NOI18N
        btnGuardar.setText("Guardar informacion al txt");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTelefonoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTrabajados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEdadEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblApellidoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCarnetEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLiquidacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEmpresaUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(lblTelefonoEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnIngresarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEdad)
                        .addComponent(cbxUbicacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxNombreEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, 0, 150, Short.MAX_VALUE)
                        .addComponent(txtTelefonoEmpresa)
                        .addComponent(cbxLiquidacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxPuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSalario)
                        .addComponent(txtTelefonoEmpleado)
                        .addComponent(txtNombreEmpleado)
                        .addComponent(txtApellidoEmpleado)
                        .addComponent(txtTrabajados))
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnSalir)
                        .addGap(174, 174, 174)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(spLiquidaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(475, 475, 475)
                .addComponent(lblLiquidaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblLiquidaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefonoEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpresaUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLiquidacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxLiquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarnetEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdadEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTrabajados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTrabajados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(spLiquidaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KeyTypedNombreEmpresa(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedNombreEmpresa

//        //Nombre de la empresa asigna un telefono cuando elige, salida
//        opcion = (String) cbxNombreEmpresa.getSelectedItem();
//        switch (opcion) {
//            case "Claro":
//            double Claro = 72135544;
//            txtTelefonoEmpresa.setText("72135544");
//            break;
//            case "Tigo":
//            double Tigo = 79138045;
//            txtTelefonoEmpresa.setText("79138045");
//            break;
//            case "Digicel":
//            double Digicel = 79138013;
//            txtTelefonoEmpresa.setText("79138013");
//            break;
//            default:
//            double Movistar = 70400393;
//            txtTelefonoEmpresa.setText("70400393");
//            break;
//        }
        
    }//GEN-LAST:event_KeyTypedNombreEmpresa

    private void KeyTypedTelefonoEmpresa(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedTelefonoEmpresa

        // Condicion que nos permite ingresar solo numeros, entrada
        valida = evt.getKeyChar();

        if((valida< '0' || valida> '9') && (valida !=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar numeros");
        }
        
    }//GEN-LAST:event_KeyTypedTelefonoEmpresa

    private void KeyTypedUbicacion(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedUbicacion

       // Condicion que nos permite ingresar solo letras, entrada
        valida = evt.getKeyChar();

        if((valida< 'A' || valida> 'Z') && (valida< 'a' || valida> 'z') && (valida !=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar letras");
        }
        
    }//GEN-LAST:event_KeyTypedUbicacion

    private void KeyTypedLiquidacion(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedLiquidacion

        // Condicion que nos permite ingresar solo letras, entrada
        valida = evt.getKeyChar();

        if((valida< 'A' || valida> 'Z') && (valida< 'a' || valida> 'z') && (valida !=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar letras");
        }
        
    }//GEN-LAST:event_KeyTypedLiquidacion

    private void KeyTypedCarnet(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedCarnet

       // Condicion que nos permite ingresar solo numeros y letras, entrada
        valida = evt.getKeyChar();

        if((valida< 'A' || valida> 'Z') && (valida< 'a' || valida> 'z') && 
           (valida< '0' || valida> '9') &&(valida !=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar numeros y letras");
        } 
        
    }//GEN-LAST:event_KeyTypedCarnet

    private void KeyTypedNombreEmpleado(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedNombreEmpleado

        // Condicion que nos permite ingresar solo letras, entrada
        valida = evt.getKeyChar();

        if((valida< 'A' || valida> 'Z') && (valida< 'a' || valida> 'z') && (valida !=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar letras");
        }
        
    }//GEN-LAST:event_KeyTypedNombreEmpleado

    private void KeyTypedApellidoEmpleado(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedApellidoEmpleado

        // Condicion que nos permite ingresar solo letras, entrada
        valida = evt.getKeyChar();

        if((valida< 'A' || valida> 'Z') && (valida< 'a' || valida> 'z') && (valida !=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar letras");
        }
        
    }//GEN-LAST:event_KeyTypedApellidoEmpleado

    private void KeyTypedEdad(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedEdad

        // Condicion que nos permite ingresar solo numeros, entrada
        valida = evt.getKeyChar();

        if((valida< '0' || valida> '9') && (valida !=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar numeros");
        }
        
    }//GEN-LAST:event_KeyTypedEdad

    private void KeyTypedPuesto(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedPuesto

//        //Puesto asigna un Salario cuando elige, salida
//        opcion = (String) cbxPuesto.getSelectedItem();
//        switch (opcion) {
//            case "Gerente":
//            double Gerente = 800;
//            txtSalario.setText("800");
//            break;
//            case "Seguridad":
//            double Seguridad = 600;
//            txtSalario.setText("600");
//            break;
//            case "Recepcionista":
//            double Recepcionista = 500;
//            txtSalario.setText("500");
//            break;
//            default:
//            double Ordenanza = 400;
//            txtSalario.setText("400");
//            break;
//        }
        
    }//GEN-LAST:event_KeyTypedPuesto

    private void KeyTypedSalario(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedSalario

        // Condicion que nos permite ingresar solo numeros, entrada
        valida = evt.getKeyChar();

        if((valida< '0' || valida> '9') && (valida !=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar numeros");
        }
        
    }//GEN-LAST:event_KeyTypedSalario

    private void KeyTypedTelefonoEmpleado(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedTelefonoEmpleado

        // Condicion que nos permite ingresar solo numeros, entrada
        valida = evt.getKeyChar();

        if((valida< '0' || valida> '9') && (valida !=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar numeros");
        }
        
    }//GEN-LAST:event_KeyTypedTelefonoEmpleado

    private void KeyTypedIngresarDatos(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedIngresarDatos

//        try {
//            //Validar no dejar vacio en el telefono de la empresa y el nombre de la empresa, entrada
//            if (txtTelefonoEmpresa.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(this, "No dejar el campo telefono de la empresa  Vacio",
//                    "Error!", JOptionPane.ERROR_MESSAGE);
//            } else {
//            //Combiertiendo de Int a String
//                empre.setTelefonoEmpresa(Integer.parseInt(txtTelefonoEmpresa.getText()));
//                empre.setNombreEmpresa(cbxNombreEmpresa.getSelectedItem().toString());
//            }
//
//            //Validar no dejar vacio en carnet del empleado y la ubicacion, entrada
//            if (txtCarnet.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(this, "No dejar el campo Carnet  Vacio",
//                    "Error!", JOptionPane.ERROR_MESSAGE);
//            } else {
//                emple.setCarnet(txtCarnet.getText());
//                empre.setUbicacion(cbxUbicacion.getSelectedItem().toString());
//            }
//
//            //Validar no dejar vacio Nombre Empleado y tipo de liquidacion, entrada
//            if (txtNombreEmpleado.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(this, "No dejar el campo Nombre Empleado  Vacio",
//                    "Error!", JOptionPane.ERROR_MESSAGE);
//            } else {
//                emple.setNombre(txtNombreEmpleado.getText());
//                empre.setTipoLiquidacion(cbxLiquidacion.getSelectedItem().toString());
//            }
//
//            //Validar no dejar vacio Apellido Empleado, entrada
//            if (txtApellidoEmpleado.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(this, "No dejar el campo Apellido Empleado  Vacio",
//                    "Error!", JOptionPane.ERROR_MESSAGE);
//            } else {
//                emple.setApellido(txtApellidoEmpleado.getText());
//            }
//            
//            //Validar no dejar vacio en edad del empleado y los años trabajados, entrada
//            if (txtEdad.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(this, "No dejar el campo Edad  Vacio",
//                    "Error!", JOptionPane.ERROR_MESSAGE);
//            } else {
//            //Combiertiendo de Int a String
//                emple.setEdad(Integer.parseInt(txtEdad.getText()));
//            //Combiertiendo de Double a String   
//                empre.setAniosEmpresa(Double.parseDouble(cbxTrabajados.getSelectedItem().toString()));
//            }
//            
//            //Validar no dejar vacio Salario Empleado, entrada
//            if (txtSalario.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(this, "No dejar el campo Salario del Empleado  Vacio",
//                    "Error!", JOptionPane.ERROR_MESSAGE);
//            } else {
//            //Combiertiendo de Double a String   
//                emple.setSalario(Double.parseDouble(txtSalario.getText()));
//            }
//            
//            //Validar no dejar vacio en telefono del empleado, salario y puesto, entrada
//            if (txtTelefonoEmpleado.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(this, "No dejar el campo Telefono del Empleado Vacio",
//                    "Error!", JOptionPane.ERROR_MESSAGE);
//            } else {
//            //Combiertiendo de Int a String
//                emple.setTelefono(Integer.parseInt(txtTelefonoEmpleado.getText())); 
//                empre.setRolTrabajo(cbxPuesto.getSelectedItem().toString());
//            }
//            
//            //Agregar los datos de usuario a la tabla, salida
//            agregarRegistroTabla(empre);
//
//            //Limpiando los cuadros de texto y los combo box
//            } catch (HeadlessException e) {
//            }
//            txtTelefonoEmpresa.setText(null);
//            txtCarnet.setText(null);
//            txtNombreEmpleado.setText(null);
//            txtApellidoEmpleado.setText(null);
//            txtEdad.setText(null);
//            txtSalario.setText(null);
//            txtTelefonoEmpleado.setText(null);
//        
//            //Agregando al array list Liquidacion, salida
//            empresas.add(empre);
        
    }//GEN-LAST:event_KeyTypedIngresarDatos
    
    private void KeyTypedEliminar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedEliminar

//        //Aplicamos codigo para limpiar la tabla, salida
//
//        //Sección 0
//        filaBorrada = tbLiquidaciones.getSelectedRow();
//
//        //Sección 1
//        if (filaBorrada<0){
//            JOptionPane.showMessageDialog(null,"Debe seleccionar una fila de la tabla");
//        }else {
//
//            //Sección 2
//            confirmar = JOptionPane.showConfirmDialog(null,"Esta seguro que desea ¿Eliminar el registro?");
//
//            //Sección 3
//            if(JOptionPane.OK_OPTION == confirmar){
//
//                //Sección 4
//                empres.removeRow(filaBorrada);
//
//                //Sección 5
//                JOptionPane.showMessageDialog(null,"Registro eliminado" );
//            }
//        }
        
    }//GEN-LAST:event_KeyTypedEliminar

    private void KeyTypedSalir(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedSalir

//        //Para salir del sistema, salida
//        salir = JOptionPane.YES_NO_OPTION;
//        elige = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "Salir", salir);
//        if(elige == 0){
//            System.exit(0);
//        }
        
    }//GEN-LAST:event_KeyTypedSalir

    private void cbxNombreEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNombreEmpresaActionPerformed
        
        //Nombre de la empresa asigna un telefono cuando elige, salida
        opcion = (String) cbxNombreEmpresa.getSelectedItem();
        switch (opcion) {
            case "Claro":
            double Claro = 72135544;
            txtTelefonoEmpresa.setText("72135544");
            break;
            case "Tigo":
            double Tigo = 79138045;
            txtTelefonoEmpresa.setText("79138045");
            break;
            case "Digicel":
            double Digicel = 79138013;
            txtTelefonoEmpresa.setText("79138013");
            break;
            default:
            double Movistar = 70400393;
            txtTelefonoEmpresa.setText("70400393");
            break;
        }
        
    }//GEN-LAST:event_cbxNombreEmpresaActionPerformed

    private void cbxPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPuestoActionPerformed

        //Puesto asigna un Salario cuando elige, salida
        opcion = (String) cbxPuesto.getSelectedItem();
        switch (opcion) {
            case "Gerente":
            double Gerente = 800;
            txtSalario.setText("800");
            break;
            case "Seguridad":
            double Seguridad = 600;
            txtSalario.setText("600");
            break;
            case "Recepcionista":
            double Recepcionista = 500;
            txtSalario.setText("500");
            break;
            default:
            double Ordenanza = 400;
            txtSalario.setText("400");
            break;
        }
        
    }//GEN-LAST:event_cbxPuestoActionPerformed

    private void btnIngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDatosActionPerformed

        try {
            //Validar no dejar vacio en el telefono de la empresa y el nombre de la empresa, entrada
            if (txtTelefonoEmpresa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No dejar el campo telefono de la empresa  Vacio",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
            //Combiertiendo de Int a String
                empre.setTelefonoEmpresa(Integer.parseInt(txtTelefonoEmpresa.getText()));
                empre.setNombreEmpresa(cbxNombreEmpresa.getSelectedItem().toString());
            }

            //Validar no dejar vacio en carnet del empleado y la ubicacion, entrada
            if (txtCarnet.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No dejar el campo Carnet  Vacio",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                emple.setCarnet(txtCarnet.getText());
                empre.setUbicacion(cbxUbicacion.getSelectedItem().toString());
            }

            //Validar no dejar vacio Nombre Empleado y tipo de liquidacion, entrada
            if (txtNombreEmpleado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No dejar el campo Nombre Empleado  Vacio",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                emple.setNombre(txtNombreEmpleado.getText());
                empre.setTipoLiquidacion(cbxLiquidacion.getSelectedItem().toString());
            }

            //Validar no dejar vacio Apellido Empleado, entrada
            if (txtApellidoEmpleado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No dejar el campo Apellido Empleado  Vacio",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                emple.setApellido(txtApellidoEmpleado.getText());
            }
            
            //Validar no dejar vacio en edad del empleado, entrada
            if (txtEdad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No dejar el campo Edad  Vacio",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
            //Combiertiendo de Int a String
                emple.setEdad(Integer.parseInt(txtEdad.getText()));
            }
            
            //Validar no dejar vacio los años trabajados del empleado, entrada
            if (txtTrabajados.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No dejar el campo años trabajados  Vacio",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
            //Combiertiendo de Double a String   
               empre.setAniosEmpresa(Double.parseDouble(txtTrabajados.getText()));
            }
            
            //Validar no dejar vacio Salario Empleado, entrada
            if (txtSalario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No dejar el campo Salario del Empleado  Vacio",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
            //Combiertiendo de Double a String   
                empre.setSalario(Double.parseDouble(txtSalario.getText()));
            }
            
            //Validar no dejar vacio en telefono del empleado, salario y puesto, entrada
            if (txtTelefonoEmpleado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No dejar el campo Telefono del Empleado Vacio",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
            //Combiertiendo de Int a String
                emple.setTelefono(Integer.parseInt(txtTelefonoEmpleado.getText())); 
                empre.setRolTrabajo(cbxPuesto.getSelectedItem().toString());
            }
            
            //Agregar los datos de usuario a la tabla, salida
            agregarRegistroTabla(empre, emple);

            //Limpiando los cuadros de texto y los combo box
            } catch (HeadlessException e) {
            }
            txtTelefonoEmpresa.setText(null);
            txtCarnet.setText(null);
            txtNombreEmpleado.setText(null);
            txtApellidoEmpleado.setText(null);
            txtEdad.setText(null);
            txtTrabajados.setText(null);
            txtSalario.setText(null);
            txtTelefonoEmpleado.setText(null);
        
            //Agregando al array list Liquidacion, salida
            empresas.add(empre);
        
    }//GEN-LAST:event_btnIngresarDatosActionPerformed

     //Metodo agregar registro a la tabla, salida
            private void  agregarRegistroTabla(Empresa empresa, Empleado empleado){
            try {
                
            //Se obtiene el modelo del control tabla del formulario
                empres = (DefaultTableModel) tbLiquidaciones.getModel();
                tbLiquidaciones.setModel(empres);
                
            //se debe hace un objeto con el numero de columnas de la tabla
                Object[] columna = new Object[16];
                
            //Se debe llenar cada datos de las columnas de la tabla, salida
                columna[0]= empresa.getNombreEmpresa();
                columna[1]= empresa.getTelefonoEmpresa();
                columna[2]= empresa.getUbicacion();
                columna[3]= empresa.getTipoLiquidacion();
                columna[4]= empleado.getCarnet();
                columna[5]= empleado.getNombre();
                columna[6]= empleado.getApellido();
                columna[7]= empleado.getEdad();
                columna[8]= empresa.getAniosEmpresa();
                columna[9]= empresa.getRolTrabajo();
                columna[10]= empresa.getSalario();
                columna[11]= empleado.getTelefono();
                columna[12]= "$" + empresa.CalcularLiquidacion(empresa.getAniosEmpresa(), empresa.getSalario(), 
                          empresa.getLiquidacion());
                columna[13]= "$" + empresa.CalcularIva(empresa.getLiquidacionCalculada(), empresa.getIva());
                columna[14]= "$" + empresa.CalcularPago(empresa.getLiquidacionCalculada(), empresa.getIvaCalculado());
                columna[15]= "$" + empresa.CalcularBonos(empresa.getPago());

            empres.addRow(columna);
 
        JOptionPane.showMessageDialog(null, "Datos Ingresados");
        }catch(HeadlessException e) {
        JOptionPane.showMessageDialog(null, "Error");
    }
        }
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

         //Aplicamos codigo para limpiar la tabla, salida

        //Sección 0
        filaBorrada = tbLiquidaciones.getSelectedRow();

        //Sección 1
        if (filaBorrada<0){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una fila de la tabla");
        }else {

            //Sección 2
            confirmar = JOptionPane.showConfirmDialog(null,"Esta seguro que desea ¿Eliminar el registro?");

            //Sección 3
            if(JOptionPane.OK_OPTION == confirmar){

                //Sección 4
                empres.removeRow(filaBorrada);

                //Sección 5
                JOptionPane.showMessageDialog(null,"Registro eliminado" );
            }
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        //Para salir del sistema, salida
        salir = JOptionPane.YES_NO_OPTION;
        elige = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "Salir", salir);
        if(elige == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtTrabajadosKeyTypedEdad(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrabajadosKeyTypedEdad

        // Condicion que nos permite ingresar solo numeros, entrada
        valida = evt.getKeyChar();
        
        if((valida< '0' || valida> '9') && (valida< '.')  && (valida !=(char)KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite ingresar numeros: " + valida);
        }
        
    }//GEN-LAST:event_txtTrabajadosKeyTypedEdad

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

//        try{
//            try (FileWriter guardar = new FileWriter("C:\\Users\\Racso\\Desktop\\ProyectoESD115v5\\build\\archivo")) {
//                for(int i = 0; i < this.tbLiquidaciones.getRowCount(); i++) {
//                }   }
//        JOptionPane.showMessageDialog(null, "Datos guardados");
//        }catch(HeadlessException | IOException e) {
//        JOptionPane.showMessageDialog(null, "Error");
//    }
        
try {
            String proyecto = "C:\\Users\\Racso\\Desktop\\ProyectoESD115v5\\src";
    try (BufferedWriter prueba = new BufferedWriter(new FileWriter(proyecto ))) {
        for (int i = 0; i < tbLiquidaciones.getRowCount(); i++) //realiza un barrido por filas.
        {
            for(int j = 0 ; j < tbLiquidaciones.getColumnCount();j++) //realiza un barrido por columnas.
            {
                prueba.write((String)(tbLiquidaciones.getValueAt(i,j)));
                if (j < tbLiquidaciones.getColumnCount() -1) { //agrega separador "," si no es el ultimo elemento de la fila.
                    prueba.write(",");
                }
            }
            prueba.newLine(); //inserta nueva linea.
        }
        //cierra archivo!
    }
            JOptionPane.showMessageDialog(null, "El archivo fue salvado correctamente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR: Ocurrio un problema al salvar el archivo");
        }
    

    }//GEN-LAST:event_btnGuardarActionPerformed
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLiquidaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new frmLiquidaciones().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIngresarDatos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxLiquidacion;
    private javax.swing.JComboBox<String> cbxNombreEmpresa;
    private javax.swing.JComboBox<String> cbxPuesto;
    private javax.swing.JComboBox<String> cbxUbicacion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellidoEmpleado;
    private javax.swing.JLabel lblCarnetEmpleado;
    private javax.swing.JLabel lblEdadEmpleado;
    private javax.swing.JLabel lblEmpresaUbicacion;
    private javax.swing.JLabel lblLiquidacion;
    private javax.swing.JLabel lblLiquidaciones;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTelefonoEmpleado;
    private javax.swing.JLabel lblTelefonoEmpresa;
    private javax.swing.JLabel lblTrabajados;
    private javax.swing.JScrollPane spLiquidaciones;
    private javax.swing.JTable tbLiquidaciones;
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefonoEmpleado;
    private javax.swing.JTextField txtTelefonoEmpresa;
    private javax.swing.JTextField txtTrabajados;
    // End of variables declaration//GEN-END:variables
}
