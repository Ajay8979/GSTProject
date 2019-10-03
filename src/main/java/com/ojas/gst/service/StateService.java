package com.ojas.gst.service;

import java.util.List;


import com.ojas.gst.entity.State;

public interface StateService {

	State createState(State state);

	List<State> getAllStates();

	State getStateById(Long taxPayersTypeId);

	int deleteStateById(State category);

	State updateState(State category);

	
}
