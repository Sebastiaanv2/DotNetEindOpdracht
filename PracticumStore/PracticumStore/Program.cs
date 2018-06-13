using PracticumStore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityFrameworkTest
{
    class Program
    {
        static void Main(string[] args)
        {
            using (var context = new StoreEntities())
            {
                var prd = new product()
                {
                    name = "Geen idee",
                    stock = 80,
                    price = 12.54f
                };
                context.products.Add(prd);

                context.SaveChanges();
            }
        }
    }
}
