package com.OOWDB.Lease.exception;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    String msg;
    int status;
}
