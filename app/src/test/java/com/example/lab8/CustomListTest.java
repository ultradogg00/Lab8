package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }


    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void testHasCity(){

        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Yellowknie", "Northwest Territories");
        list.addCity(city);
        assertTrue(list.hasCity(city));

    }
    @Test
    public void testDelete(){
        list = MockCityList();
        // assertEquals(1, cityList.getCities().size());
        City city = new City("regina", "Saskatchewan");
        list.add(city);
        list.delete(city);

        assertEquals(1, list.getCount());

    }
    @Test
    public void testCountCities() {
        list = MockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        list.add(city);
        assertEquals(1, list.getCount());
    }






}
