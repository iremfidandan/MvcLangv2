using System;
using System.Collections.Generic;
using System.Web.Mvc;
using System.ComponentModel.DataAnnotations;

namespace SportStore.ViewModels{
	public class CartLineViewModel {
		public int CartLineId {get; set;}

		public int Quantity {get; set;}
		

		public int Product_ProductId {get; set;}
		public IEnumerable<SelectListItem> Product {get; set;}

		public int Cart_CartId {get; set;}
		public IEnumerable<SelectListItem> Cart {get; set;}


		public CartLineViewModel(){
		}
	}
}
