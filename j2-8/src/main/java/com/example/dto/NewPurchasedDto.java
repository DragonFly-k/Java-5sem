package com.example.dto;
import com.example.entity.Course;
import com.example.entity.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class NewPurchasedDto {

    @NotNull
    private User user;

    @NotNull
    private Course course;

    private String key;

    private Boolean active;

    private LocalDate dateActivated;

    private String hardwareType;

    private String hardwareSerial;
}