package com.andy;

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
    public void shouldWrapAroundWhenTopOfWorld() {
        assertEquals("0:0:N", moveRover("MMMMMMMMMM"));
    }

    @Test
    public void shouldWrapAroundWhenBottomOfWorld() {
        assertEquals("0:0:S", moveRover("LLMMMMMMMMMM"));
    }

    @Test
    public void shouldWrapAroundWhenRightSideOfWorld() {
        assertEquals("0:0:E", moveRover("RMMMMMMMMMM"));
    }

    @Test
    public void shouldWrapAroundWhenLeftSideOfWorld() {
        assertEquals("0:0:W", moveRover("LMMMMMMMMMM"));
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

    @Test
    public void shouldMove() {
        assertEquals("2:3:N", moveRover("MMRMMLM"));
        assertEquals("0:0:N", moveRover("MMMMMMMMMM"));
    }

    private String moveRover(String command) {
        MarsRover marsRover = new MarsRover();
        return marsRover.execute(command);
    }
}
