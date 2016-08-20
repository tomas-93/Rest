package com.tomas.rest.app.rest.controller;

import com.tomas.rest.config.annotation.Rest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tomas Yussef Galicia Guzman
 *         email: tomasyussef@gmail.com
 *         date: 17/08/2016
 */
@Rest
@RequestMapping(value = "/rest")
public class IndexRestController
{
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = {"/", "/api"},
            method = RequestMethod.OPTIONS,
            produces = {"application/json", "text/json"},
            consumes = {"application/json", "text/json"},
            headers = "content-type=application/json")
    public Map<String , Object> getTest()
    {
        ServletUriComponentsBuilder builder =
                ServletUriComponentsBuilder.fromCurrentServletMapping();

        Map<String, Object> map = new HashMap<>();
        map.put("All-Artistas", builder.path("/rest/music/artist").build().toString());
        return map;
    }
}
