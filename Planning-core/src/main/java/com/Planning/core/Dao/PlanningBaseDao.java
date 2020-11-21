package com.Planning.core.Dao;

import java.util.List;
import java.util.Map;

import com.googlecode.genericdao.dao.jpa.GenericDAO;
import com.planetsystems.model.utils.utils_model.Status;

public interface PlanningBaseDao<T>extends GenericDAO<T, String> {
/*	
	public T findOne(String id);

	public void create(T entity);

	public T update(T entity);

	public T[] update(T[] entities);

	public void delete(T entity);

	public void deleteById(String entityId);

	public List<T> find();

	public List<T> findByAttributes(Map<String, Object> attributes);
	List<T> searchByPropertyEqual(String property, Object value);*/

		/**
		 * delete entity by changing status to deleted
		 * 
		 * @param entity
		 */
		public void delete(T entity);

		/**
		 * @param type
		 * @param id
		 * @return
		 */
		<T1> T1 getEntityById(Class<T1> type, String id);

		/**
		 * @param entity
		 */
		@SuppressWarnings("hiding")
		<T> void mergeEntity(T entity);

		/**
		 * @see com.googlecode.genericdao.dao.jpa.GenericDAO#save(java.lang.Object)
		 *      this saves entity by adding defaults users, is and dates
		 */

		public T save(T entity);

		/**
		 * @param entity
		 * @return
		 */
		public T saveConsolidatedPlan(T entity);

		/**
		 * Searches by a given property
		 * 
		 * @param property
		 * @param value
		 * @return
		 */
		List<T> searchByPropertyEqual(String property, Object value);

		/**
		 * returns property based on the its status
		 * 
		 * @param property
		 * @param value
		 * @param recordStatus
		 * @return
		 */
		List<T> searchByPropertyEqual(String property, Object value,
				Status recordStatus);

		/**
		 * searches for a list of all entities of a given record status
		 * 
		 * @param recordStatus
		 * @return
		 */
		List<T> searchByRecordStatus(Status recordStatus);

		/**
		 * searches by a unique property like an id
		 * 
		 * @param property
		 * @param value
		 * @return
		 */
		T searchUniqueByPropertyEqual(String property, Object value);

		/**
		 * searches by a unique property like an id
		 * 
		 * @param property
		 * @param value
		 * @return
		 */
		T searchUniqueByPropertyEquals(String property, Object value);

		/**
		 * returns property based on the its status
		 * 
		 * @param property
		 * @param value
		 * @param recordStatus
		 * @return
		 */

		public T update(T entity);

		/**
		 * @param entity
		 */
		@SuppressWarnings("hiding")
		<T> void updateEntity(T entity);
		
		public T edit(T entity);

	}

