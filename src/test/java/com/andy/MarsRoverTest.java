package com.andy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void shouldNotMove() {
        assertEquals(moveRover(""), "0:0:N");
    }

    @Test
    public void shouldMoveNorthOneSquare() {
        assertEquals(moveRover("M"), "0:1:N");
    }

    @Test
    public void shouldMoveNorthTwoSquares() {
        assertEquals(moveRover("MM"), "0:2:N");
    }

    private String moveRover(String command) {
        Grid grid = new Grid();
        MarsRover marsRover = new MarsRover(grid);
        return marsRover.execute(command);
    }
}
