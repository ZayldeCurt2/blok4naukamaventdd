package com.sda.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriterServiceTest {

    private WriterService writerService;

    @Before
    public void init(){
        this.writerService = new WriterService();
    }

    @Test
    public void testOneName(){
        //given
        String name = "Michał";

        //when
        String result  =writerService.write(name);

        //then
        Assert.assertEquals("Hello, Michał.",result);
    }

    @Test
    public void testNullName(){
        //given
        String name = null;

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("Hello, my friend.",result);
    }

    @Test
    public void testCapitalizedName(){
        //given
        String name = "MICHAŁ";

        //when
        String result  =writerService.write(name);

        //then
        Assert.assertEquals("HELLO, MICHAŁ!",result);
    }

    @Test
    public void testEmptyString(){
        //given
        String name = "";

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("Hello, my friend.",result);
    }

    @Test
    public void testBlankName(){
        //given
        String name = "         ";

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("Hello, my friend.",result);
    }

    @Test
    public void testMultiName(){
        //given
        String name = "Michał, Janek, Mateusz";

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("Hello, Michał, Janek and Mateusz.",result);

    }

}
