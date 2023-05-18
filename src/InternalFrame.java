
import java.awt.Color;
import static java.awt.Color.red;
import java.beans.PropertyVetoException;
import static java.util.Locale.filter;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;


public class InternalFrame extends javax.swing.JInternalFrame {
    public Color color;
    public File file;
    public InternalFrame() throws PropertyVetoException {
        initComponents();
        setSize(600, 400);
        setDefaultCloseOperation(InternalFrame.EXIT_ON_CLOSE);
         setMaximum(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        grupo2 = new javax.swing.ButtonGroup();
        grupo3 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnaparencia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnarquivos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        cbRuby = new javax.swing.JCheckBox();
        cbJava = new javax.swing.JCheckBox();
        cbPython = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        fJava = new javax.swing.JRadioButton();
        mRuby = new javax.swing.JRadioButton();
        dRuby = new javax.swing.JRadioButton();
        mJava = new javax.swing.JRadioButton();
        dJava = new javax.swing.JRadioButton();
        dPython = new javax.swing.JRadioButton();
        fRuby = new javax.swing.JRadioButton();
        mPython = new javax.swing.JRadioButton();
        fPython = new javax.swing.JRadioButton();
        btnToggle = new javax.swing.JToggleButton();

        setTitle("Paleta de cores e arquivos");
        setPreferredSize(new java.awt.Dimension(385, 276));

        jDesktopPane1.setBackground(new java.awt.Color(0, 0, 0));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(385, 276));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setPreferredSize(new java.awt.Dimension(375, 276));

        btnaparencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnaparencia.setText("Aparência");
        btnaparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaparenciaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mude a aparência:");

        btnarquivos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnarquivos.setText("Arquivos");
        btnarquivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarquivosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Acessar arquivos:");

        btnOK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOK.setText("Ok");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        cbRuby.setText("Ruby");

        cbJava.setText("Java");

        cbPython.setText("Python");

        jLabel3.setText("Selecione algumas opções:");

        grupo.add(fJava);
        fJava.setText("Difícil");

        grupo2.add(mRuby);
        mRuby.setText("Médio");

        grupo2.add(dRuby);
        dRuby.setText("Difícil");

        grupo.add(mJava);
        mJava.setText("Muito difícil");

        grupo.add(dJava);
        dJava.setText("Impossível");

        grupo3.add(dPython);
        dPython.setText("Difícil");

        grupo2.add(fRuby);
        fRuby.setText("Fácil");

        grupo3.add(mPython);
        mPython.setText("Médio");

        grupo3.add(fPython);
        fPython.setText("Fácil");

        btnToggle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnToggle.setText("Limpar tudo");
        btnToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnaparencia, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(btnarquivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRuby)
                                    .addComponent(cbJava)
                                    .addComponent(cbPython))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fJava)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mJava)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dJava))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fPython)
                                            .addComponent(fRuby))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(mRuby)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dRuby))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(mPython)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dPython))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnOK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnToggle)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnaparencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnarquivos)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbJava)
                            .addComponent(fJava)
                            .addComponent(mJava)
                            .addComponent(dJava))
                        .addGap(6, 6, 6)
                        .addComponent(cbRuby))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mRuby)
                        .addComponent(fRuby, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dRuby)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPython)
                    .addComponent(dPython)
                    .addComponent(mPython, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fPython, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOK)
                    .addComponent(btnToggle))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnarquivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarquivosActionPerformed
        JFileChooser  fc = new  JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Selecione apenas imagens", "jpg", "png");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.showOpenDialog(this);
        java.io.File f = fc.getSelectedFile();
        fc.setFileFilter(filter);
        
        int retorno = fc.showOpenDialog(null);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            JOptionPane.showMessageDialog(null,fc.getSelectedFile().getAbsolutePath());
        }
        else{
            JOptionPane.showInputDialog("Nennhum arquivo selecionado");
        }

    }//GEN-LAST:event_btnarquivosActionPerformed

    private void btnaparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaparenciaActionPerformed
        color = color.black;
        color = JColorChooser.showDialog(this, "Selecione uma cor", color);
        if(color == null){
            color = color.WHITE;

            jPanel1.setBackground(color);
        }
        jPanel1.setBackground(color);
    }//GEN-LAST:event_btnaparenciaActionPerformed

    private void enquete(){
        String texto = "";
        if(cbJava.isSelected()){
            texto += "Java\n";
        }
        if(cbRuby.isSelected()){
            texto += "Ruby\n";
        }
        if(cbPython.isSelected()){
            texto += "Python\n";
        }
        JOptionPane.showMessageDialog(null, "Linguagens escolhidas: \n" +  texto);
    }

    private void nivel(){
        String dificuldade = "";
        if(fJava.isSelected()){
            dificuldade += "Difícil\n";
        }
        else if(mJava.isSelected()){
            dificuldade += "Muito difícil\n";
        }
        else if(dJava.isSelected()){
            dificuldade += "Impossível\n";
        }
        else{
            dificuldade += "Não escolhida\n";
        }
        if(fRuby.isSelected()){
            dificuldade += "Fácil\n";
        }
        else if(mRuby.isSelected()){
            dificuldade += "Médio\n";
        }
        else if(dRuby.isSelected()){
            dificuldade += "Difícil\n";
        }
        else{
            dificuldade += "Não escolhida\n";
        }
        if(fPython.isSelected()){
            dificuldade += "Fácil\n";
        }
        else if(mPython.isSelected()){
            dificuldade += "Médio\n";
        }
        else if(dPython.isSelected()){
            dificuldade += "Difícil\n";
        }
        else{
            dificuldade += "Não escolhida\n";
        }
        JOptionPane.showMessageDialog(null, "Dificuldades escolhidas: \n" + dificuldade);
    }
    
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        enquete();
        nivel();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToggleActionPerformed
        if(btnToggle.isSelected()){
            grupo.clearSelection();
            grupo2.clearSelection();
            grupo3.clearSelection();
            cbJava.setSelected(false);
            cbRuby.setSelected(false);
            cbPython.setSelected(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "A opção está desativada.");
        }
    }//GEN-LAST:event_btnToggleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JToggleButton btnToggle;
    private javax.swing.JButton btnaparencia;
    private javax.swing.JButton btnarquivos;
    private javax.swing.JCheckBox cbJava;
    private javax.swing.JCheckBox cbPython;
    private javax.swing.JCheckBox cbRuby;
    private javax.swing.JRadioButton dJava;
    private javax.swing.JRadioButton dPython;
    private javax.swing.JRadioButton dRuby;
    private javax.swing.JRadioButton fJava;
    private javax.swing.JRadioButton fPython;
    private javax.swing.JRadioButton fRuby;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.ButtonGroup grupo2;
    private javax.swing.ButtonGroup grupo3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton mJava;
    private javax.swing.JRadioButton mPython;
    private javax.swing.JRadioButton mRuby;
    // End of variables declaration//GEN-END:variables

    private static class choose {

        private static boolean setVisible;

        public choose() {
         
        }
    }
}
