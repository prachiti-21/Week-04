package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    private DatabaseConnection databaseConnection;

    @BeforeEach
    public void setUp() {
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }

    @AfterEach
    public void tearDown() {
        databaseConnection.disconnect();
    }

    @Test
    public void testConnectionIsEstablished() {
        assertTrue(databaseConnection.isConnected(), "Database should be connected.");
    }

    @Test
    public void testConnectionIsClosed() {
        databaseConnection.disconnect();
        assertFalse(databaseConnection.isConnected(), "Database should be disconnected.");
    }
}
