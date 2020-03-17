package com.andy;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void shouldNotMove() {
        assertEquals("0:0:N", moveRover(""));
    }

    @Test
    public void shouldMoveNorthOneSquare() {
        assertEquals("0:1:N", moveRover("M"));
    }

    @Test
    public void shouldMoveNorthNSquares() {
        assertEquals("0:2:N", moveRover("MM"));
        assertEquals("0:3:N", moveRover("MMM"));
    }

    @Test
    public void shouldWrapAroundWhenEdgeOfWorld() {
        assertEquals("0:0:N", moveRover("MMMMMMMMMM"));
    }

    @Test
    public void shouldFaceEast_whenRoverTurnsRight() {
        assertEquals("0:0:E", moveRover("R"));
    }

    @Test
    public void shouldFaceSouth_whenRoverTurnsRightTwice() {
        assertEquals("0:0:S", moveRover("RR"));
    }

    @Test
    public void shouldFaceWest_whenRoverTurnsRightThrice() {
        assertEquals("0:0:W", moveRover("RRR"));
    }

    @Test
    public void shouldFaceNorth_whenRoverTurnsRightFourTimes() {
        assertEquals("0:0:N", moveRover("RRRR"));
    }

    @Test
    public void shouldFaceWest_whenRoverTurnsLeft() {
        assertEquals("0:0:W", moveRover("L"));
    }

    @Test
    public void shouldFaceSouth_whenRoverTurnsLeftTwice() {
        assertEquals("0:0:S", moveRover("LL"));
    }

    @Test
    public void shouldFaceEast_whenRoverTurnsLeftThrice() {
        assertEquals("0:0:E", moveRover("LLL"));
    }

    @Test
    public void shouldFaceNorth_whenRoverTurnsLeftFourTimes() {
        assertEquals("0:0:N", moveRover("LLLL"));
    }

    @Test
    public void shouldRotateRightAndMove() {
        assertEquals("1:0:E", moveRover("RM"));
        assertEquals("2:0:E", moveRover("RMM"));
        assertEquals("0:2:N", moveRover("RRRRMM"));
    }

    private String moveRover(String command) {
        Grid grid = new Grid();
        MarsRover marsRover = new MarsRover(grid);
        return marsRover.execute(command);
    }
}
