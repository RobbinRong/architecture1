package com.rong.architechture1.common.service;


import com.rong.architechture1.common.vo.BaseModel;
import com.rong.pageUtil.Page;

public interface IBaseService<M,QM extends BaseModel> {
	public void create(M m);
	public void update(M m);
	public void delete(int uuid);
	
	public M getByUuid(int uuid);
	public Page<M> getByConditionPage(QM qm);
}
