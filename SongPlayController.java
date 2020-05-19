package tech.codingclub.helix.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: rishabh
 */
@Controller
@RequestMapping("/play")
public class SongPlayController extends BaseController {

    private static Logger logger = Logger.getLogger(SongPlayController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/song")
    public String getQuiz(ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {
        return "Song";
    }


}