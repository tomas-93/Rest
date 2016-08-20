package com.tomas.rest.app.web;

import com.tomas.rest.config.annotation.Web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author Tomas Yussef Galicia Guzman
 *         email: tomasyussef@gmail.com
 *         date: 18/08/2016
 */
@Web
public class IndexController
{
    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public View getIndex()
    {
        return new RedirectView("/music/test");
    }
}
