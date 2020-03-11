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
			ProductViewModel ProductViewModel = new ProductViewModel();
			ProductViewModel.CartLines = new MultiSelectList(_uow.CartLineRepository.GetAll(), "CartLineId", "CartLineId", ProductViewModel.CartLines_CartLineId);
			
		
			return View("~/Views/Admin/CreateProductPage.cshtml", ProductViewModel
			);
		}

		
		[HttpGet]
		public ActionResult Click_EditProduct(int ProductId){
			Product Product = _uow.ProductRepository.Get(m => (m.ProductId == ProductId));
			ProductViewModel ProductViewModel = new ProductViewModel();
			ProductViewModel.ProductId = Product.ProductId;
			
			
			ProductViewModel.Name = Product.Name;
			
			ProductViewModel.Category = Product.Category;
			
			ProductViewModel.Description = Product.Description;
			
			ProductViewModel.Price = Product.Price;
			
			ProductViewModel.CartLines_CartLineId = Product.CartLines.Select(m => m.CartLineId).ToList();
			
			
			
			
			ProductViewModel.CartLines = new MultiSelectList(_uow.CartLineRepository.GetAll(), "CartLineId", "CartLineId", ProductViewModel.CartLines_CartLineId);
			
		
			return View("~/Views/Admin/EditProductPage.cshtml", ProductViewModel
			);
		}

		
		[HttpGet]
		public ActionResult Click_DeleteProduct(int ProductId){
			Product Product = _uow.ProductRepository.Get(m => (m.ProductId == ProductId));
		
			return View("~/Views/Admin/DeleteProductPage.cshtml", Product
			);
		}

		[ValidateAntiForgeryToken]
		[HttpPost]
		public ActionResult CreateProduct([Bind(Include = "Name,Category,Description,Price")]ProductViewModel ProductViewModel){
			Product Product = new Product();
			
			
			Product.Name = ProductViewModel.Name;
			
			Product.Category = ProductViewModel.Category;
			
			Product.Description = ProductViewModel.Description;
			
			Product.Price = ProductViewModel.Price;
			
			Product.CartLines = _uow.CartLineRepository.GetAll(m => ProductViewModel.CartLines_CartLineId.Contains(m.CartLineId)).ToList();
			
			
			
			
			_uow.ProductRepository.Add(Product);
			_uow.Complete();
		
			return View("~/Views/Admin/AdminHomePage.cshtml", _uow.ProductRepository.GetAll()
			);
		}

		[ValidateAntiForgeryToken]
		[HttpPost]
		public ActionResult EditProduct([Bind(Include = "Name,Category,Description,Price")]ProductViewModel ProductViewModel, int ProductId){
			Product Product = _uow.ProductRepository.Get(m => (m.ProductId == ProductId));
			
			
			Product.Name = ProductViewModel.Name;
			
			Product.Category = ProductViewModel.Category;
			
			Product.Description = ProductViewModel.Description;
			
			Product.Price = ProductViewModel.Price;
			
			Product.CartLines = _uow.CartLineRepository.GetAll(m => ProductViewModel.CartLines_CartLineId.Contains(m.CartLineId)).ToList();
			
			
			
			
			_uow.ProductRepository.Add(Product);
			_uow.Complete();
		
			return View("~/Views/Admin/AdminHomePage.cshtml", _uow.ProductRepository.GetAll(m => (m.ProductId == ProductId))
			);
		}

		[ValidateAntiForgeryToken]
		[HttpPost]
		public ActionResult DeleteProduct(int ProductId){
			Product Product = _uow.ProductRepository.Get(m => (m.ProductId == ProductId));
			_uow.ProductRepository.Remove(Product);
			_uow.Complete();
		
			return View("~/Views/Admin/AdminHomePage.cshtml", _uow.ProductRepository.GetAll(m => (m.ProductId == ProductId))
			);
		}

		
		[HttpGet]
		public ActionResult GetAdminHomePage(){
			List<Product> Product = _uow.ProductRepository.GetAll().ToList();
		
			return View("~/Views/Admin/AdminHomePage.cshtml", Product
			);
		}
	}
}
