package com.example.test_ejb.controller;

import com.example.test_ejb.model.CandidateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;

@Controller
public class ActionController {
    @Autowired
    private CandidateModel candidate;

    @RequestMapping(path = "/candidate/list", method = RequestMethod.GET)
    public String getListFood(Model model, @RequestParam(defaultValue = "1") int page,
                              @RequestParam(defaultValue = "10") int limit) {
        model.addAttribute("pagination", candidate.findAll(PageRequest.of(page - 1, limit)));
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        model.addAttribute("datetime", Calendar.getInstance().getTime());
        return "list";
    }
}
