package com.iksflow.study.util;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.UUID;

public class TestUtil {
    public String createUuid() {
        return UUID.randomUUID().toString();
    }
}
