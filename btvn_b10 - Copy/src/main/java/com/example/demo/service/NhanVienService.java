package com.example.demo.service;

import com.example.demo.entity.NhanVien;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> getAll();
    void delete(String ma);
    void addNV(NhanVien nv);
    void updateNV(NhanVien nv);
    void detail(String ma);
}
