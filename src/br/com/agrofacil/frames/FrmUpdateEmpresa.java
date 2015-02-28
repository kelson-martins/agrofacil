package br.com.agrofacil.frames;


import br.com.agrofacil.dao.EmpresaDAO;
import br.com.agrofacil.dao.MunicipioDAO;
import br.com.agrofacil.entity.Empresa;
import br.com.agrofacil.entity.Municipio;
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
public class FrmUpdateEmpresa extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    private final EmpresaDAO dao;
    private final FrmEmpresa control;
    private Empresa empresa;
    private final MunicipioDAO municipioDAO = new MunicipioDAO();
    
    public FrmUpdateEmpresa(javax.swing.JDesktopPane parent, boolean modal,EmpresaDAO dao, Empresa empresa, FrmEmpresa control) throws SQLException {             
        this.dao = dao;
        this.control = control;
        this.empresa = empresa;
        this.setTitle("Atualizar Empresa");
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
        txtEndereco = new javax.swing.JTextField();
        lblDescricao2 = new javax.swing.JLabel();
        lblDescricao3 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        lblDescricao4 = new javax.swing.JLabel();
        txtCpfCnpj = new javax.swing.JFormattedTextField();
        lblDescricao5 = new javax.swing.JLabel();
        txtInscEst = new javax.swing.JFormattedTextField();
        lblDescricao6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblDescricao7 = new javax.swing.JLabel();
        txtFax = new javax.swing.JFormattedTextField();
        lblDescricao8 = new javax.swing.JLabel();
        lblDescricao9 = new javax.swing.JLabel();
        cbAtiva = new javax.swing.JComboBox();
        txtRazao = new javax.swing.JTextField();

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

        lblDescricao1.setText("Municipio");

        btnProducrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrarActionPerformed(evt);
            }
        });

        lblDescricao2.setText("Endereco");

        lblDescricao3.setText("CEP");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDescricao4.setText("CPF/CNPJ");

        try {
            txtCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDescricao5.setText("Inscricao Est");

        try {
            txtInscEst.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDescricao6.setText("Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDescricao7.setText("Fax");

        try {
            txtFax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDescricao8.setText("Razao Social");

        lblDescricao9.setText("Ativa ?");

        cbAtiva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Nao" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btOk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancel)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricao)
                                    .addComponent(lblDescricao1)
                                    .addComponent(lblDescricao3)
                                    .addComponent(lblDescricao7))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescricao)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnProducrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(lblDescricao2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEndereco))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtFax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(txtCep, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblDescricao4)
                                                .addGap(30, 30, 30)
                                                .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblDescricao5)
                                                .addGap(16, 16, 16)
                                                .addComponent(txtInscEst, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblDescricao6)
                                                .addGap(16, 16, 16)
                                                .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblDescricao8)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtRazao))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDescricao9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProducrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDescricao1)
                        .addComponent(lblDescricao2)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao3)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao4)
                    .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao5)
                    .addComponent(txtInscEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao6)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao7)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao8)
                    .addComponent(txtRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao9)
                    .addComponent(cbAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        try {

            empresa.setDescricao(txtDescricao.getText());
            empresa.setMunicipio((Municipio)cbMunicipio.getSelectedItem());
            empresa.setCep(txtCep.getText());
            empresa.setCgc(txtCpfCnpj.getText());
            empresa.setFax(txtFax.getText());
            empresa.setEndereco(txtEndereco.getText());
            empresa.setInscricaoEstadual(txtInscEst.getText());
            empresa.setRazaoSocial(txtRazao.getText());
            empresa.setTelefone(txtTelefone.getText());            
            
            if (cbAtiva.getSelectedIndex() == 0) {
                empresa.setAtiva(true);
            } else {
                empresa.setAtiva(false);
            }
            
            dao.updateEmpresa(empresa);

            int result = JOptionPane.showConfirmDialog(this, "Você Tem Certeza ??","Atualizar Empresa",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(result != 0) {
                return;
            }
            control.loadInitialData();
            setVisible(false);
        } catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao Atualizar Empresa "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed

    private void btnProducrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrarActionPerformed
        FrmPesquisaMunicipio dialog = new FrmPesquisaMunicipio(cbMunicipio);         
        dialog.setAlwaysOnTop(true);
        dialog.setModal(true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnProducrarActionPerformed

private void initMyComponents() throws SQLException {  
    this.btOk.setIcon(new ImageIcon("icons/check16.png"));
    this.btCancel.setIcon(new ImageIcon("icons/cancel16.png"));
    
   List<Municipio> municipio = new MunicipioDAO().getAllMunicipio();
   DefaultComboBoxModel dcbm = new DefaultComboBoxModel(new Vector<Municipio>(municipio));
   cbMunicipio.setModel(dcbm);
   cbMunicipio.setSelectedItem((Municipio)empresa.getMunicipio());
   txtDescricao.setText(empresa.getDescricao());
   txtEndereco.setText(empresa.getEndereco());
   txtCep.setText(empresa.getCep());
   txtCpfCnpj.setText(empresa.getCgc());
   txtInscEst.setText(empresa.getInscricaoEstadual());
   txtTelefone.setText(empresa.getTelefone());
   txtFax.setText(empresa.getFax());
   txtRazao.setText(empresa.getRazaoSocial());
   
    if(empresa.isAtiva()) {
         cbAtiva.setSelectedIndex(0);
    } else {
        cbAtiva.setSelectedIndex(1);
    }
           
}    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btnProducrar;
    private javax.swing.JComboBox cbAtiva;
    private javax.swing.JComboBox cbMunicipio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricao1;
    private javax.swing.JLabel lblDescricao2;
    private javax.swing.JLabel lblDescricao3;
    private javax.swing.JLabel lblDescricao4;
    private javax.swing.JLabel lblDescricao5;
    private javax.swing.JLabel lblDescricao6;
    private javax.swing.JLabel lblDescricao7;
    private javax.swing.JLabel lblDescricao8;
    private javax.swing.JLabel lblDescricao9;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JFormattedTextField txtCpfCnpj;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtFax;
    private javax.swing.JFormattedTextField txtInscEst;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
