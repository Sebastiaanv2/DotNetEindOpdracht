using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreServerLibrary.daos
{
    public class BaseDAO
    {
        protected WebshopEntities context;

        public BaseDAO()
        {
            context = new WebshopEntities();
        }

        protected string Reverse(string s)
        {
            char[] charArray = s.ToCharArray();
            Array.Reverse(charArray);
            return new string(charArray);
        }
    }
}
