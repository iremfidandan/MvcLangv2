using System;
using System.Collections.Generic;
using System.Web.Mvc;
using System.ComponentModel.DataAnnotations;

namespace SportStore.ViewModels{
	public class ProductViewModel {
		public int ProductId {get; set;}

		[Required]
		public string Name {get; set;}

		[Required]
		public string Category {get; set;}

		[Required]
		public string Description {get; set;}

		public int Price {get; set;}

		public List<int> CartLines_CartLineId {get; set;} = new List<int>();
		public IEnumerable<SelectListItem> CartLines {get; set;}


		public ProductViewModel(){
		}
	}
}
