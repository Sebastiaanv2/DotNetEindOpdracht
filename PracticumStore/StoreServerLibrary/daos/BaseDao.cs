using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreServerLibrary.daos
{
    public class BaseDao
    {
        protected MySqlConnectionStringBuilder connString;

        public BaseDao()
        {
            connString = new MySqlConnectionStringBuilder();
            connString.Server = "localhost";
            connString.UserID = "root";
            connString.Password = "";
            connString.Database = "entityframework";
        }
    }
}
