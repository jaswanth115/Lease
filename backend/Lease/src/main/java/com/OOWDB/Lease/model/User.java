package com.OOWDB.Lease.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private String id;
    private String profileImage;
    private String role;
    private String email;
    private String name;
    private String password;
    private String apartmentId;
    
}
