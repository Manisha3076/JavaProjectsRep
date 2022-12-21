package com.example.restapidemo.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentDTO {
	@NotBlank(message = "Name can't be empty")
	@NotNull(message = "Name can't be  null")
	@Size(min = 3, max = 10, message = "Name must be within 3-10 characters")
	String name;
	
	@NotNull(message = "Phone can not be null")
	@Pattern(regexp = "\\d{10}$", message = " Invalid phone number ")
	String contact;

}
