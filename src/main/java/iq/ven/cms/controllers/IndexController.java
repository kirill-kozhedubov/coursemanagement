package iq.ven.cms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping(path = {"/login"}, method = RequestMethod.GET)
    public String tryToLogIn(HttpServletRequest request) {
/*        dsaUser user = (dsaUser) request.getSession().getAttribute("userObject");
        if (user!=null) {
            if (user.getUserType().equals(UserTypes.ADMIN)) {
                return "redirect:/user/admin-panel";
            }
            if (user.getUserType().equals(UserTypes.REGULAR_USER)) {
                return "redirect:/user/dashboard-get";
            }
        }*/
        return "authorization";
    }

    @RequestMapping(path = {"/", ""}, method = RequestMethod.GET)
    public String getIndex(Model model) {
        return "index";
    }

}
