package com.example.JetAirways.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JetAirways.model.JetAirways;
import com.example.JetAirways.repos.Repos;

@Service 
public class ServImpl implements ServIntr
{

	@Autowired
	Repos r;
	
	@Override
	public void save(JetAirways j)
	{
		r.save(j);
	}

	@Override
	public List<JetAirways> getAll()
	{
		List<JetAirways>j=(List<JetAirways>)r.findAll();
		return j; 
	}

	@Override
	public void del(int id)
	{
		r.deleteById(id);
	}

	@Override
	public JetAirways edit(int id)
	{
		Optional<JetAirways> j=r.findById(id);
		return j.get();
	}

	@Override
	public void upd(JetAirways j) 
	{
		r.save(j);
	}

}
