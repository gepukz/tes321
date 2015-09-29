package com.example.user.tes;

/**
 * Created by user on 9/29/2015.
 */
public class footballer {

    String nama;
    Integer umur;

    static Integer jmlh=0;

    footballer(String nama, Integer umur)
    {
        this.nama = nama;
        this.umur= umur;
        jmlh++;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static Integer getJmlh() {
        return jmlh;
    }




}
