/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.entity.HoaDonNhapChiTiet;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class HoaDonNhapChiTietDAO extends kvlxdDAO<HoaDonNhapChiTiet, String> {

    String INSERT_SQL = "insert into HDNhapCT (MaHDN,MaMH,TenMH,SoLuong,DVT,GiaNiemYet,GhiChu) values (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "update HDNhapCT set MaHDN = ?,MaMH=?,TenMH=?,SoLuong=?,DVT=?,GiaNiemYet=?,GhiChu=? where ID=?";
    String DELETE_SQL = "delete from HDNhapCT where ID = ?";
    String SELECT_ALL_SQL = "select * from HDNhapCT";
    String SELECT_BY_ID_SQL = "select * from HDNhapCT where MaHDN = ?";

    @Override
    public void insert(HoaDonNhapChiTiet entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaHDN(),entity.getMaMH(),entity.getTenMH(),entity.getSoLuong(),entity.getDVT(),entity.getGiaNiemYet(),entity.getGhiChu());
    }

    @Override
    public void update(HoaDonNhapChiTiet entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaHDN(),entity.getMaMH(),entity.getTenMH(),entity.getSoLuong(),entity.getDVT(),entity.getGiaNiemYet(),entity.getGhiChu(),entity.getID() );
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<HoaDonNhapChiTiet> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDonNhapChiTiet selectById(String key) {
        List<HoaDonNhapChiTiet> list=selectBySql(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    public List<HoaDonNhapChiTiet> selectById(int id) {
        List<HoaDonNhapChiTiet> list=selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
    @Override
    protected List<HoaDonNhapChiTiet> selectBySql(String sql, Object... args) {
        List<HoaDonNhapChiTiet> list=new ArrayList<>();
        try {
            ResultSet rs=JDBCHelper.query(sql, args);
            while(rs.next()){
                HoaDonNhapChiTiet hdct=new HoaDonNhapChiTiet();
                hdct.setID(rs.getInt("ID"));
                hdct.setMaHDN(rs.getInt("MaHDN"));
                hdct.setMaMH(rs.getString("MaMH"));
                hdct.setTenMH(rs.getString("TenMH"));
                hdct.setDVT(rs.getString("DVT"));
                hdct.setSoLuong(rs.getFloat("SoLuong"));     
                hdct.setGiaNiemYet(rs.getFloat("GiaNiemYet"));
                hdct.setGhiChu(rs.getString("GhiChu"));
                
                list.add(hdct);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
