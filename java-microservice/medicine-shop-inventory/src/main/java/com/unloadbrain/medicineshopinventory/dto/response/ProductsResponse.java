package com.unloadbrain.medicineshopinventory.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class ProductsResponse {

    private int page;

    private int size;

    private int totalPages;

    private long totalElements;

    private List<ProductResponse> items;
}
