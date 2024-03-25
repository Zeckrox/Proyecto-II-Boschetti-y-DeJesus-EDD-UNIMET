package GUI;

import Estructuras.HashTable;
import logic.Habitacion;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class InfoCliente extends javax.swing.JFrame {

    HashTable tablaClientes;
    Habitacion infoHab;

    public InfoCliente(Habitacion info, HashTable tablaClient) {
        initComponents();
        tablaClientes = tablaClient;
        infoHab = info;
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        hab.setText(String.format("Habitacion #%s", info.numHab));
        habInfo.setText(String.format("Piso: %d | Habitacion %s", info.piso, info.tipoHab));
        cliente.setText(info.cliente.nombre + " " + info.cliente.apellido);
        email.setText(info.cliente.email);
        gender.setText(info.cliente.genero);
        phone.setText(info.cliente.telefono);
        arrival.setText(info.cliente.llegada);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hab = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cliente = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        arrival = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        habInfo = new javax.swing.JLabel();
        checkoutBtn = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        hab.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        hab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hab.setText("Habitacion ##");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel2.setText("Cliente:");

        cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cliente.setText("John Doe Jimenez");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setText("johndoe@email.com");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel5.setText("Email:");

        gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gender.setText("male");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel7.setText("Genero:");

        phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone.setText("041412345678");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel9.setText("Telefono:");

        arrival.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        arrival.setText("09/07/2023");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel11.setText("Fecha de llegada:");

        habInfo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        habInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        habInfo.setText("Piso: 1 | Habitacion simple");

        checkoutBtn.setText("CheckOut");
        checkoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtnActionPerformed(evt);
            }
        });

        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arrival, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hab)
                .addGap(0, 0, 0)
                .addComponent(habInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(gender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(phone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(arrival)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutBtn)
                    .addComponent(back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        CheckOut checkoutWindow = new CheckOut(infoHab, tablaClientes);
        checkoutWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_checkoutBtnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrival;
    private javax.swing.JButton back;
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel hab;
    private javax.swing.JLabel habInfo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel phone;
    // End of variables declaration//GEN-END:variables
}