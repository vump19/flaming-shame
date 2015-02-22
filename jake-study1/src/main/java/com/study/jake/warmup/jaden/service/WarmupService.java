package com.study.jake.warmup.jaden.service;

import com.study.jake.warmup.common.model.SampleUserForm;
import com.study.jake.warmup.common.model.SampleUserView;

/**
 * @author 	Jaden.Lee
 * @file 			WarmupService.java
 * @Since 		February 04, 2015.
 * @version 	1.0.0
 */
public interface WarmupService {
	
	SampleUserView insertSampleUser(SampleUserForm form);

}
