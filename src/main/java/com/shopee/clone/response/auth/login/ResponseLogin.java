package com.shopee.clone.response.auth.login;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseLogin<T> {
    private T data;
    private String accessToken;
    private String refreshToken;
}
