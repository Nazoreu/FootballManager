package com.footballManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.footballManager.model.Player;
import com.footballManager.util.Banner;

/**
 * Football Manager!
 */
public class FootballManagerApplication {

    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(FootballManagerApplication.class);

        logger.info(Banner.footballManager);
        logger.info("Football Manager! Start...");
        logger.info("**************************\n");

        Player player1 = new Player();
        player1.setFirstName("john");
        player1.setLastName("doe");
        player1.setAge(0);
        player1.setSex("male");
        player1.setNationality("unknown");

        logger.info(player1.toString());
    }
}
