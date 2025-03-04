package br.com.agrofacil.frames;


import br.com.agrofacil.dao.MunicipioDAO;
import br.com.agrofacil.dao.UnidadeIndustrialDAO;
import br.com.agrofacil.entity.Municipio;
import br.com.agrofacil.entity.UnidadeIndustrial;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kelson
 */
public class FrmUpdateUnidadeIndustrial extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    private final UnidadeIndustrialDAO dao;
    private final FrmUnidadeIndustrial control;
    private final MunicipioDAO municipioDAO = new MunicipioDAO();
    private UnidadeIndustrial unidadeInd = null;
    
    public FrmUpdateUnidadeIndustrial(javax.swing.JDesktopPane parent, boolean modal,UnidadeIndustrialDAO dao, UnidadeIndustrial unidadeInd, FrmUnidadeIndustrial control) throws SQLException {             
        this.dao = dao;
        this.unidadeInd = unidadeInd;
        this.control = control;
        this.setTitle("Atualizar Unidade Industrial");
        initComponents();
        initMyComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        cbMunicipio = new javax.swing.JComboBox();
        lblDescricao1 = new javax.swing.JLabel();
        btnProducrar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 249));

        lblDescricao.setText("Descrição");

        btOk.setText("Atualizar");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btCancel.setText("Cancelar");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        lblDescricao1.setText("Município");

        btnProducrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(lblDescricao1))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnProducrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 246, Short.MAX_VALUE)))))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao1)
                    .addComponent(btnProducrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancel)
                    .addComponent(btOk))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
       
       int result = JOptionPane.showConfirmDialog(this, "Você Tem Certeza ??","Atualizar Unidade Industrial",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
       
       if(result != 0) {
          return;
       }
            
        try {
            UnidadeIndustrial unidadeIndustrial = new UnidadeIndustrial();

            unidadeIndustrial.setId(unidadeInd.getId());
            unidadeIndustrial.setDescricao(txtDescricao.getText());
            unidadeIndustrial.setMunicipio( (Municipio)cbMunicipio.getSelectedItem());

            dao.updateUnidadeIndustrial(unidadeIndustrial);
            control.loadInitialData();
        } catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao Atualizar Unidade Industrial "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        setVisible(false);
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed

    private void btnProducrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrarActionPerformed
        FrmPesquisaMunicipio dialog = new FrmPesquisaMunicipio(cbMunicipio);         
    }//GEN-LAST:event_btnProducrarActionPerformed

private void initMyComponents() throws SQLException {  

   this.btOk.setIcon(new ImageIcon("icons/check16.png"));
   this.btCancel.setIcon(new ImageIcon("icons/cancel16.png"));
   
   List<Municipio> municipios = new MunicipioDAO().getAllMunicipio();
   DefaultComboBoxModel dcbm = new DefaultComboBoxModel(new Vector<Municipio>(municipios));
   txtDescricao.setText(unidadeInd.getDescricao());   
   cbMunicipio.setModel(dcbm);   
   cbMunicipio.setSelectedItem(unidadeInd.getMunicipio());
   
}    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btnProducrar;
    private javax.swing.JComboBox cbMunicipio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricao1;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
