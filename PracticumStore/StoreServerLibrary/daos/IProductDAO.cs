using StoreServerLibrary.dto;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreServerLibrary.daos
{
    public interface IProductDAO
    {
        ProductDTO GetProduct(int productId);
        List<ProductDTO> GetAllProducts();
        ProductDTO UpdateProduct(ProductDTO newProduct);
    }
}
