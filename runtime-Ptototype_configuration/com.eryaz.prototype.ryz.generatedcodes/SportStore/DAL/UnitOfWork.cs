using System;
using SportStore.Models;

//https://stackoverflow.com/questions/38853944/minimal-repository-implementation-using-entity-framework

namespace SportStore.DAL{
	public class UnitOfWork : IUnitOfWork
	{
    	private readonly SportStoreContext _dbContext;

		private IRepository<Product> _ProductRepository;

		private IRepository<Cart> _CartRepository;

		private IRepository<CartLine> _CartLineRepository;

    	public UnitOfWork(SportStoreContext dbContext)
    	{
        	_dbContext = dbContext;

			_ProductRepository = new BaseRepository<Product>(_dbContext);

			_CartRepository = new BaseRepository<Cart>(_dbContext);

			_CartLineRepository = new BaseRepository<CartLine>(_dbContext);
    	}

		public IRepository<Product> ProductRepository
		{
			get
			{
				return _ProductRepository;
			}
		}

		public IRepository<Cart> CartRepository
		{
			get
			{
				return _CartRepository;
			}
		}

		public IRepository<CartLine> CartLineRepository
		{
			get
			{
				return _CartLineRepository;
			}
		}
		
    	public void Complete()
    	{
        	_dbContext.SaveChanges();
    	}

    	public void Dispose()
    	{
        	_dbContext.Dispose();
    	}
	}
}
