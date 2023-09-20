package Hangman.Commands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LivesTest {
    
@BeforeEach
void setUp(){
    lives = new Lives().setLives(5);
}

    @Test
    void setLives() {

    }

    @Test
    void printDifficulties() {
    }

    @Test
    void loseOneLife() {
    }
}