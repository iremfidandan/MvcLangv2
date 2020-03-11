using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace SportStore.Models{
	public class Product{
		[Required]
		public string Name {get; set;}

		[Required]
		public string Category {get; set;}

		[Required]
		public string Description {get; set;}

		public int Price {get; set;}
		

		[Key]
		public int ProductId {get; set;}

		[InverseProperty("Product")]
		public virtual ICollection<CartLine> CartLines {get; set;}

		public Product(){
			CartLines = new HashSet<CartLine>();
		}
	}
}
