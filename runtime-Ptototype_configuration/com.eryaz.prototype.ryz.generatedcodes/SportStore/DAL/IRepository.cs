using System;
using System.Collections.Generic;
using System.Linq.Expressions;

//https://stackoverflow.com/questions/38853944/minimal-repository-implementation-using-entity-framework

namespace SportStore.DAL{
	public interface IRepository<TEntity> where TEntity : class
	{
    	TEntity Get(Expression<Func<TEntity, bool>> predicate);
    	IEnumerable<TEntity> GetAll();
    	IEnumerable<TEntity> GetAll(Expression<Func<TEntity, bool>> predicate);

    	void Add(TEntity entity);
   	 	void AddAll(IEnumerable<TEntity> entities);

    	void Remove(TEntity entity);
    	void RemoveAll(IEnumerable<TEntity> entities);
	}
}
