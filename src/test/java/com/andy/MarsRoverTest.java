package com.andy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void shouldNotMove() {
        Grid grid = new Grid();
        MarsRover marsRover = new MarsRover(grid);
        String result = marsRover.execute("");
        assertEquals(result, "0:0:N");
    }

    @Test
    public void shouldMoveNorthOneSquare() {
        Grid grid = new Grid();
        MarsRover marsRover = new MarsRover(grid);
        String result = marsRover.execute("M");
        assertEquals(result, "0:1:N");
    }
}
