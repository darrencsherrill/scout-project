package com.nodehammer.scoutproject.controllers;


import com.nodehammer.scoutproject.models.Prospects;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

/**
 * Created by Darren on 5/12/2017.
 */

@Controller
@RequestMapping("pages")
public class RequestController {

    static ArrayList<Prospects> players = new ArrayList<>();

    // Request path: /prospects
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("players", players);
        model.addAttribute("title", "My Prospects");

        return "pages/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddPlayerForm(Model model) {
        model.addAttribute("title", "Add Prospect");
        return "pages/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddPlayerForm(@RequestParam String playerName,
                                       @RequestParam String playerBios) {
        Prospects newPlayer = new Prospects(playerName, playerBios);
        players.add(newPlayer);

        return "redirect:";


    }


}