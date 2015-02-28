package br.com.agrofacil.frames;


import br.com.agrofacil.dao.CentroCustoDAO;
import br.com.agrofacil.dao.ComposicaoDAO;
import br.com.agrofacil.dao.EquipamentoDAO;
import br.com.agrofacil.dao.FrenteTransporteDAO;
import br.com.agrofacil.dao.MunicipioDAO;
import br.com.agrofacil.entity.CentroCusto;
import br.com.agrofacil.entity.Composicao;
import br.com.agrofacil.entity.Equipamento;
import br.com.agrofacil.entity.FrenteTransporte;
import br.com.agrofacil.entity.Municipio;
import br.com.agrofacil.entity.UnidadeFederativa;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
public class FrmAddEquipamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    private final EquipamentoDAO dao;
    private final FrmEquipamento control;
    private final CentroCustoDAO  centroCustoDAO = new CentroCustoDAO();
    private final FrenteTransporteDAO frenteDAO = new FrenteTransporteDAO();
    private final ComposicaoDAO composicaoDAO = new ComposicaoDAO();
    
    public FrmAddEquipamento(javax.swing.JDesktopPane parent, boolean modal,EquipamentoDAO dao, FrmEquipamento control) throws SQLException {             
        this.dao = dao;
        this.control = control;
        this.setTitle("Adicionar Equipamento");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        cbCentroCusto = new javax.swing.JComboBox();
        lblDescricao1 = new javax.swing.JLabel();
        btnProducrar = new javax.swing.JButton();
        txtPlaca = new javax.swing.JTextField();
        lblDescricao2 = new javax.swing.JLabel();
        lblDescricao8 = new javax.swing.JLabel();
        lblDescricao9 = new javax.swing.JLabel();
        cbAtiva = new javax.swing.JComboBox();
        txtDescricao = new javax.swing.JTextField();
        txtAno = new javax.swing.JFormattedTextField();
        lblDescricao10 = new javax.swing.JLabel();
        txtChassi = new javax.swing.JTextField();
        cbFrente = new javax.swing.JComboBox();
        lblDescricao11 = new javax.swing.JLabel();
        btnProducrar1 = new javax.swing.JButton();
        lblDescricao12 = new javax.swing.JLabel();
        cbComposicao = new javax.swing.JComboBox();
        btnProducrar2 = new javax.swing.JButton();
        lblDescricao13 = new javax.swing.JLabel();
        txtAnoModelo = new javax.swing.JFormattedTextField();
        lblDescricao14 = new javax.swing.JLabel();
        txtDataAqui = new javax.swing.JFormattedTextField();
        lblDescricao15 = new javax.swing.JLabel();
        cbUf = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(400, 249));

        lblDescricao.setText("Ano Fabric");

        btOk.setText("Adicionar");
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

        lblDescricao1.setText("Centro Custo");

        btnProducrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrarActionPerformed(evt);
            }
        });

        lblDescricao2.setText("Placa");

        lblDescricao8.setText("Descrição Modelo");

        lblDescricao9.setText("Disponivel");

        cbAtiva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Nao" }));

        txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lblDescricao10.setText("Chassi");

        lblDescricao11.setText("Frente Transp");

        btnProducrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar1.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrar1ActionPerformed(evt);
            }
        });

        lblDescricao12.setText("Composição");

        btnProducrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar2.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrar2ActionPerformed(evt);
            }
        });

        lblDescricao13.setText("Ano Modelo");

        txtAnoModelo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lblDescricao14.setText("Data Aquisição:");

        try {
            txtDataAqui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDescricao15.setText("UF:");

        cbUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(lblDescricao2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDescricao10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDescricao11)
                                .addGap(18, 18, 18)
                                .addComponent(cbFrente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProducrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDescricao1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCentroCusto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17)
                                .addComponent(btnProducrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDescricao9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDescricao15)
                        .addGap(18, 18, 18)
                        .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescricao8)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescricao)
                        .addGap(219, 219, 219))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDescricao12)
                        .addGap(18, 18, 18)
                        .addComponent(cbComposicao, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProducrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescricao13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescricao14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataAqui, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 84, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDescricao)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbCentroCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDescricao1))
                            .addComponent(btnProducrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricao9))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDescricao10)
                        .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDescricao11)
                        .addComponent(cbFrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProducrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescricao13)
                            .addComponent(txtAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricao14)
                            .addComponent(txtDataAqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDescricao12)
                        .addComponent(cbComposicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProducrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao15)
                    .addComponent(lblDescricao8)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancel)
                    .addComponent(btOk))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        try {
            Equipamento equipamento = new Equipamento();
            
            DateFormat dffrom = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date dataInicioSafra = new java.sql.Date(dffrom.parse(txtDataAqui.getText()).getTime());
            
            equipamento.setAnoFabricacao(Integer.parseInt(txtAno.getText()));
            equipamento.setCentroCusto((CentroCusto)cbCentroCusto.getSelectedItem());
            equipamento.setPlaca(txtPlaca.getText());
            equipamento.setChassi(txtChassi.getText());
            equipamento.setFrenteTransporte((FrenteTransporte)cbFrente.getSelectedItem());
            equipamento.setComposicao((Composicao)cbComposicao.getSelectedItem());
            equipamento.setAnoModelo(Integer.parseInt(txtAnoModelo.getText()));
            equipamento.setDataAquisicao(dataInicioSafra);
            equipamento.setUf(UnidadeFederativa.valueOf(cbUf.getSelectedItem().toString()));
            equipamento.setModelo(txtDescricao.getText());            
            
            if (cbAtiva.getSelectedIndex() == 0) {
                equipamento.setDisponivel(true);
            } else {
                equipamento.setDisponivel(false);
            }           
            
            dao.addEquipamento(equipamento);

            int result = JOptionPane.showConfirmDialog(this, "Você Tem Certeza ??","Adicionar Equipamento",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(result != 0) {
                return;
            }
            control.loadInitialData();
            setVisible(false);
        } catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao Adicionar Equipamento "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed

    private void btnProducrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrarActionPerformed
        FrmPesquisaMunicipio dialog = new FrmPesquisaMunicipio(cbCentroCusto);         
    }//GEN-LAST:event_btnProducrarActionPerformed

    private void btnProducrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProducrar1ActionPerformed

    private void btnProducrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProducrar2ActionPerformed

