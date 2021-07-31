package com.hu.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Dia o
 */
@Data
@Component
public class User {
    @Value("老刘")
    private String name;
}
