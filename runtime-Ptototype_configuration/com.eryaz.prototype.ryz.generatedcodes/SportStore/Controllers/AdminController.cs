using SportStore.DAL;
using SportStore.Models;
using SportStore.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace SportStore.Controllers{
	public class AdminController : Controller{
		
		private IUnitOfWork _uow;

		public AdminController(IUnitOfWork uow){
			_uow = uow;
		}

		
		[HttpGet]
		public ActionResult Click_CreateProduct(){
			Product Product = new Product();
		
			return View("~/Views/Admin/CreateProductPage.cshtml", Product);
		}

		
		[HttpGet]
		public ActionResult Click_EditProduct(){
			List<Product> Product = _uow.ProductRepository.GetAll().ToList();
			
		
			return View("~/Views/Admin/EditProductPage.cshtml", Product);
		}

		
		[HttpGet]
		public ActionResult Click_DeleteProduct(){
			List<Product> Product = _uow.ProductRepository.GetAll().ToList();
			
		
			return View("~/Views/Admin/DeleteProductPage.cshtml", Product);
		}

		[ValidateAntiForgeryToken]
		[HttpPost]
		public ActionResult CreateProduct(){
			Product Product = new Product();
			TryUpdateModel<Product>(Product, new string[]{nameof(Product.Name), nameof(Product.Category), nameof(Product.Description), nameof(Product.Price)});
			_uow.ProductRepository.Add(Product);
			_uow.Complete();
		
			return View("~/Views/Admin/AdminHomePage.cshtml");
		}

		[ValidateAntiForgeryToken]
		[HttpPost]
		public ActionResult EditProduct(int ProductId){
			Product Product = _uow.ProductRepository.Get(m => (m.ProductId == ProductId));
			TryUpdateModel<Product>(Product, new string[]{nameof(Product.Name), nameof(Product.Category), nameof(Product.Description), nameof(Product.Price)});
			_uow.ProductRepository.Add(Product);
			_uow.Complete();
		
			return View("~/Views/Admin/AdminHomePage.cshtml");
		}

		[ValidateAntiForgeryToken]
		[HttpPost]
		public ActionResult DeleteProduct(int ProductId){
			Product Product = _uow.ProductRepository.Get(m => (m.ProductId == ProductId));
			_uow.ProductRepository.Remove(Product);
			_uow.Complete();
		
			return View("~/Views/Admin/AdminHomePage.cshtml");
		}

		
		[HttpGet]
		public ActionResult GetAdminHomePage(){
		
			return View("~/Views/Admin/AdminHomePage.cshtml");
		}

		
		[HttpGet]
		public ActionResult GetEditProductForm(int ProductId){
			Product Product = _uow.ProductRepository.Get(m => (m.ProductId == ProductId));
		
			return PartialView("~/Views/Admin/EditProductFormPage.cshtml", Product);
		}

		
		[HttpGet]
		public ActionResult GetDeleteProductForm(int ProductId){
			Product Product = _uow.ProductRepository.Get(m => (m.ProductId == ProductId));
		
			return PartialView("~/Views/Admin/DeleteProductFormPage.cshtml", Product);
		}
	}
}
