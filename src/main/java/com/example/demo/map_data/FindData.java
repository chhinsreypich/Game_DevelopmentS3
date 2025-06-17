package com.example.demo.map_data;

import com.example.demo.domain.Member;

import java.util.HashMap;
import java.util.Map;

public class FindData {
    public static void main(String[] args){
        // practice 1
            Map<String, String> data = new HashMap<>();
            data.put("dataA", "DataAA");
            data.put("dataB", "DataBB");
            data.put("dataC", "DataCC");
            data.put("dataD", "DataDD");
        String findValue = "DataBB";
        for (String s : data.keySet()){
            if (data.get(s).equals(findValue)){
                System.out.println(s);
            }
        }
        /*

         // lambda code style
        data.values() // data.keySet()
        .stream() // java stream function
        .filter(s -> s.equals(findValue))
        .findAny(); // get data
         */





        // find value : "dataBB"
        // code -

        // practice 2

            Map<String, Member> data2 = new HashMap<>();
            data2.put("dataA", new Member(1L, "name1"));
            data2.put("dataB", new Member(1L, "name2"));
            data2.put("dataC", new Member(1L, "name3"));
            data2.put("dataD", new Member(1L, "name4"));

        String findValue2 = "name3";
        // normal code style
        for (String s : data.keySet()){
            Member m = data2.get(s);
            if (m.getName().equals(findValue2)){
                System.out.println(m.getId() + " // " + m.getName());
            }
        }


        // lamda code style
        /*
        return store.values() // map values
                .stream() // java stream function
                .filter(member -> member.getName().equals(name))
                .findAny(); // get data
         */

//     find value : Member name "name3"
    }
}
