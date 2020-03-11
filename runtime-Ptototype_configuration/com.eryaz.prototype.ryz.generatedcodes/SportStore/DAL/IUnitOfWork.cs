
using SportStore.Models;
using System;

//https://stackoverflow.com/questions/38853944/minimal-repository-implementation-using-entity-framework

namespace SportStore.DAL{
	public interface IUnitOfWork : IDisposable
	{
		IRepository<Product> ProductRepository {get;}
		IRepository<Cart> CartRepository {get;}
		IRepository<CartLine> CartLineRepository {get;}

		void Complete();
	}
}
