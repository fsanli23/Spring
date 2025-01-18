package com.sanli;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@ToString
public class Person {
    public String name;
    public Car car;


}
