using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using StoreServerLibrary.dto;

namespace StoreServerLibrary.daos
{
    public class ProductDAO : BaseDAO, IProductDAO
    {
        public List<ProductDTO> GetAllProducts()
        {
            return AutoMapper.Mapper.Map<List<product>, List<ProductDTO>>(context.products.ToList());
        }

        public ProductDTO GetProduct(int productId)
        {
            var foundProduct = context.products.First(p => p.id == productId);

            return AutoMapper.Mapper.Map<product, ProductDTO>(foundProduct);
        }

        public ProductDTO UpdateProduct(ProductDTO newProduct)
        {
            // Find product by id
            var foundProduct = context.products.SingleOrDefault(p => p.id == newProduct.id);

            // Update found product
            foundProduct.name = newProduct.name;
            foundProduct.price = newProduct.price;
            foundProduct.stock = newProduct.stock;

            // Save found product
            context.SaveChanges();

            // Return new product
            return AutoMapper.Mapper.Map<product, ProductDTO>(foundProduct);
        }
    }
}
