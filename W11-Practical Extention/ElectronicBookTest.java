package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElectronicBookTest {
    Item electronicBook1 = new ElectronicBook(20, "Mouses", 20f, "Blue","97-0993-765-0", EnumClasses.genre.NonFiction, 900f);


    @Test
    public void testSetSize() throws Exception {
        ((ElectronicBook) electronicBook1).setSize(800f);
        assertEquals(((ElectronicBook) electronicBook1).getSize(),800f, 0);
    }
}