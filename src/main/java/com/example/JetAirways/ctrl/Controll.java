package com.example.JetAirways.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.JetAirways.model.JetAirways;
import com.example.JetAirways.service.ServImpl;

@RestController
public class Controll 
{
	@Autowired
	ServImpl i;
	
	@RequestMapping(value="/JetAirways",consumes="Application/json",method=RequestMethod.POST)
	public void save(@RequestBody JetAirways j)
	{
		i.save(j);
	}
	
	@RequestMapping(value="/JetAirways",consumes="Application/json",method=RequestMethod.GET)
	public List<JetAirways> getAll()
	{
		return i.getAll();
	}
	
	@RequestMapping(value="/JetAirways/{id}",consumes="Application/json",method=RequestMethod.DELETE)
	public void del(@PathVariable int id)
	{
		i.del(id);
	}
	
	@RequestMapping(value="/JetAirways/{id}",consumes="Application/json",method=RequestMethod.GET)
	public JetAirways edit(@PathVariable int id)
	{
		return i.edit(id);	
	}
	
	@RequestMapping(value="/JetAirways/up",consumes="Application/json",method=RequestMethod.POST)
	public void update(@RequestBody JetAirways j)
	{
		i.upd(j);
	}
}

