package com.mcw.dubbo.provider;

import com.mcw.dubbo.export.TestService;

public class TestServiceImpl implements TestService {

    @Override
    public String TestDubbo() {
        return "Dubbo Service Running";
    }
}
