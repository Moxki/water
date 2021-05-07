package com.mox.service.impl;

import java.util.List;

import com.mox.service.BaseService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;


import tk.mybatis.mapper.common.Mapper;

public class BaseServiceImpl<M extends Mapper<T>,T> implements BaseService<T> {

	@Autowired
	protected M m;


	@Override
	public T selectOne(T record) {
		return m.selectOne(record);
	}

	@Override
	public List<T> select(T record) {
		return m.select(record);
	}

	@Override
	public List<T> selectAll() {
		return m.selectAll();
	}

	@Override
	public int selectCount(T record) {

		return m.selectCount(record);
	}

	@Override
	public T selectByPrimaryKey(Object key) {

		return m.selectByPrimaryKey(key);
	}

	@Override
	public boolean existsWithPrimaryKey(Object key) {

		return m.existsWithPrimaryKey(key);
	}

	@Override
	public int insert(T record) {

		return m.insert(record);
	}

	@Override
	public int insertSelective(T record) {

		return m.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKey(T record) {

		return m.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {

		return m.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delete(T record) {

		return m.delete(record);
	}

	@Override
	public int deleteByPrimaryKey(Object key) {

		return m.deleteByPrimaryKey(key);
	}

	@Override
	public List<T> selectByExample(Object example) {

		return m.selectByExample(example);
	}

	@Override
	public T selectOneByExample(Object example) {

		return m.selectOneByExample(example);
	}

	@Override
	public int selectCountByExample(Object example) {

		return m.selectCountByExample(example);
	}

	@Override
	public int deleteByExample(Object example) {

		return m.deleteByExample(example);
	}

	@Override
	public int updateByExample(T record, Object example) {

		return m.updateByExample(record, example);
	}

	@Override
	public int updateByExampleSelective(T record, Object example) {

		return m.updateByExampleSelective(record, example);
	}

	@Override
	public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {

		return m.selectByExampleAndRowBounds(example, rowBounds);
	}

	@Override
	public List<T> selectByRowBounds(T record, RowBounds rowBounds) {

		return m.selectByRowBounds(record, rowBounds);
	}
}
