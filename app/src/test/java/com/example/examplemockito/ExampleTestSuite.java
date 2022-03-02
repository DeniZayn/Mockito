package com.example.examplemockito;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
    @Suite.SuiteClasses({
        MockitoCalculatorTest.class,
        MockitoGoodsPresenterTest.class
    })
    public class ExampleTestSuite {
    }