private void initMyComponents() throws SQLException {  
   
    this.btOk.setIcon(new ImageIcon("icons/check16.png"));
    this.btCancel.setIcon(new ImageIcon("icons/cancel16.png"));
   
   List<CentroCusto> centro = new CentroCustoDAO().getAllCentroCusto();
   DefaultComboBoxModel dcbm = new DefaultComboBoxModel(new Vector<CentroCusto>(centro));
   cbCentroCusto.setModel(dcbm);
   
   List<FrenteTransporte> frente = new FrenteTransporteDAO().getAllFrenteTransporte();
   DefaultComboBoxModel dcbmFrente = new DefaultComboBoxModel(new Vector<FrenteTransporte>(frente));
   cbFrente.setModel(dcbmFrente);
   
   List<Composicao> composicao = new ComposicaoDAO().getAllUnidadeMedida();
   DefaultComboBoxModel dcbmComp = new DefaultComboBoxModel(new Vector<Composicao>(composicao));
   cbComposicao.setModel(dcbmComp);
   
   cbUf.setModel(new DefaultComboBoxModel<>(UnidadeFederativa.values()));
}    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btnProducrar;
    private javax.swing.JButton btnProducrar1;
    private javax.swing.JButton btnProducrar2;
    private javax.swing.JComboBox cbAtiva;
    private javax.swing.JComboBox cbCentroCusto;
    private javax.swing.JComboBox cbComposicao;
    private javax.swing.JComboBox cbFrente;
    private javax.swing.JComboBox cbUf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricao1;
    private javax.swing.JLabel lblDescricao10;
    private javax.swing.JLabel lblDescricao11;
    private javax.swing.JLabel lblDescricao12;
    private javax.swing.JLabel lblDescricao13;
    private javax.swing.JLabel lblDescricao14;
    private javax.swing.JLabel lblDescricao15;
    private javax.swing.JLabel lblDescricao2;
    private javax.swing.JLabel lblDescricao8;
    private javax.swing.JLabel lblDescricao9;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JFormattedTextField txtAnoModelo;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JFormattedTextField txtDataAqui;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables


}
