package com.kuaiyu.ai.service;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;

/**
 * @Author: kuaiyu-yyk
 * @Description:
 * @Date: 2020/4/22 9:19
 * @Version:
 */
@ApplicationScoped
public class TestService {

    public Multi<String> greeting(String name) {
        return Multi.createFrom().item(name)
                .onItem().apply(n -> String.format("hello %s", name));
    }

}
