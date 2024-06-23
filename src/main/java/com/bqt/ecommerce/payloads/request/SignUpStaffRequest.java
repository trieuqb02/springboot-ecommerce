package com.bqt.ecommerce.payloads.request;

import lombok.Data;

import java.util.Date;

@Data
public class SignUpStaffRequest {
    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String identification;

    private Date birthDay;

    private RoleRequest role;
}
