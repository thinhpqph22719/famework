package com.example.demo.service.impl;

import com.example.demo.entity.NhanVien;
import com.example.demo.repository.NhanVienRepository;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public void delete(String ma) {
        nhanVienRepository.deleteById(UUID.fromString(ma));
    }

    @Override
    public void addNV(NhanVien nv) {
        nhanVienRepository.save(nv);
    }

    @Override
    public void updateNV(NhanVien nv) {
        nhanVienRepository.save(nv);
    }

    @Override
    public void detail(String ma) {
//        nhanVienRepository.findById(ma);
    }
}
