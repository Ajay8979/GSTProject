package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.StateDao;
import com.ojas.gst.entity.State;
import com.ojas.gst.service.StateService;

public class StateServiceImpl implements StateService{

	@Autowired
	private StateDao stateDao;
	
	
	@Override
	public State createState(State state) {
		return stateDao.save(state);
	}

	@Override
	public List<State> getAllStates() {
		return stateDao.getAllStates();
	}

	@Override
	public State getStateById(Long taxPayersTypeId) {
		return stateDao.find(taxPayersTypeId);
	}

	@Override
	public int deleteStateById(State state) {
		return  stateDao.deleteById(state);
	}

	@Override
	public State updateState(State state) {
		return stateDao.save(state);
	}

}
