package com.example.demo.domain;

import com.example.demo.repository.MemoryMemberRepository;

import java.util.HashMap;
import java.util.Map;

public class InsertData {
    MemoryMemberRepository memoryMemberRepository = new MemoryMemberRepository();
    // practice 1

    public void findData (){
        Map<String, String> data = new HashMap<>();
        data.put("dataA", "DataAA");
        data.put("dataB", "DataBB");
        data.put("dataC", "DataCC");
        data.put("dataD", "DataDD");

        memoryMemberRepository.findByName("DataBB");
    }



    // find value : "dataBB"
    // code -

    // practice 2

    public void findDataTwo (){
        Map<String, Member> data2 = new HashMap<>();
        data2.put("dataA", new Member(1L, "name1"));
        data2.put("dataB", new Member(1L, "name2"));
        data2.put("dataC", new Member(1L, "name3"));
        data2.put("dataD", new Member(1L, "name4"));
        memoryMemberRepository.findByName("name3");
    }
//     find value : Member name "name3"
}
