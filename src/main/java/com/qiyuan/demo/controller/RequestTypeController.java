package com.qiyuan.demo.controller;


import org.springframework.stereotype.Component;

import javax.ws.rs.*;

@Component
@Path("/requestType")
public class RequestTypeController {

    @DELETE
    public void delete(){

    }

    @PUT
    public void put(){

    }

    @HEAD
    public void head(){

    }

    @OPTIONS
    public void options(){

    }

}
