package com.decagon.OakLandv1be.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PickupCenterResponse {
    private Long id;
    private String name;
    private String location;
    private String state;
    private String email;
    private String phone;
}
