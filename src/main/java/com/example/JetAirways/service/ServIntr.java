package com.example.JetAirways.service;

import java.util.List;

import com.example.JetAirways.model.JetAirways;

public interface ServIntr
{
	public void save(JetAirways j);
	
	public List<JetAirways> getAll();
	
	public void del(int id);
	
	public JetAirways edit(int id);
	
	public void upd(JetAirways j);
}
