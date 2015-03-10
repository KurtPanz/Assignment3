/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment3;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author 211150142
 */

//this was a concrete class before introducing the interface
public class Daycare {

List students = new ArrayList();
Set times = new TreeSet();
Map rooms = new HashMap();


public List students()
{
  students.add("Johan Jacobs"); 
  students.add("Lauren September");
  students.add("Peter Pan");
  
  return students;  
}

public void rooms()
{
   rooms.put("8:00am","ROOM45");
   rooms.put("10:00am","ROOM36");
   rooms.put("12:00mm","ROOM70");
   rooms.put("14:00pm","ROOM36");
   rooms.put("16:00pm","ROOM90");   
}

public void times()
{
   times.add("8:00am");
   times.add("10:00am");
   times.add("12:00mm");
   times.add("14:00pm");
   times.add("16:00pm"); 

}

    
}
