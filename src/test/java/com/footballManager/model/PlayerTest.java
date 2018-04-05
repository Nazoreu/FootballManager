package com.footballManager.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player();
        player.setFirstName("John");
        player.setLastName("Doe");
        player.setNationality("USA");
        player.setAge(24);
        player.setSex("Male");
    }

    @Test
    public void getFirstName() {
        Assert.assertEquals("John", player.getFirstName());
    }

    @Test
    public void setFirstName() {
        player.setFirstName("Mike");
        Assert.assertEquals("Mike", player.getFirstName());
    }

}