package com.example.demo.Controller;

import com.example.demo.entity.Flight;
import com.example.demo.entity.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/json")
public class MyRestController {
    @GetMapping("/Home")
    public String AnyBody(){
        return "Hello";
    }


@GetMapping("/Passengers")
public List<Person> getPeople(){
    List<Person> people=new ArrayList<>();
    people.add(new Person("Jeff", "Bezos"));
    return people;
    }


    @GetMapping("/Flights")
    public List<Flight> getFlight(){
        List<Flight> people=new ArrayList<>();
        people.add(new Flight("EK235", "Chicago", "Charlotte", new Date()));
        return people;
    }

}


