package com.zym.泛型;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enter {
  public static void main(String[] args){

    List<Student> list=new ArrayList<>();

    for (int i=0;i<10;i++){
      list.add(new Student("邓招良",18));
    }

    for (int i=0;i<list.size();i++){
      System.out.println(list.get(i).name + list.get(i).age);
    }

    Map<String,Student> map=new HashMap<>();
    for (int i=1;i<10;i++){
      map.put("i",new Student("王家桐",15));
    }

    for (int i=1;i<map.size();i++)
    System.out.println(map);
  }
}
