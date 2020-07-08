package com.bridgelabz.mockitotest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.when;

public class MockitoTest {
    @Mock
    MyDataBase dataBaseMock;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testQuery() {
        ClassToTest test = new ClassToTest(dataBaseMock);
        when(dataBaseMock.query("* from t")).thenReturn(true);
        boolean check = test.query("* from t");
        Assert.assertTrue(check);
    }
}

