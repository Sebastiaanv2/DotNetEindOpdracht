using StoreServerLibrary.domain;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreServerLibrary.daos
{
    interface IUserDao
    {
        bool Register(string username);
        User Login(string username, string password);
    }
}
