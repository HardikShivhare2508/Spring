package com.example.demo;

import com.example.demo.Controller.MyRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;


@WebMvcTest(MyRestController.class)
@RunWith(SpringRunner.class)
public class FlightTest {


    @Autowired
    private MockMvc mvc;

//    @Test
//    public void getFlights() {
//
//        //Setup
//
//        MyRestController m1 = new MyRestController();
//        String expected = "{\"id\":\"EK235\",\"origin\":\"Chicago\",\"destination\":\"Charlotte\",\"dateOfJourney\":\"2019-04-26T15:46:26.754+0000\"}";
//
//        //Execute
////        m1.getFlight();
//        List<Flight> actual = m1.getFlight();
//        //Assert
//        Assert.assertEquals(actual, expected);
//
//    }

    @Test
    public void testObject() throws Exception {
        this.mvc.perform(
                get("http://localhost:8080/json/Passengers")
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].firstName", is("Jeff")))
                .andExpect(jsonPath("$[0].lastName", is("Bezos")));
    }

}
