package com.example.demo.repository;

import com.example.demo.entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {
}
