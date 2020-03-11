using SportStore.DAL;
using SportStore.Models;
using SportStore.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace SportStore.Controllers{
	public class ProductController : Controller{
		
		private IUnitOfWork _uow;

		public ProductController(IUnitOfWork uow){
			_uow = uow;
		}

		
		[HttpGet]
		public ActionResult GetProductList(string Category){
		
			return PartialView("~/Views/Shared/ProductListPage.cshtml", _uow.ProductRepository.GetAll(m => (m.Category == Category))
			);
		}

		
		[HttpGet]
		public ActionResult GetProductCategoryList(){
		
			return View("~/Views/Product/ProductCategoryListPage.cshtml", _uow.ProductRepository.GetAll()
			);
		}
	}
}
