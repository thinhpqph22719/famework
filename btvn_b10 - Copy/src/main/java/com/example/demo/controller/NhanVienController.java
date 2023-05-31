package com.example.demo.controller;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.CuaHang;
import com.example.demo.entity.NhanVien;
import com.example.demo.repository.ChucVuRepository;
import com.example.demo.repository.CuaHangRepository;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private ChucVuRepository chucVuRepository;
    @Autowired
    private CuaHangRepository cuaHangRepository;
    @GetMapping("/nhan-vien/hien-thi")
    public String hienthi(@ModelAttribute("nv") NhanVien nv, Model model){
        model.addAttribute("list",nhanVienService.getAll());
        List<ChucVu> dsChucVu = chucVuRepository.findAll();
        model.addAttribute("dsChucVu",dsChucVu);
        List<CuaHang> dsCuaHang = cuaHangRepository.findAll();
        model.addAttribute("dsCuaHang",dsCuaHang);
        return "hien-thi";
    }
//    @GetMapping("/nhan-vien/delete/{ma}")
//    public String delete(@PathVariable("ma") String ma, Model model){
//        nhanVienService.delete(ma);
//        return "redirect:/nhan-vien/hien-thi";
//    }
        @GetMapping("/nhan-vien/delete/{ma}")
        public String delete(@PathVariable("ma") String ma, Model model){
        nhanVienService.delete(ma);
        return "redirect:/nhan-vien/hien-thi";
    }
    @PostMapping("/nhan-vien/add")
    public String addNV(@PathVariable("chucVu") String chucVu,@ModelAttribute("nv") NhanVien nv, Model model){
        chucVuRepository.findById(UUID.fromString(chucVu));
        nhanVienService.addNV(nv);
        return "redirect:/nhan-vien/hien-thi";
    }
}
