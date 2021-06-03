package com.example.demo;


import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


public class TestEmployee extends DemoSpringApplicationTests{
    @Autowired
    private WebApplicationContext webapplicationcontext;
    private MockMvc mockmvc;
    @Before
    public void setUp() {
        mockmvc = MockMvcBuilders.webAppContextSetup(webapplicationcontext).build();
    }
        @Test
        public void testEmployee() throws Exception {
            mockmvc.perform(get("/employee")).andExpect(status().isOk())
                    //.andExpect(content().contentType("application/json;charset=UTF-8"))
                    .andExpect(jsonPath("$.empNo").value(11)).andExpect(jsonPath("$.empName").value("vasu"))
                    .andExpect(jsonPath("$.sal").value(3000));

        }


    }



