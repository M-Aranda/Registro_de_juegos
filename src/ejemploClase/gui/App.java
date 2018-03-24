package ejemploClase.gui;

import ejemploClase.model.Consola;
import ejemploClase.model.Juego;
import ejemploClase.model.TMJuegos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.plaf.TableHeaderUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;

/**
 *
 * @author prez
 */
public class App extends javax.swing.JFrame {

    private List<Consola> consolas;
    private List<Juego> juegos;
    private int sumaPrecios;
    private TMJuegos model;

    public App() {
        initComponents();

        setTitle("Play games!");
        setLocationRelativeTo(null);

        juegos = new ArrayList<>();
        sumaPrecios = 0;
        initConsolas();
        lblSuma.setText("[$0]");

        String header[] = {"ID", "Nombre", "Consola", "Estado", "Precio", "Stock", "Categoria"};

        for (int i = 0; i < tblInfo.getColumnCount(); i++) {
            TableColumn column1 = tblInfo.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue(header[i]);

        }

        cargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpEstado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        chkSimulador = new javax.swing.JCheckBox();
        chkTerror = new javax.swing.JCheckBox();
        chkIndie = new javax.swing.JCheckBox();
        chkRpg = new javax.swing.JCheckBox();
        txtNombre = new javax.swing.JTextField();
        txtStock = new javax.swing.JSpinner();
        opFisico = new javax.swing.JRadioButton();
        opDigital = new javax.swing.JRadioButton();
        cboConsola = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        chkSurvival = new javax.swing.JCheckBox();
        chkAutos = new javax.swing.JCheckBox();
        chkFutbol = new javax.swing.JCheckBox();
        chkSandbox = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        lblSuma = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de juego"));

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Stock:");

        jLabel4.setText("Estado:");

        jLabel5.setText("Consola:");

        jLabel7.setText("Categoría:");

        chkSimulador.setText("Simulador");

        chkTerror.setText("Terror");

        chkIndie.setText("Indie");

        chkRpg.setText("RPG");

        txtStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        grpEstado.add(opFisico);
        opFisico.setText("Físico");

        grpEstado.add(opDigital);
        opDigital.setSelected(true);
        opDigital.setText("Digital");

        cboConsola.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Precio:");

        chkSurvival.setText("Survival");

        chkAutos.setText("Autos");

        chkFutbol.setText("Futbol");

        chkSandbox.setText("Sandbox");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboConsola, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtId)
                    .addComponent(txtStock)
                    .addComponent(txtPrecio)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opDigital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opFisico)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkSimulador)
                            .addComponent(chkTerror, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSurvival, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkIndie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkSandbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkAutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkRpg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opDigital)
                        .addComponent(opFisico))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkSimulador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTerror)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkFutbol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkSurvival))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkIndie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkRpg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkSandbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAutos)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblSuma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSuma.setText("[suma precios]");

        tblInfo.getTableHeader().setReorderingAllowed(false);
        tblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblInfoMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblInfo);
        tblInfo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String titulo_error = "Error!";
        String msg_error = "Verifique que todos los campos tengan algo y que el id y precio tengan solo numeros positivos enteros";
        int tipo_msg = JOptionPane.ERROR_MESSAGE;

        try {

            Juego j = new Juego();

            String estado;

            j.setId(Integer.parseInt(txtId.getText()));
            j.setNombre(txtNombre.getText());

            // algoritmo para consola (jcombobox)
            Consola c = (Consola) cboConsola.getSelectedItem();
            j.setConsola(c);
            // algoritmo para consola

            j.setDigital(opDigital.isSelected());
            if (opDigital.isSelected()) {
                estado = "Digital";

            } else {
                estado = "Fisico";
            }

            j.setPrecio(Integer.parseInt(txtPrecio.getText()));

            // algoritmo para el stock (jspinner)
            String strStock = txtStock.getValue().toString();
            int stock = Integer.parseInt(strStock);
            j.setStock(stock);
            // algoritmo para el stock (jspinner)

            List<String> categorias = new ArrayList<>();

            if (chkAutos.isSelected()) {
                categorias.add("Autos");
            }
            if (chkFutbol.isSelected()) {
                categorias.add("Futbol");
            }
            if (chkIndie.isSelected()) {
                categorias.add("Indie");
            }
            if (chkRpg.isSelected()) {
                categorias.add("RPG");
            }
            if (chkSandbox.isSelected()) {
                categorias.add("Sandbox");
            }
            if (chkSimulador.isSelected()) {
                categorias.add("Simulador");
            }
            if (chkSurvival.isSelected()) {
                categorias.add("Survival");
            }
            if (chkTerror.isSelected()) {
                categorias.add("Terror");
            }

            j.setCategorias(categorias);
//Las siguientes 12 lineas son para agregar registros a la tabla
//        DefaultTableModel model = (DefaultTableModel) tblInfo.getModel();
//        Object registro[] = new Object[tblInfo.getColumnCount()];
//        registro[0] = j.getId();
//        registro[1] = j.getNombre();
//        registro[2] = j.getConsola();
//        registro[3] = estado;
//        registro[4] = j.getPrecio();
//        registro[5] = j.getStock();
//        registro[6] = j.getCategorias();
//        model.addRow(registro);

            juegos.add(j);

            // limpiar formulario
            txtId.setText("");
            txtNombre.setText("");
            cboConsola.setSelectedIndex(0);
            opDigital.setSelected(true);
            txtPrecio.setText("");
            txtStock.setValue(0);
            chkAutos.setSelected(false);
            chkFutbol.setSelected(false);
            chkIndie.setSelected(false);
            chkRpg.setSelected(false);
            chkSandbox.setSelected(false);
            chkSimulador.setSelected(false);
            chkSurvival.setSelected(false);
            chkTerror.setSelected(false);
            // limpiar formulario

            txtId.requestFocus();

            // algoritmo para sumar los precios
            // 1000 --> 100 --> 100000
            // 5000 --> 4   --> 20000 --> 120000
            int total = j.getPrecio() * j.getStock();
            sumaPrecios += total;
            lblSuma.setText("[$" + sumaPrecios + "]");
            // algoritmo para sumar los precios

            // Algoritmo para colocar una lista en una lista gráfica
//        listaJuegos.setModel(new ListModel<String>() {
//            @Override
//            public int getSize() {
//                return juegos.size();
//            }
//
//            @Override
//            public String getElementAt(int index) {
//                return juegos.get(index).toString();
//            }
//
//            @Override
//            public void addListDataListener(ListDataListener l) {
//            }
//
//            @Override
//            public void removeListDataListener(ListDataListener l) {
//            }
//        });
            // Algoritmo para colocar una lista en una lista gráfica
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, msg_error, titulo_error, tipo_msg);
        }
        cargarTabla();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tblInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInfoMouseReleased
        if (evt.getClickCount() == 2) {
            System.out.println("DBL CLICK");

            Object o = tblInfo.getValueAt(tblInfo.getSelectedRow(), tblInfo.getSelectedColumn());

            if (tblInfo.getSelectedColumn() == 0) {
                int id = (int) o;
                System.out.println(id);
            }

        }
    }//GEN-LAST:event_tblInfoMouseReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboConsola;
    private javax.swing.JCheckBox chkAutos;
    private javax.swing.JCheckBox chkFutbol;
    private javax.swing.JCheckBox chkIndie;
    private javax.swing.JCheckBox chkRpg;
    private javax.swing.JCheckBox chkSandbox;
    private javax.swing.JCheckBox chkSimulador;
    private javax.swing.JCheckBox chkSurvival;
    private javax.swing.JCheckBox chkTerror;
    private javax.swing.ButtonGroup grpEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSuma;
    private javax.swing.JRadioButton opDigital;
    private javax.swing.JRadioButton opFisico;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JSpinner txtStock;
    // End of variables declaration//GEN-END:variables

    private void initConsolas() {
        consolas = new ArrayList<>();

        consolas.add(new Consola(1, "PC"));
        consolas.add(new Consola(2, "Play Station 4"));
        consolas.add(new Consola(3, "XBOX One"));

        cboConsola.removeAllItems();

        for (Consola consola : consolas) {
            cboConsola.addItem(consola);
        }
    }

    private void cargarTabla() {
        model = new TMJuegos(juegos);
        tblInfo.setModel(model);
    }

}
