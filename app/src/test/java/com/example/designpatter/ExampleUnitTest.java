package com.example.designpatter;

import com.example.designpatter.singleton.Mgr01;
import com.example.designpatter.singleton.Mgr02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testSingleton() {
        for (int i = 0; i < 200; i++) {
//            System.out.println(Mgr01.getInstance());
            System.out.println(Mgr02.getInstance());
        }
    }
}