
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Linq.Expressions;

//https://stackoverflow.com/questions/38853944/minimal-repository-implementation-using-entity-framework

namespace SportStore.DAL{
	public class BaseRepository<TEntity> : IRepository<TEntity> where TEntity : class
	{
    	protected DbContext Context { get; private set; }

    	public BaseRepository(DbContext dbContext)
    	{
        	Context = dbContext;
    	}

    	public virtual TEntity Get(Expression<Func<TEntity, bool>> predicate)
    	{
        	return Context.Set<TEntity>().Where(predicate).FirstOrDefault();
    	}

    	public virtual IEnumerable<TEntity> GetAll()
    	{
        	return Context.Set<TEntity>().ToList();
    	}

    	public virtual IEnumerable<TEntity> GetAll(Expression<Func<TEntity, bool>> predicate)
    	{
        	return Context.Set<TEntity>().Where(predicate).ToList();
    	}

    	public void Add(TEntity entity)
    	{
        	var entry = Context.Entry(entity);
        	if(entry.State == EntityState.Detached)
        	{
            	Context.Set<TEntity>().Add(entity);
        	}
        	else
        	{
            	entry.State = EntityState.Modified;
        	}
    	}

    	public void AddAll(IEnumerable<TEntity> entities)
    	{
        	foreach(var entity in entities)
        	{
            	Add(entity);
        	}
    	}

    	public void Remove(TEntity entity)
    	{
        	var entry = Context.Entry(entity);
        	if (entry.State == EntityState.Detached)
        	{
            	Context.Set<TEntity>().Attach(entity);
        	}
        	//Context.Entry<TEntity>(entity).State = EntityState.Deleted;
			Context.Set<TEntity>().Remove(entity);
    	}

    	public void RemoveAll(IEnumerable<TEntity> entities)
    	{
        	foreach (var entity in entities)
        	{
            	Remove(entity);
        	}
    	}
	}
}
