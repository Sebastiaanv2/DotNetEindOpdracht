using StoreServerLibrary.dto;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreServerLibrary.helper
{
    class MappingConfig
    {
        public static void RegisterMaps()
        {
            AutoMapper.Mapper.Reset();
            AutoMapper.Mapper.Initialize(config =>
            {
                config.CreateMap<user, UserDTO>().ForMember(dto => dto.inventory, opt => opt.MapFrom(x => x.inventories.ToList()));
                config.CreateMap<UserDTO, user>().ForMember(ent => ent.inventories, dto => dto.MapFrom(x => x.inventory.ToList()));
                config.CreateMap<product, ProductDTO>();
                config.CreateMap<ProductDTO, product>();
                config.CreateMap<inventory, InventoryDTO>();
                config.CreateMap<InventoryDTO, inventory>();
            });
        }
    }
}
