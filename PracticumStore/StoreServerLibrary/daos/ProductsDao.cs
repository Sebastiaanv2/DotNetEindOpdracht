using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;
using StoreServerLibrary.domain;

namespace StoreServerLibrary.daos
{
    public class ProductsDao : BaseDao, IProductsDao
    {
        public bool BuyProduct(int userId, int productId, int amount)
        {
            throw new NotImplementedException();
        }

        public List<Product> GetProductsInStock()
        {
            List<Product> foundProducts = new List<Product>();

            using (var conn = new MySqlConnection(connString.ToString()))
            using (var command = conn.CreateCommand())
            {
                conn.Open();

                command.CommandText = "SELECT * FROM products WHERE stock > 0";
                using (var reader = command.ExecuteReader())
                {
                    while (reader.Read())
                    {
                        foundProducts.Add(new Product
                        {
                            id = reader.GetInt32("id"),
                            name = reader.GetString("name"),
                            price = reader.GetFloat("price"),
                            stock = reader.GetInt32("stock")
                        });
                    }
                }

                conn.Close();
            }

            return foundProducts;
        }

        public List<Product> GetUserInventory(int userId)
        {
            List<Product> foundProducts = new List<Product>();

            using (var conn = new MySqlConnection(connString.ToString()))
            using (var command = conn.CreateCommand())
            {
                conn.Open();

                command.CommandText = "SELECT p.id as id, p.name as name, p.price as price, p.stock as stock FROM products p JOIN inventory i ON i.product_id = p.id WHERE i.user_id = @userId";
                command.Parameters.AddWithValue("@userId", userId);
                command.Prepare();
                using (var reader = command.ExecuteReader())
                {
                    while (reader.Read())
                    {
                        foundProducts.Add(new Product
                        {
                            id = reader.GetInt32("id"),
                            name = reader.GetString("name"),
                            price = reader.GetFloat("price"),
                            stock = reader.GetInt32("stock")
                        });
                    }
                }

                conn.Close();
            }

            return foundProducts;
        }
    }
}
