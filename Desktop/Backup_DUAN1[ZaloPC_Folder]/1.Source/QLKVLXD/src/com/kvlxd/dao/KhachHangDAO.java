/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.entity.KhachHang;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class KhachHangDAO extends kvlxdDAO<KhachHang, String> {

    String INSERT_SQL = "insert into KhachHang values (?,?,?,?)";
    String UPDATE_SQL = "update KhachHang set TenKH = ?, SDT =?, DiaChi = ? where MaKH=?";
    String DELETE_SQL = "delete from KhachHang where MaKH = ?";
    String SELECT_ALL_SQL = "select * from KhachHang";
    String SELECT_BY_ID_SQL = "select * from KhachHang where MaKH = ?";

    @Override
    public void insert(KhachHang entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaKH(),entity.getTenKH(),entity.getSDT(),
                entity.getDiaChi()
                );
    }

    @Override
    public void update(KhachHang entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getTenKH(),entity.getSDT(),
                entity.getDiaChi(),entity.getMaKH()
                );
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<KhachHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang selectById(String key) {
        List<KhachHang> list=selectBySql(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list=new ArrayList<>();
        try {
            ResultSet rs=JDBCHelper.query(sql, args);
            while(rs.next()){
                KhachHang kh=new KhachHang();
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setSDT(rs.getString("SDT"));
                kh.setDiaChi(rs.getString("DiaChi"));
                list.add(kh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
        throw new RuntimeException();
        }
    }

}
