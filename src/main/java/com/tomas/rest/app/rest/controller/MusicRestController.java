package com.tomas.rest.app.rest.controller;

import com.tomas.rest.app.core.services.MusicServices;
import com.tomas.rest.config.annotation.Rest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.inject.Inject;
import java.util.Map;

/**
 * @author Tomas Yussef Galicia Guzman
 *         email: tomasyussef@gmail.com
 *         date: 17/08/2016
 */
@Rest
@RequestMapping(value = "/rest/music")
public class MusicRestController
{
    @Inject
    private MusicServices musicServices;
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = {"/", "/artist"},
            method = RequestMethod.GET,
            produces = {"application/json", "text/json"},
            consumes = {"application/json", "text/json"},
            headers = "content-type=application/json"
    )
    public Map<String , Object> getTest()
    {
        return this.musicServices.getAll();
    }
}
