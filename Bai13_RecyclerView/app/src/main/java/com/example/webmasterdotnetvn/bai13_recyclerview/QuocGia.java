package com.example.webmasterdotnetvn.bai13_recyclerview;

public class QuocGia {
    String tenQuocGia;
    String thuDo;
    int laCo; // ID của ảnh drawable
    String danSo;

    public QuocGia(String tenQuocGia, String thuDo, int laCo, String danSo) {
        this.tenQuocGia = tenQuocGia;
        this.thuDo = thuDo;
        this.laCo = laCo;
        this.danSo = danSo;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public String getThuDo() {
        return thuDo;
    }

    public int getLaCo() {
        return laCo;
    }
    public String getDanSo() { return danSo; }
}
