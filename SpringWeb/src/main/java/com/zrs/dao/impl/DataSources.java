package com.zrs.dao.impl;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class DataSources {

    @Value("root")
    private String username;

    @Value("admin")
    private String password;

    @Value("jdbc://127.0.0.0111111")
    private String url;

    @Value("com.jdbc.Driver")
    private String driverClass;

}
