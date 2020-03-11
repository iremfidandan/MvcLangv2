using System;
using System.Collections.Generic;
using System.Web.Mvc;
using System.ComponentModel.DataAnnotations;

namespace SportStore.ViewModels{
	public class CartViewModel {
		public int CartId {get; set;}

		public int TotalValue {get; set;}

		public List<int> CartLines_CartLineId {get; set;} = new List<int>();
		public IEnumerable<SelectListItem> CartLines {get; set;}


		public CartViewModel(){
		}
	}
}
