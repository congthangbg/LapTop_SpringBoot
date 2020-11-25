/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.util.JDBCHelper;
import com.kvlxd.entity.MatHang;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cuong
 */
public class MatHangDAO extends kvlxdDAO<MatHang, String> {

    String INSERT_SQL = "insert into MatHang (MaMH,MaLH,MaKe,TenMH,DonGia,DonVi,SoLuong,SLHong,NgaySanXuat,Hang) values (?,?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "update MatHang set MaLH = ?, MaKe =?, TenMH = ?, DonGia=?, DonVi=?, SLHong=?, NgaySanXuat=?, Hang=? where MaMH=?";
    String DELETE_SQL = "delete from MatHang where MaMH = ?";
    String SELECT_ALL_SQL = "select * from MatHang";
    String SELECT_BY_ID_SQL = "select * from MatHang where MaMH = ?";
    String SELECT_ALL_SQL_MaKho = "select * from MatHang inner join LoaiHang on LoaiHang.MaLH=MatHang.MaLH inner join Kho on Kho.MaLH=LoaiHang.MaLH where MaKho = ?";
    String SELECT_BY_MALH="select * from MatHang where TenMH=?";
    @Override
    public void insert(MatHang entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaMH(), entity.getMaLH(), entity.getMaKe(), entity.getTenMH(), entity.getDonGia(), entity.getDonVi(), entity.getSoLuong(), entity.getSLHong(), entity.getNgaySanXuat(), entity.getHang());
    }

    @Override
    public void update(MatHang entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaLH(), entity.getMaKe(), entity.getTenMH(), entity.getDonGia(), entity.getDonVi(), entity.getSLHong(), entity.getNgaySanXuat(), entity.getHang(), entity.getMaMH());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<MatHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public MatHang selectById(String id) {
        List<MatHang> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<MatHang> selectBySql(String sql, Object... args) {
        List<MatHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                MatHang k = new MatHang();
                k.setMaMH(rs.getString("MaMH"));
                k.setMaLH(rs.getString("MaLH"));
                k.setMaKe(rs.getString("MaKe"));
                k.setTenMH(rs.getString("TenMH"));
                k.setDonGia(rs.getDouble("DonGia"));
                k.setDonVi(rs.getString("DonVi"));
                k.setSoLuong(rs.getDouble("SoLuong"));
                k.setSLHong(rs.getDouble("SLHong"));
                k.setNgaySanXuat(rs.getDate("NgaySanXuat"));
                k.setHang(rs.getString("Hang"));
                list.add(k);
            }

            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<MatHang> selectByMaKho(String maKho) {
        return this.selectBySql(SELECT_ALL_SQL_MaKho, maKho);
    }
public List<MatHang> selectByMamh(String TenMH) {
        return this.selectBySql(SELECT_BY_MALH, TenMH);
    }
public MatHang selectMaMH(String tenMH) {
        String sql = "select * from MatHang where TenMH like N" + "'" + tenMH + "'";
        return selectBySql(sql).get(0);
    }
}
