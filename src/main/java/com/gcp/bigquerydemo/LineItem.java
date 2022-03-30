package com.gcp.bigquerydemo;

import lombok.Data;

@Data
public class LineItem {
    private int lineId;

    private String upc;

    private int quantity;
}
