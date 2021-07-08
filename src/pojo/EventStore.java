/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aman.pojo;

import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class EventStore 
{
    ArrayList<Events> array;
    public EventStore(ArrayList<Events> array)
    {
        this.array=array;
    }
    public EventStore()
    {
        this.array=new ArrayList<>();
    }
    public Events getEvent(int index)
    {
        return array.get(index);
    }
    public int getSize()
    {
        return array.size();
    }
}
