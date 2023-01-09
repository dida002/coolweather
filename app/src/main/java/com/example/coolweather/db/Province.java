package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;
import lombok.Data;

@Data
public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
}
