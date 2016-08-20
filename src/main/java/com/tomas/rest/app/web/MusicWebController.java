package com.tomas.rest.app.web;

import com.tomas.rest.app.core.repository.Dao;
import com.tomas.rest.app.core.services.MusicServices;
import com.tomas.rest.config.annotation.Web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.Map;

/**
 * @author Tomas Yussef Galicia Guzman
 *         email: tomasyussef@gmail.com
 *         date: 17/08/2016
 */
@Web
@RequestMapping(value = "/music")
public class MusicWebController
{
    @Inject
    private MusicServices musicServices;
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map<String, Object> getTest()
    {
        return musicServices.getAll();
    }
}
