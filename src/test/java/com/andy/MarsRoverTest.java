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
}
