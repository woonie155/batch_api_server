package com.example.apiservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiInfo {

    private String url;
    private List<? extends ApiRequestVO> apiRequestList;

}
