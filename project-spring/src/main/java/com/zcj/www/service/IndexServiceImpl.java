package com.zcj.www.service;

import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
	@Override
	public String get(String word) {
		return word;
	}
}
