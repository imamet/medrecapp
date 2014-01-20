/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmUtama.java
 *
 * Created on Dec 19, 2013, 11:15:55 AM
 */

package medrecapp.Gui;

import medrecapp.Gui.Internal.FrmIntSpesialis;
import medrecapp.Gui.Internal.FrmIntJaminan;
import java.awt.Dimension;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class FrmUtama extends javax.swing.JFrame {

    public static String poliTujuan;

    /** Creates new form FrmUtama */
    public FrmUtama() {
        initComponents();        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();
        menuMaster = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuDokter = new javax.swing.JMenuItem();
        menuPerawat = new javax.swing.JMenuItem();
        menuStaf = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuSpesialis = new javax.swing.JMenuItem();
        menuJaminan = new javax.swing.JMenuItem();
        menuObat = new javax.swing.JMenuItem();
        menuDataTindakan = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuPasien = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuPendaftaranPasBaru = new javax.swing.JMenuItem();
        menuPendaftaranPasLama = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuPoliDalam = new javax.swing.JMenuItem();
        menuPoliJantung = new javax.swing.JMenuItem();
        menuPoliParu = new javax.swing.JMenuItem();
        menuPoliBedah = new javax.swing.JMenuItem();
        menuPoliMata = new javax.swing.JMenuItem();
        menuPoliTHT = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(127, 208, 215));

        menuFile.setText("File");

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        jMenuBar1.add(menuFile);

        menuMaster.setText("Data Master");
        menuMaster.setName("menuDataMaster"); // NOI18N

        jMenu1.setText("Data SDM");
        jMenu1.setName("menuDataSDM"); // NOI18N

        menuDokter.setText("Data Dokter");
        menuDokter.setName("menuDataDokter"); // NOI18N
        menuDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDokterActionPerformed(evt);
            }
        });
        jMenu1.add(menuDokter);

        menuPerawat.setText("Data Perawat");
        menuPerawat.setName("menuDataPerawat"); // NOI18N
        menuPerawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerawatActionPerformed(evt);
            }
        });
        jMenu1.add(menuPerawat);

        menuStaf.setText("Data Staf");
        menuStaf.setName("menuDataStaf"); // NOI18N
        menuStaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStafActionPerformed(evt);
            }
        });
        jMenu1.add(menuStaf);

        menuMaster.add(jMenu1);
        menuMaster.add(jSeparator3);

        menuSpesialis.setText("Data Spesialis");
        menuSpesialis.setName("menuDataSpesialis"); // NOI18N
        menuSpesialis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSpesialisActionPerformed(evt);
            }
        });
        menuMaster.add(menuSpesialis);

        menuJaminan.setText("Data Jaminan");
        menuJaminan.setName("menuDataJaminan"); // NOI18N
        menuJaminan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJaminanActionPerformed(evt);
            }
        });
        menuMaster.add(menuJaminan);

        menuObat.setText("Data Obat");
        menuObat.setName("menuDataObat"); // NOI18N
        menuObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuObatActionPerformed(evt);
            }
        });
        menuMaster.add(menuObat);

        menuDataTindakan.setText("Data Tindakan");
        menuDataTindakan.setName("menuDataTindakan"); // NOI18N
        menuDataTindakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDataTindakanActionPerformed(evt);
            }
        });
        menuMaster.add(menuDataTindakan);
        menuMaster.add(jSeparator2);

        menuPasien.setText("Data Pasien");
        menuPasien.setName("menuDataPasien"); // NOI18N
        menuPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPasienActionPerformed(evt);
            }
        });
        menuMaster.add(menuPasien);

        jMenuBar1.add(menuMaster);

        jMenu2.setText("Pendaftaran");

        jMenu3.setText("Registrasi Pasien");

        menuPendaftaranPasBaru.setText("Pasien Baru");
        menuPendaftaranPasBaru.setName("menuPasienBaru"); // NOI18N
        menuPendaftaranPasBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPendaftaranPasBaruActionPerformed(evt);
            }
        });
        jMenu3.add(menuPendaftaranPasBaru);

        menuPendaftaranPasLama.setText("Pasien Lama");
        menuPendaftaranPasLama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPendaftaranPasLamaActionPerformed(evt);
            }
        });
        jMenu3.add(menuPendaftaranPasLama);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Poliklinik");

        menuPoliDalam.setText("Poliklinik Penyakit Dalam");
        menuPoliDalam.setName("menuPoliPenyakitDalam"); // NOI18N
        menuPoliDalam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPoliDalamActionPerformed(evt);
            }
        });
        jMenu4.add(menuPoliDalam);

        menuPoliJantung.setText("Poliklinik Penyakit Jantung");
        menuPoliJantung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPoliJantungActionPerformed(evt);
            }
        });
        jMenu4.add(menuPoliJantung);

        menuPoliParu.setText("Poliklinik Penyakit Paru-paru");
        menuPoliParu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPoliParuActionPerformed(evt);
            }
        });
        jMenu4.add(menuPoliParu);

        menuPoliBedah.setText("Poliklinik Spesialis Bedah");
        menuPoliBedah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPoliBedahActionPerformed(evt);
            }
        });
        jMenu4.add(menuPoliBedah);

        menuPoliMata.setText("Poliklinik Penyakit Mata");
        menuPoliMata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPoliMataActionPerformed(evt);
            }
        });
        jMenu4.add(menuPoliMata);

        menuPoliTHT.setText("Poliklinik Penyakit THT");
        menuPoliTHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPoliTHTActionPerformed(evt);
            }
        });
        jMenu4.add(menuPoliTHT);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSpesialisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSpesialisActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FrmIntSpesialis fis = new FrmIntSpesialis();
        Dimension parentSize = jDesktopPane1.getSize();
        Dimension childSize = fis.getSize();
        fis.setLocation((parentSize.width - childSize.width) / 2, (parentSize.height - childSize.height) / 2);
        jDesktopPane1.add(fis);                
        fis.show();
        fis.toFront();
    }//GEN-LAST:event_menuSpesialisActionPerformed

    private void menuPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPasienActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuPasienActionPerformed

    private void menuJaminanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJaminanActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FrmIntJaminan fis = new FrmIntJaminan();
        Dimension parentSize = jDesktopPane1.getSize();
        Dimension childSize = fis.getSize();
        fis.setLocation((parentSize.width - childSize.width) / 2, (parentSize.height - childSize.height) / 2);        
        jDesktopPane1.add(fis);
        fis.show();
        fis.toFront();
    }//GEN-LAST:event_menuJaminanActionPerformed

    private void menuObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuObatActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuObatActionPerformed

    private void menuPendaftaranPasBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPendaftaranPasBaruActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuPendaftaranPasBaruActionPerformed

    private void menuPoliDalamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPoliDalamActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuPoliDalamActionPerformed

    private void menuPendaftaranPasLamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPendaftaranPasLamaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuPendaftaranPasLamaActionPerformed

    private void menuPoliJantungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPoliJantungActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuPoliJantungActionPerformed

    private void menuPoliParuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPoliParuActionPerformed
        // TODO add your handling code here:
             
    }//GEN-LAST:event_menuPoliParuActionPerformed

    private void menuPoliBedahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPoliBedahActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menuPoliBedahActionPerformed

    private void menuPoliMataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPoliMataActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuPoliMataActionPerformed

    private void menuPoliTHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPoliTHTActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuPoliTHTActionPerformed

    private void menuDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDokterActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuDokterActionPerformed

    private void menuPerawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerawatActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuPerawatActionPerformed

    private void menuStafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStafActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuStafActionPerformed

    private void menuDataTindakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDataTindakanActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menuDataTindakanActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem menuDataTindakan;
    private javax.swing.JMenuItem menuDokter;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuJaminan;
    private javax.swing.JMenu menuMaster;
    private javax.swing.JMenuItem menuObat;
    private javax.swing.JMenuItem menuPasien;
    private javax.swing.JMenuItem menuPendaftaranPasBaru;
    private javax.swing.JMenuItem menuPendaftaranPasLama;
    private javax.swing.JMenuItem menuPerawat;
    private javax.swing.JMenuItem menuPoliBedah;
    private javax.swing.JMenuItem menuPoliDalam;
    private javax.swing.JMenuItem menuPoliJantung;
    private javax.swing.JMenuItem menuPoliMata;
    private javax.swing.JMenuItem menuPoliParu;
    private javax.swing.JMenuItem menuPoliTHT;
    private javax.swing.JMenuItem menuSpesialis;
    private javax.swing.JMenuItem menuStaf;
    // End of variables declaration//GEN-END:variables

}
