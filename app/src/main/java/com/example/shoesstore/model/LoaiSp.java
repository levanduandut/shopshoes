package com.example.shoesstore.model;

public class LoaiSp {
    int id;
    String name;
    int quantity;
    String detail;
    int category_id_id;
    int store_id_id;

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    int hinhanh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getCategory_id_id() {
        return category_id_id;
    }

    public void setCategory_id_id(int category_id_id) {
        this.category_id_id = category_id_id;
    }

    public int getStore_id_id() {
        return store_id_id;
    }

    public void setStore_id_id(int store_id_id) {
        this.store_id_id = store_id_id;
    }
}


