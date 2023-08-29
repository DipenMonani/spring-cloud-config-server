package com.cloud.client.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyDTO {

    String userName;
    String url;
    String secretKey;

}
