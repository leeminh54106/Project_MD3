package com.n3.project_thoitrang.repository;

import com.n3.project_thoitrang.model.entity.Banner;
import com.n3.project_thoitrang.model.entity.Shoping_Cart;

import java.util.List;

public interface IBannerRepository {
    List<Banner> findAll();


    void deleteById(Long id);



    Banner findById(Long id);
}
