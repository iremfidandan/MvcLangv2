using SportStore.Models;
using System.Data.Entity;
using System.Data.Entity.ModelConfiguration.Conventions;

namespace SportStore.DAL{
	public class SportStoreContext : DbContext{
		public SportStoreContext(){}

		public DbSet<Product> Product { get; set;}
		public DbSet<Cart> Cart { get; set;}
		public DbSet<CartLine> CartLine { get; set;}

		protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Conventions.Remove<PluralizingTableNameConvention>();
            base.OnModelCreating(modelBuilder);
        }
	}
}
