package com.DPC.spring.payload.responses;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
public class MessageResponse {
    @NonNull
    private String message;

    public MessageResponse(String message) {

    }
}
