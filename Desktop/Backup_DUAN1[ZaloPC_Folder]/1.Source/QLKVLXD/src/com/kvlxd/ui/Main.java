package com.kvlxd.ui;

import com.kvlxd.util.Auth;
import com.kvlxd.util.MsgBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.Timer;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        inits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        JDes = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miniDangNhap = new javax.swing.JMenuItem();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniKhachHang = new javax.swing.JMenuItem();
        mniNCC = new javax.swing.JMenuItem();
        mniHoaDonNhap = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jToolBar1.setRollover(true);

        jButton1.setText("Đăng xuất");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        jButton2.setText("Nhân viên");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator2);

        jButton3.setText("Kho");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator3);

        jButton4.setText("Mặt hàng");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator4);

        jButton5.setText("Hàng tồn");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);
        jToolBar1.add(jSeparator5);

        jButton6.setText("Hướng dẫn");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Hệ thống quản lý kho");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addComponent(jLabel6)))
                    .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout JDesLayout = new javax.swing.GroupLayout(JDes);
        JDes.setLayout(JDesLayout);
        JDesLayout.setHorizontalGroup(
            JDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1099, Short.MAX_VALUE)
        );
        JDesLayout.setVerticalGroup(
            JDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jMenu1.setText("Hệ thống");

        miniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        miniDangNhap.setText("Đăng nhập");
        miniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniDangNhapActionPerformed(evt);
            }
        });
        jMenu1.add(miniDangNhap);

        mniDoiMatKhau.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        jMenu1.add(mniDoiMatKhau);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mniKhachHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mniKhachHang.setText("Quản lý khách hàng");
        mniKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhachHangActionPerformed(evt);
            }
        });
        jMenu2.add(mniKhachHang);

        mniNCC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        mniNCC.setText("Quản lý nhà cung cấp");
        mniNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNCCActionPerformed(evt);
            }
        });
        jMenu2.add(mniNCC);

        mniHoaDonNhap.setText("Quản lý hóa đơn nhập");
        mniHoaDonNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHoaDonNhapActionPerformed(evt);
            }
        });
        jMenu2.add(mniHoaDonNhap);

        jMenuItem1.setText("Quản lý loại hàng");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Hướng dẫn");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JDes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JDes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniDangNhapActionPerformed
        this.openCuaSoDangNhap();
    }//GEN-LAST:event_miniDangNhapActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        this.openCuaSoDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.openCuaSoNhanVien();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mniKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhachHangActionPerformed
        this.openCuaSoKhachHang();
    }//GEN-LAST:event_mniKhachHangActionPerformed

    private void mniNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNCCActionPerformed
        this.openCuasoNhaCungCap();
    }//GEN-LAST:event_mniNCCActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.openCuaSoKho();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.openCuaSoMatHang();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mniHoaDonNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHoaDonNhapActionPerformed
        openCuaSoHoaDonNhap();
    }//GEN-LAST:event_mniHoaDonNhapActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        openCuaSoLoaiHang();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JMenuItem miniDangNhap;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniHoaDonNhap;
    private javax.swing.JMenuItem mniKhachHang;
    private javax.swing.JMenuItem mniNCC;
    // End of variables declaration//GEN-END:variables
    private void inits() {
        this.setLocationRelativeTo(null);
        new DangNhapJDialog(this, true).setVisible(true);
        if (Auth.isLogin()) {
            this.setVisible(true);
        }
        new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
                String text = formater.format(now);
                lblDongHo.setText(text);
            }
        }).start();
    }

    private void openCuaSoDangNhap() {
        new DangNhapJDialog(this, true).setVisible(true);
    }

    private void openCuaSoDoiMatKhau() {
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        DoiMatKhauJDialog cd = new DoiMatKhauJDialog();
        cd.setTitle("Đổi mật khẩu");
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 50) / 2 - cd.getHeight() / 2 - 100);
        JDes.add(cd);
        cd.setVisible(true);
    }

    private void openCuaSoNhanVien() {
        if (Auth.isLogin()) {
            if (!Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xem nhân viên");
                return;
            }

        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        NhanVienJDialog cd = new NhanVienJDialog();
        cd.setTitle("Quản lý nhân viên");
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 100) / 2 - cd.getHeight() / 2 - 100);
        JDes.add(cd);
        cd.setVisible(true);
    }

    private void openCuaSoKhachHang() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            KhachHangJDialog kh = new KhachHangJDialog(this, true);
            kh.setTitle("Quản lý khách hàng");
            kh.setLocation(this.getWidth() / 2 - kh.getWidth() / 2, (this.getHeight() - 100) / 2 - kh.getHeight() / 2 - 100);
            JDes.add(kh);
            kh.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuasoNhaCungCap() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            NhaCungCapJDialog ncc = new NhaCungCapJDialog();
            ncc.setTitle("Quản lý nhà cung cấp");
            ncc.setLocation(this.getWidth() / 2 - ncc.getWidth() / 2, (this.getHeight() - 100) / 2 - ncc.getHeight() / 2 - 100);
            JDes.add(ncc);
            ncc.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuaSoKho() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            QLkho k = new QLkho();
            k.setTitle("Quản lý kho");
            k.setLocation(this.getWidth() / 2 - k.getWidth() / 2, (this.getHeight() - 50) / 2 - k.getHeight() / 2 - 50);
            JDes.add(k);
            k.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuaSoMatHang() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            MatHangJDialog k = new MatHangJDialog();
            k.setTitle("Quản lý mặt hàng");
            k.setLocation(this.getWidth() / 2 - k.getWidth() / 2, (this.getHeight() - 50) / 2 - k.getHeight() / 2 - 50);
            JDes.add(k);
            k.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuaSoHoaDonNhap() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            HoaDonNhapJDialog k = new HoaDonNhapJDialog();
            k.setTitle("Quản lý hóa đơn nhập");
            k.setLocation(this.getWidth() / 2 - k.getWidth() / 2, (this.getHeight() - 50) / 2 - k.getHeight() / 2 - 50);
            JDes.add(k);
            k.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuaSoLoaiHang() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            QLLoaiHang lh = new QLLoaiHang();
            lh.setTitle("Quản lý loại hàng");
            lh.setLocation(this.getWidth() / 2 - lh.getWidth() / 2, (this.getHeight() - 50) / 2 - lh.getHeight() / 2 - 50);
            JDes.add(lh);
            lh.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

}
