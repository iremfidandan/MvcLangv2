using SportStore.DAL;
using SportStore.Models;
using SportStore.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace SportStore.Controllers{
	public class CartController : Controller{
		
		private IUnitOfWork _uow;

		public CartController(IUnitOfWork uow){
			_uow = uow;
		}

		
		[HttpGet]
		public ActionResult Click_AddToCart(int ProductId, int CartId){
			CartLine CartLine = new CartLine();
			Product Product = _uow.ProductRepository.Get(m => (m.ProductId == ProductId));
			
		
			Cart Cart = _uow.CartRepository.Get(m => (m.CartId == CartId));
			
		
			return View("~/Views/Cart/AddToCartPage.cshtml", CartLine);
		}

		
		[HttpGet]
		public ActionResult RemoveFromCart(int Product_ProductId, int Cart_CartId){
			CartLine CartLine = _uow.CartLineRepository.Get(m => (m.Cart_CartId == Cart_CartId) && (m.Product_ProductId == Product_ProductId));
		
			return View("~/Views/Cart/RemoveFromCartPage.cshtml", CartLine);
		}

		
		[HttpGet]
		public ActionResult Click_CheckOut(int Cart_CartId){
			List<CartLine> CartLine = _uow.CartLineRepository.GetAll(m => (m.Cart_CartId == Cart_CartId)).ToList();
		
			return View("~/Views/Cart/CheckoutPage.cshtml", CartLine);
		}

		[ValidateAntiForgeryToken]
		[HttpPost]
		public ActionResult AddToCart(){
			CartLine CartLine = new CartLine();
			TryUpdateModel<CartLine>(CartLine, new string[]{nameof(CartLine.Quantity)});
			_uow.CartLineRepository.Add(CartLine);
			_uow.Complete();
		
			return View("~/Views/Cart/CartHomePage.cshtml");
		}

		[ValidateAntiForgeryToken]
		[HttpPost]
		public ActionResult RemoveFromCart(int CartLineId){
			CartLine CartLine = _uow.CartLineRepository.Get(m => (m.CartLineId == CartLineId));
			_uow.CartLineRepository.Remove(CartLine);
			_uow.Complete();
		
			return View("~/Views/Cart/CartHomePage.cshtml");
		}

		[ValidateAntiForgeryToken]
		[HttpPost]
		public ActionResult Checkout(List<int> CartLineId){
			List<CartLine> CartLine = _uow.CartLineRepository.GetAll(m => (CartLineId.Contains(m.CartLineId))).ToList();
			_uow.CartLineRepository.RemoveAll(CartLine);
			_uow.Complete();
		
			return View("~/Views/Cart/CartHomePage.cshtml");
		}
	}
}
