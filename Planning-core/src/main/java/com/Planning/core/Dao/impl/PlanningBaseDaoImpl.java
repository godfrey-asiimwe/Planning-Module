package com.Planning.core.Dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Planning.core.Dao.PlanningBaseDao;
import com.Planning.model.ParentEntity;
import com.googlecode.genericdao.dao.jpa.GenericDAOImpl;
import com.googlecode.genericdao.search.Search;
import com.googlecode.genericdao.search.jpa.JPASearchProcessor;
import com.planetsystems.model.utils.utils_model.Status;

import java.util.Calendar;
import org.apache.commons.lang.StringUtils;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository("PlanningBaseDao")
public class PlanningBaseDaoImpl<T> extends GenericDAOImpl<T, String> implements PlanningBaseDao<T> {

	/*@SuppressWarnings("unused")
	private EntityManager entityManager;

	@Autowired
	@Override
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		super.setEntityManager(entityManager);
		this.entityManager = entityManager;
	}

	@Override
	@Autowired
	public void setSearchProcessor(JPASearchProcessor searchProcessor) {
		super.setSearchProcessor(searchProcessor);
	}

	public T findOne(String id) {
		return super.find(id);
	}

	public List<T> find() {
		Search search = new Search();
		search.copy();
		return search(search);
	}

	public void create(T entity) {
		super.save(entity);
	}

	public T update(T entity) {
		return super.save(entity);
	}

	public void delete(T entity) {
		super.remove(entity);
	}

	public void deleteById(String entityId) {
		super.removeById(entityId);
	}

	public List<T> findByAttributes(Map<String, Object> attributes) {
		return null;
	}

	public T[] update(T[] entities) {
		return super.save(entities);
	}

	public List<T> searchByPropertyEqual(String property, Object value) {
		Search search = new Search();
		search.addFilterEqual(property, value);
		return search(search);
	}
*/
	
	private EntityManager entityManager;

/*	public void delete(T entity) {
		if (entity != null) {
			if (entity instanceof ParentEntity) {
				((ParentEntity) entity).setRecordStatus(Status.DELETED);
				this.save(entity);
			}
		}

	}*/
	
	public void delete(T entity) {
		super.remove(entity);
	}

	public void deleteById(String entityId) {
		super.removeById(entityId);
	}

	public <T1> T1 getEntityById(Class<T1> type, String id) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<T1> criteriaQuery = criteriaBuilder.createQuery(type);
		Root<T1> from = criteriaQuery.from(type);
		criteriaQuery.select(from).where(
				criteriaBuilder.equal(from.get("id"), id));
		return entityManager.createQuery(criteriaQuery).getSingleResult();

	}

	public <T> void mergeEntity(T entity) {
		// TODO Auto-generated method stub
		super._merge(entity);
	}

	@Override
	public T save(T entity) {

		if (entity == null)
			return null;

		if (entity instanceof ParentEntity) {
			if (StringUtils.isBlank(((ParentEntity) entity).getId())) {
				((ParentEntity) entity).setId(null);

				ParentEntity obj = (ParentEntity) entity;
				obj.setDateCreated(Calendar.getInstance().getTime());
				try {
					/*obj.setCreatedBy(ProcnetSecurityUtil.getLoggedInUser());*/
				} catch (Exception e) {
					// log.error(BaseDAOImpl.class.getName(), e);
				}
			}

			else {
				ParentEntity obj = (ParentEntity) entity;
				obj.setDateChanged(Calendar.getInstance().getTime());
				try {
					/*obj.setChangedBy(ProcnetSecurityUtil.getLoggedInUser());*/
				} catch (Exception e) {
					// log.error(BaseDAOImpl.class.getName(), e);
				}
				
			}
		}

		return super.save(entity);
	}

	public T saveConsolidatedPlan(T entity) {
		if (entity == null)
			return null;

		if (entity instanceof ParentEntity) {
			if (StringUtils.isBlank(((ParentEntity) entity).getId())) {
				((ParentEntity) entity).setId(null);

				ParentEntity obj = (ParentEntity) entity;
				obj.setDateCreated(Calendar.getInstance().getTime());
				try {
					/*obj.setCreatedBy(ProcnetSecurityUtil.getLoggedInUser());*/
				} catch (Exception e) {
					// log.error(BaseDAOImpl.class.getName(), e);
				}
			}

		}

		return super.save(entity);
	}

	public List<T> searchAll() {
		Search search = new Search();
		search.copy();
		return search(search);
	}

	public List<T> searchByPropertyEqual(String property, Object value) {
		Search search = new Search();
		search.addFilterEqual(property, value);
		search.addFilterEqual("recordStatus", Status.ACTIVE);
		return search(search);
	}

	public List<T> searchByPropertyEqual(String property, Object value,
			Status recordStatus) {
		Search search = new Search();
		search.addFilterEqual(property, value);
		search.addFilterEqual("recordStatus", recordStatus);
		return search(search);
	}

	public List<T> searchByRecordStatus(Status recordStatus) {
		Search search = new Search();
		search.addFilterEqual("recordStatus", recordStatus);
		return search(search);
	}

	public T searchUniqueByPropertyEqual(String property, Object value) {
		Search search = new Search();
		search.addFilterEqual(property, value);
		search.addFilterEqual("recordStatus", Status.ACTIVE);
		return (T) searchUnique(search);
	}

	public T searchUniqueByPropertyEquals(String property, Object value) {
		Search search = new Search();
		search.addFilterEqual(property, value);
		return (T) searchUnique(search);
	}

	@Autowired
	@Override
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		super.setEntityManager(entityManager);
		this.entityManager = entityManager;
	}

	@Override
	@Autowired
	public void setSearchProcessor(JPASearchProcessor searchProcessor) {
		super.setSearchProcessor(searchProcessor);
	}

	public T update(T entity) {
		return this.save(entity);
	}

	public <T> void updateEntity(T entity) {
		// TODO Auto-generated method stub
		entityManager.merge(entity);
	}
	
	public T edit(T entity) {

		T entityNew = entity;
	
		
		if (entity == null)
			return null;

		if (entity instanceof ParentEntity) {

			// Parent declaration
			((ParentEntity) entity).setRecordStatus(Status.EDITED);
			ParentEntity obj = (ParentEntity) entity;

			obj.setDateChanged(Calendar.getInstance().getTime());
			try {
				/*obj.setChangedBy(ProcnetSecurityUtil.getLoggedInUser());*/
				
				// Child declaration
				((ParentEntity) entityNew).setId(null);
				((ParentEntity) entityNew).setRecordStatus(Status.ACTIVE);
				// Define the child record
				ParentEntity objNew = (ParentEntity) entityNew;
				objNew.setDateCreated(Calendar.getInstance().getTime());
				/*objNew.setCreatedBy(ProcnetSecurityUtil.getLoggedInUser());*/
				
				// Save Child
				super.save(entityNew);
				
			} catch (Exception e) {
				
			}

		}

		// Save Parent
		return super.save(entity);
	}
}
