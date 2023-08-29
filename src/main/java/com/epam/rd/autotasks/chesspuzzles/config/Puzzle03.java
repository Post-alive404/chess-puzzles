package com.epam.rd.autotasks.chesspuzzles.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Denys Parshutkin
 * @version 1.0.0
 */
@Configuration
@Import({ApplicationConfig.class})
public class Puzzle03 implements DefaultConfiguration{
    @Override
    public String getFilePath() {
        return "src/test/resources/boards/Puzzle03.txt";
    }
}
