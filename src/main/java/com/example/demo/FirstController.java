package com.example.demo;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberForm;
import com.example.demo.repository.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    ///  if i want to make a change the in code
    ///  then  ctrl + k and comment "filename fix ( anything we want to say or show)"
    ///  and then start push it like first commit
    ///  and remember to click on "Commit and Push"
    ///  if we have any error there, we still click on "Commit and Push anyway"
    @GetMapping("/")
    public String first(){
       return "home";
   }

}

