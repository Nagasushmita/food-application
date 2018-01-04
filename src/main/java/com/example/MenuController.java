package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MenuController {

   @Autowired
   MenuRepository menuRepository;

@GetMapping("/")
    public List<MenuCard> getAllItems(){
    List<MenuCard> list=new ArrayList<MenuCard>();
    menuRepository.findAll().forEach(list::add);
    return list;
}
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    MenuCard findById(@PathVariable("id") int id) {
        return  menuRepository.findOne(id);
    }

@RequestMapping(method = RequestMethod.POST,path="/")
    public void addItemToMenu(@RequestBody MenuCard menuCard){
    menuRepository.save(menuCard);
}
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") int id) {
        menuRepository.delete(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    MenuCard update(@RequestBody MenuCard menuCard) {
        menuRepository.save(menuCard);
        return menuCard;
    }

}
