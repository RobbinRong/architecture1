package com.rong.architechture1.common.service;

import com.rong.architechture1.common.dao.BaseDAO;
import com.rong.architechture1.common.vo.BaseModel;
import com.rong.pageUtil.Page;

import java.util.List;



public class BaseService<M, QM extends BaseModel> implements com.rong.architechture1.common.service.IBaseService<M,QM> {
	private BaseDAO dao = null;
	public void setDAO(BaseDAO dao){
		this.dao = dao;
	}
	public void create(M m) {
		dao.create(m);
	}

	public void update(M m) {
		dao.update(m);
	}

	public void delete(int uuid) {
		dao.delete(uuid);
	}

	public M getByUuid(int uuid) {
		return (M)dao.getByUuid(uuid);
	}

	public Page<M> getByConditionPage(QM qm) {
		List<M> list = dao.getByConditionPage(qm);
		qm.getPage().setResult(list);
		
		return qm.getPage();
	}
}
