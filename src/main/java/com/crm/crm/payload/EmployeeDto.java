package com.crm.crm.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {

  private Long id;
  @NotBlank
  @Size(min=10,message="atleasst 10 characters required")
  private String name;
  @Email
  private String emailId;
  @Size(min=10,max=15, message="10 to 15 characters required")
  private String mobile;

}


