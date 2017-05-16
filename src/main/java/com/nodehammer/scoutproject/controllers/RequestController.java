package com.nodehammer.scoutproject.controllers;


import com.nodehammer.scoutproject.models.PlayerData;
import com.nodehammer.scoutproject.models.Prospects;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Darren on 5/12/2017.
 */

@Controller
@RequestMapping("pages")
public class RequestController {



    // Request path: /prospects
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("players", PlayerData.getAll());
        model.addAttribute("title", "My Prospects");

        return "pages/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddPlayerForm(Model model) {
        model.addAttribute("title", "Add Prospect");
        return "pages/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddPlayerForm(@ModelAttribute Prospects newPlayer) {
        PlayerData.add(newPlayer);

        return "redirect:";


    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemovePlayerForm(Model model) {
        model.addAttribute("players", PlayerData.getAll());
        model.addAttribute("title", "Remove Player");
        return "pages/remove";
    }
    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemovePlayerForm(@RequestParam int[] playerIds){

        for (int playerId : playerIds){
            PlayerData.remove(playerId);
        }
                return "redirect:";
    }
}