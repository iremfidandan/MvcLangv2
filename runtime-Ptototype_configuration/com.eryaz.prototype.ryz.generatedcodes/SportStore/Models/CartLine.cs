using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace SportStore.Models{
	public class CartLine{
		public int Quantity {get; set;}

		[Key]
		public int CartLineId {get; set;}

		[ForeignKey("Product")]
		public int Product_ProductId {get; set;}

		[ForeignKey("Cart")]
		public int Cart_CartId {get; set;}

		public Cart Cart {get; set;}

		public Product Product {get; set;}

		public CartLine(){
		}
	}
}
