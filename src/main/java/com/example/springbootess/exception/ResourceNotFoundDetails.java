package com.example.springbootess.exception;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ResourceNotFoundDetails {
    private String title;
    private int status;
    private String detail;
    private LocalDateTime timestamp;
    private String developerMessage;
}
