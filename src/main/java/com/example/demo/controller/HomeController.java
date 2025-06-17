//package com.example.demo.controller;
//import com.example.demo.repository.MemberService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class HomeController {
//    private final MemberService memberService;
//
//    public HomeController(MemberService memberService) {
//        this.memberService = memberService;
//    }
//
//    @GetMapping ("/")
//    public String Home(){
//        return "Home";
//    }
//
//    @GetMapping("/members/new")
//    public String createForm() {
//        return "members/createMemberForm";
//    }
//
//    @PostMapping("/form")
//    public String memberAddForm( @RequestParam String name){
//        System.out.println("");
//        return "memberAddForm";
//    }
//}
