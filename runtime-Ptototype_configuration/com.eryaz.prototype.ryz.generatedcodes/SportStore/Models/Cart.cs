using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace SportStore.Models{
	public class Cart{
		public int TotalValue {get; set;}

		[Key]
		public int CartId {get; set;}

		[InverseProperty("Cart")]
		public virtual ICollection<CartLine> CartLines {get; set;}

		public Cart(){
			CartLines = new HashSet<CartLine>();
		}
	}
}
