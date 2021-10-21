package com.wolken.marketsex.dao;

import com.wolken.marketsex.entity.MarketsDetailsEntity;

public interface MarketDAO
{
	boolean save(MarketsDetailsEntity details);
	void getByid(int id);
    boolean update(MarketsDetailsEntity details);
	boolean delete(MarketsDetailsEntity details);
}
